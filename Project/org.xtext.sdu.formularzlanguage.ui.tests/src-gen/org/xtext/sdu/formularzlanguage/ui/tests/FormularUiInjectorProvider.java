/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.formularzlanguage.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.sdu.formularzlanguage.ui.internal.FormularzlanguageActivator;

public class FormularUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FormularzlanguageActivator.getInstance().getInjector("org.xtext.sdu.formularzlanguage.Formular");
	}

}
