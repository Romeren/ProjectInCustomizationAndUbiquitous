/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.xtext.sdu.formularzlanguage.validation.FormularValidator;

public abstract class AbstractVizualizerValidator extends FormularValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
	    result.add(org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage.eINSTANCE);
		return result;
	}
	
}