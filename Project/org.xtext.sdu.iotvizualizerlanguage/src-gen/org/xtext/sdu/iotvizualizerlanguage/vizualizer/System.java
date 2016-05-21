/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.vizualizer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.System#getPages <em>Pages</em>}</li>
 *   <li>{@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.System#getSources <em>Sources</em>}</li>
 *   <li>{@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.System#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage#getSystem_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Page> getPages();

  /**
   * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.Source}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' containment reference list.
   * @see org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage#getSystem_Sources()
   * @model containment="true"
   * @generated
   */
  EList<Source> getSources();

  /**
   * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schemas</em>' containment reference list.
   * @see org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage#getSystem_Schemas()
   * @model containment="true"
   * @generated
   */
  EList<SchemaParser> getSchemas();

} // System
