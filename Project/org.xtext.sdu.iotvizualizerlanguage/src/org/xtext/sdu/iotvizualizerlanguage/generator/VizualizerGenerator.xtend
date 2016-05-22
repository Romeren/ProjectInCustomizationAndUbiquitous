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
import java.util.Random
import org.eclipse.emf.ecore.EObject
import java.util.HashMap
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
	@Inject ApiGenerator apigen;
	@Inject DataHandleGenerator dataHandleGenerator;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		precompile.precompile(resource, fsa);
		
		//apigen.doGenerate(resource, fsa, context);
		dataHandleGenerator.doGenerate(resource, fsa, context);
		
		var List<String> pageNames = newArrayList	
		val colorMap = <EObject, String>newHashMap()
		
		fsa.generateFile("templates/style.css", compileStylesheet)
		for(p: resource.allContents.toIterable.filter(Page)) {
			
			pageNames.add(p.name)
			
			//generate HTML template:
			fsa.generateFile(
				"templates/" + p.name + ".html",
				p.compileTemplateHTML(colorMap)
			)
			
    	}
    	
    	postcompile.doGenerate(resource, fsa, context, pageNames)
	}
	
	def compileStylesheet()
	'''
	path { 
		stroke: steelblue;
		stroke-width: 2;
		fill: none;
	}

	.axis path,
	.axis line {
		fill: none;
		stroke: grey;
		stroke-width: 1;
		shape-rendering: crispEdges;
	}

	.legend {
		font-size: 16px;         
		font-weight: bold;         
		text-anchor: start;
		}
	'''
	
	def compileTemplateHTML(Page p, HashMap<EObject, String>  colorMap)
	'''
	{% extends 'base.html' %}
	{% block content %}
	<div class="tile-area fg-white tile-area-scheme-dark">
		<style>
			path { 
				stroke-width: 2;
				fill: none;
			}
		
			.axis path,
			.axis line {
				fill: none;
				stroke: grey;
				stroke-width: 1;
				shape-rendering: crispEdges;
			}
		
			.legend {
				font-size: 16px;         
				font-weight: bold;         
				text-anchor: start;
				}
		</style>
		<h1 class="tile-area-title">�p.name�</h1>
		<div class="tile-area-controls">
			�FOR l:p.getTiles().filter(Link)�
				�IF !colorMap.containsKey(l)�
				�colorMap.put(l, colorClass.getColor(random.ints(0, colorClass.colors.length()).findFirst.asInt).toString())�
				�ENDIF�
				�compileControlButton(l, colorMap.get(l))�
			�ENDFOR�
		</div>
		<div class="tile-group">
			<span class="tile-group-title">General</span>
			<div class="tile-container">
				�FOR t:p.getTiles().filter(Graph)�
				�IF !colorMap.containsKey(t)�
				�colorMap.put(t, colorClass.getColor(random.ints(0,colorClass.colors.length()).findFirst.asInt).toString())�
				�ENDIF�
				�t.compile(colorMap.get(t))�
				�ENDFOR�
			</div>
		</div>
	</div>
	{% endblock %}
	'''
	
	def compileControlButton(Link link, CharSequence colorClass)
	'''
	<a class="image-button �colorClass� fg-white bg-hover-dark no-border" href='/�link.page.name�/'>�link.name�</a>
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
		<div class="tile-content chart" id="�graph.name�" data-graph-content="{{graph_data_�graph.name�}}" onclick="repaint�graph.name�()">
		</div>
		<span class="tile-label">�graph.name�<span>
	</div>
	<script type="text/javascript">
	
				function paint�graph.name�(){
				console.log("chart script start");
				var width = $("#�graph.name�").parent().width();
				var height = $("#�graph.name�").parent().height();
				var margin = {top: (height/100)*10, 
					right: (width/100)*5, 
					bottom: (height/100)*10, 
					left: (width/100)*15};
	
				width +=- margin.left - margin.right;
				height += - margin.top - margin.bottom;
				
				data = $("#�graph.name�").data().graphContent.split("'").join('"');
				jsonData = JSON.parse(data)
				
				dates = []
				data = []
				$.each(jsonData, function(key, values) {
					result = []
					for( var i = 1; i < values.length; i++ ){
						var currentline=values[i];
						var obj = {date: new Date(currentline[0]), value: currentline[1]}
						dates.push(obj.date);
						result.push(obj);
					}
					data.push({
						name: key,
						values: result});
				});
				
				var x = d3.time.scale()
				    .range([0, width]);
				
				var y = d3.scale.linear()
				    .range([height, 0]);
				
				var color = d3.scale.category10();
				
				var xAxis = d3.svg.axis()
				    .scale(x)
				    .orient("bottom")
				    .ticks(4);
				
				var yAxis = d3.svg.axis()
				    .scale(y)
				    .orient("left");
				
				var line = d3.svg.line()
				    .interpolate("basis")
				    .x(function(d) { return x(d.date); })
				    .y(function(d) { return y(d.value); });
				
				var svg = d3.select("#�graph.name�").append("svg")
				    .attr("width", width + margin.left + margin.right)
				    .attr("height", height + margin.top + margin.bottom)
				  .append("g")
				    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
				
				color.domain(d3.keys(Object.keys(jsonData)))
				
				x.domain(d3.extent(dates, function(d) { return d; }));
				
				y.domain([
					d3.min(data, function(d) { return d3.min(d.values, function(v) { return v.value; }); }),
					d3.max(data, function(d) { return d3.max(d.values, function(v) { return v.value; }); })
				]);
				
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
						.text("Value");
				
				var lines = svg.selectAll(".valueLine")
						.data(data)
					.enter().append("g")
						.attr("class", ".valueLine")
				
				lines.append("path")
					.attr("class", "line")
					.attr("d", function(d) { return line(d.values); })
					.style("stroke", function(d) { return color(d.name); })
				
			}
			
			function repaint�graph.name�(){
				var divObj = $("#�graph.name�").parent()[0];
				var className = divObj.className;
				if(className.indexOf("large") > -1){
					className = className.replace("large", "big");
				}else{
					className = className.replace("big", "large");
				}
				divObj.className = className;
				$("#�graph.name�")[0].innerHTML = '';
				paint�graph.name�();
			}
			
			paint�graph.name�();
	</script>
	'''
}
