/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.validation;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.sdu.formularzlanguage.formular.Formula;
import org.xtext.sdu.formularzlanguage.formular.Variable;
import org.xtext.sdu.iotvizualizerlanguage.validation.AbstractVizualizerValidator;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Dimension;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.DimensionSelector;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class VizualizerValidator extends AbstractVizualizerValidator {
  @Check
  public void checkFormulaForSourceVariable(final Dimension checkedDimension) {
    Formula _name = checkedDimension.getName();
    EList<Variable> _vars = _name.getVars();
    for (final Variable param : _vars) {
      EList<DimensionSelector> _sourceSelectors = checkedDimension.getSourceSelectors();
      final Function1<DimensionSelector, String> _function = (DimensionSelector selector) -> {
        return selector.getName();
      };
      List<String> _map = ListExtensions.<DimensionSelector, String>map(_sourceSelectors, _function);
      String _name_1 = param.getName();
      boolean _contains = _map.contains(_name_1);
      boolean _not = (!_contains);
      if (_not) {
        EClass _eClass = param.eClass();
        EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(0);
        this.error("You should not Have done that. You will get in trouble!", param, _eStructuralFeature);
      }
    }
  }
}
