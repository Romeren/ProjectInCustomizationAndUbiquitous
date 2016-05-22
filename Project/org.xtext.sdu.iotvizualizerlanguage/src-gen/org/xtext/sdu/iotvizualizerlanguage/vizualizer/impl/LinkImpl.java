/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.vizualizer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Link;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sdu.iotvizualizerlanguage.vizualizer.impl.LinkImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends TileImpl implements Link
{
  /**
   * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected Page page;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VizualizerPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getPage()
  {
    if (page != null && page.eIsProxy())
    {
      InternalEObject oldPage = (InternalEObject)page;
      page = (Page)eResolveProxy(oldPage);
      if (page != oldPage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VizualizerPackage.LINK__PAGE, oldPage, page));
      }
    }
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetPage()
  {
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPage(Page newPage)
  {
    Page oldPage = page;
    page = newPage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VizualizerPackage.LINK__PAGE, oldPage, page));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VizualizerPackage.LINK__PAGE:
        if (resolve) return getPage();
        return basicGetPage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VizualizerPackage.LINK__PAGE:
        setPage((Page)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VizualizerPackage.LINK__PAGE:
        setPage((Page)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VizualizerPackage.LINK__PAGE:
        return page != null;
    }
    return super.eIsSet(featureID);
  }

} //LinkImpl
