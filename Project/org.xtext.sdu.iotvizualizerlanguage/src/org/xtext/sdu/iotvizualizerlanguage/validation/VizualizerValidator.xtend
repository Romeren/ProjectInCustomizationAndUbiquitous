/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.validation

import javax.xml.ws.Endpoint
import org.eclipse.xtext.validation.Check
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Dimension
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.DimensionSelector

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class VizualizerValidator extends AbstractVizualizerValidator {
	
	@Check
	def checkFormulaForSourceVariable(Dimension checkedDimension) {
		for (param : checkedDimension.name.vars) {
			if(!checkedDimension.sourceSelectors.map[selector | selector.name].contains(param.name)) {
				error("You should not Have done that. You will get in trouble!",
					param,
					param.eClass.getEStructuralFeature(0)
				)
			}
		}
	}
	
	@Check
	def checkSourceHasDimension(DimensionSelector dimensionSelector) {
		if(!hasDimension(dimensionSelector.source, dimensionSelector.selectVar.name)) {
			error("Source does not contain the dimensional Variable you are refering to",
				dimensionSelector.selectVar,
				dimensionSelector.selectVar.eClass.getEStructuralFeature(0)
			)
		}
	}
	
	@Check
	def dispatch hasDimension(Endpoint endpoint, String id) {
		return true;
	}
	
	@Check
	def dispatch hasDimension(Datasource datasource, String id) {
		return datasource.dimensions.map[dimension | dimension.name.name].contains(id)	
	}
	
}
