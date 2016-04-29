/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page
import javax.inject.Inject
import java.util.List
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Link
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Graph
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Tile
import java.util.Random

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VizualizerGenerator extends AbstractGenerator {

	@Inject Precompile precompile
	@Inject Postcompile postcompile
	@Inject TileColor colorClass;
	@Inject Random random;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		precompile.precompile(resource, fsa);
		
		var List<String> pageNames = newArrayList	
		
		for(p: resource.allContents.toIterable.filter(Page)) {
			pageNames.add(p.name)
			
			//generate HTML template:
			fsa.generateFile(
				"templates\\" + p.name + ".html",
				p.compileTemplateHTML
			)
			
    	}
    	
    	postcompile.postcompile(fsa, pageNames)
	}
	
	
	def compileTemplateHTML(Page p)
	'''
	{% extends 'base.html' %}
	{% block content %}
	<div class="tile-area fg-white tile-area-scheme-dark">
		<h1 class="tile-area-title">�p.name�</h1>
		<div class="tile-area-controls">
		</div>
		<div class="tile-group double">
			<span class="tile-group-title">General</span>
			<div class="tile-container">
				�FOR t:p.getTiles()�
					�t.compile(colorClass.getColor(random.ints(0,39).findFirst().asInt))�			
				�ENDFOR�
			</div>
		</div>
		<div class="tile-group double">
			<span class="tile-group-title">Links</span>
			<div class="tile-container">
				�FOR l:p.getTiles()�
					�IF l instanceof Link�
						�l.compile(colorClass.getColor(random.ints(0,39).findFirst().asInt))�
					�ENDIF�
				�ENDFOR�
			</div
		</div>
	</div>
	{% endblock %}
	'''
	
	def dispatch compile(Link link, CharSequence colorClass)
	'''
	<div class="tile-small �colorClass� fg-white" onclick="document.location.href='/�link.page.name�/'">
		<div class="tile-content">
			<span>�link.name�<span>
		</div>
	</div>
	'''
	
	def dispatch compile(Graph graph, CharSequence colorClass)
	'''
	<div class="tile-large �colorClass� fg-white">
		<div class="tile-content chart" id="�graph.name�" data-graph-content="{{graph_data}}">
		</div>
		<span class="tile-label">�graph.name�<span>
	</div>
	<script type="text/javascript">
				console.log("chart script start");
				var width = $("#�graph.name�").parent().width();
				var height = $("#�graph.name�").parent().height();
				var margin = {top: (height/100)*10, right: (width/100)*5, bottom: (height/100)*10, left: (width/100)*15};
	
				width +=- margin.left - margin.right;
				height += - margin.top - margin.bottom;
				
				
				var parseDate = d3.time.format("%d-%b-%y").parse;
				
				var x = d3.time.scale()
				    .range([0, width]);
				
				var y = d3.scale.linear()
				    .range([height, 0]);
				
				
				var xAxis = d3.svg.axis()
				    .scale(x)
				    .orient("bottom");
				
				var yAxis = d3.svg.axis()
				    .scale(y)
				    .orient("left");
				
				var area = d3.svg.area()
				    .x(function(d) { return x(d.date); })
				    .y0(height)
				    .y1(function(d) { return y(d.close); });
				
				var svg = d3.select("#�graph.name�").append("svg")
				    .attr("width", width + margin.left + margin.right)
				    .attr("height", height + margin.top + margin.bottom)
				  .append("g")
				    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
				
				
				csv = $("#�graph.name�").data().graphContent.split("'").join("").split(", ").join("\n").replace('[', '').replace(']','').split("\\n").join("");
				
				//parse csv
	  			var lines=csv.split("\n");
	  			var result = [];
	  			var headers=lines[0].split(",");
	  			for(var i=1;i<lines.length;i++){
	
		  			var obj = {};
		  			var currentline=lines[i].split(",");
	
		  			for(var j=0;j<headers.length;j++){
			  			obj[headers[j]] = currentline[j];
		  			}
	
		  			result.push(obj);
	  			}
	  
	  			data = result;
	
				data.forEach(function(d) {
				  d.date = parseDate(d.date);
				  d.close = +d.close;
				}
				);
				
				
				x.domain(d3.extent(data, function(d) { return d.date; }));
				y.domain([0, d3.max(data, function(d) { return d.close; })]);
				
				svg.append("path")
				    .datum(data)
				    .attr("class", "area")
				    .attr("d", area);
				
				svg.append("g")
				    .attr("class", "x axis")
				    .attr("transform", "translate(0," + height + ")")
				    .call(xAxis);
				
				svg.append("g")
				    .attr("class", "y axis")
				    .call(yAxis)
				  .append("text")
				    .attr("transform", "rotate(-90)")
				    .attr("y", 6)
				    .attr("dy", ".71em")
				    .style("text-anchor", "end")
				    .text("Price ($)");	
	</script>
	'''
}
