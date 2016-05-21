package org.xtext.sdu.iotvizualizerlanguage.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint

class SourceTaskResolver {
	
	List<EndPoint> URIs = new ArrayList<EndPoint>()
	
	new(Resource resource) {
		URIs = resource.allContents.filter(EndPoint).toList();
		var sources = new HashSet<Datasource>()
		sources.addAll(resource.allContents.filter(Datasource).toList)
		println("URIs Found: " + URIs.size)
	}

	
	def List<String> getSchedules() {
		val schedules = new ArrayList<String>()
		URIs.forEach[uri | schedules.add('''"«uri.name»": "«uri.url»"''')]
		return schedules
	}
	
}