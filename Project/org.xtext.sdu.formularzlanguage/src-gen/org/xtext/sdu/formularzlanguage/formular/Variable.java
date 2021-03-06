/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.formularzlanguage.formular;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.sdu.formularzlanguage.formular.Variable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.sdu.formularzlanguage.formular.FormularPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Primitive
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.sdu.formularzlanguage.formular.FormularPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.sdu.formularzlanguage.formular.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Variable
