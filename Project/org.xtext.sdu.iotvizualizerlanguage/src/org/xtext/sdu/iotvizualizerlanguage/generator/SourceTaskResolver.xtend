package org.xtext.sdu.iotvizualizerlanguage.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.URI

class SourceTaskResolver {
	
	List<URI> URIs = new ArrayList<URI>()
	LinkedList<Datasource> datasources = new LinkedList<Datasource>()
	
	new(Resource resource) {
		URIs = resource.allContents.filter(URI).toList();
		var sources = new HashSet<Datasource>()
		sources.addAll(resource.allContents.filter(Datasource).toList)
		addInOrder(sources)
		println("URIs Found: " + URIs.size)
		println("Handled Datasources Found: " + datasources.size)
	}
	
	def addInOrder(Set<Datasource> remaining) {
		var change = true
		while(!remaining.isEmpty && change) {
			change = false
			var removals = new HashSet<Datasource>()
			for (remainder : remaining) {
				if (datasources.contains(remainder.source) || URIs.contains(remainder.source)) {
					removals.add(remainder)
					change = true
				}
			}
			datasources.addAll(removals)
			remaining.removeAll(removals)
		}
		if(!remaining.isEmpty) {
			println("Found " + remaining.size + " Stranded Datasources")
		}
	}
	
	def List<String> getSchedules() {
		val schedules = new ArrayList<String>()
		URIs.forEach[uri | schedules.add('''"«uri.name»": "«uri.uri»"''')]
		return schedules
	}
	
}