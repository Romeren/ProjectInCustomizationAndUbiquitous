/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.vizualizer.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.sdu.formularzlanguage.formular.FormularPackage;

import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Dimension;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Graph;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Header;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Link;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Page;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.PostEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaType;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Selector;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Source;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Tile;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerFactory;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VizualizerPackageImpl extends EPackageImpl implements VizualizerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postEndPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getEndPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaParserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum schemaTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.sdu.iotvizualizerlanguage.vizualizer.VizualizerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VizualizerPackageImpl()
  {
    super(eNS_URI, VizualizerFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VizualizerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VizualizerPackage init()
  {
    if (isInited) return (VizualizerPackage)EPackage.Registry.INSTANCE.getEPackage(VizualizerPackage.eNS_URI);

    // Obtain or create and register package
    VizualizerPackageImpl theVizualizerPackage = (VizualizerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VizualizerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VizualizerPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FormularPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theVizualizerPackage.createPackageContents();

    // Initialize created meta-data
    theVizualizerPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVizualizerPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VizualizerPackage.eNS_URI, theVizualizerPackage);
    return theVizualizerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_Pages()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_Sources()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_Schemas()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPage_Name()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Tiles()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTile()
  {
    return tileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTile_Name()
  {
    return (EAttribute)tileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Page()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraph()
  {
    return graphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraph_Source()
  {
    return (EReference)graphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasource()
  {
    return datasourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasource_Source()
  {
    return (EReference)datasourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasource_Dimensions()
  {
    return (EReference)datasourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimension()
  {
    return dimensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimension_Name()
  {
    return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimension_Formula()
  {
    return (EReference)dimensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSource()
  {
    return sourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_Name()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndPoint()
  {
    return endPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndPoint_Url()
  {
    return (EAttribute)endPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEndPoint_Parser()
  {
    return (EReference)endPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostEndPoint()
  {
    return postEndPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetEndPoint()
  {
    return getEndPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetEndPoint_Headers()
  {
    return (EReference)getEndPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Keyword()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader_Value()
  {
    return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaParser()
  {
    return schemaParserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemaParser_Name()
  {
    return (EAttribute)schemaParserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemaParser_SchemaType()
  {
    return (EAttribute)schemaParserEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaParser_Selectors()
  {
    return (EReference)schemaParserEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelector_Name()
  {
    return (EAttribute)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelector_Steps()
  {
    return (EAttribute)selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSchemaType()
  {
    return schemaTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizualizerFactory getVizualizerFactory()
  {
    return (VizualizerFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    systemEClass = createEClass(SYSTEM);
    createEReference(systemEClass, SYSTEM__PAGES);
    createEReference(systemEClass, SYSTEM__SOURCES);
    createEReference(systemEClass, SYSTEM__SCHEMAS);

    pageEClass = createEClass(PAGE);
    createEAttribute(pageEClass, PAGE__NAME);
    createEReference(pageEClass, PAGE__TILES);

    tileEClass = createEClass(TILE);
    createEAttribute(tileEClass, TILE__NAME);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__PAGE);

    graphEClass = createEClass(GRAPH);
    createEReference(graphEClass, GRAPH__SOURCE);

    datasourceEClass = createEClass(DATASOURCE);
    createEReference(datasourceEClass, DATASOURCE__SOURCE);
    createEReference(datasourceEClass, DATASOURCE__DIMENSIONS);

    dimensionEClass = createEClass(DIMENSION);
    createEAttribute(dimensionEClass, DIMENSION__NAME);
    createEReference(dimensionEClass, DIMENSION__FORMULA);

    sourceEClass = createEClass(SOURCE);
    createEAttribute(sourceEClass, SOURCE__NAME);

    endPointEClass = createEClass(END_POINT);
    createEAttribute(endPointEClass, END_POINT__URL);
    createEReference(endPointEClass, END_POINT__PARSER);

    postEndPointEClass = createEClass(POST_END_POINT);

    getEndPointEClass = createEClass(GET_END_POINT);
    createEReference(getEndPointEClass, GET_END_POINT__HEADERS);

    headerEClass = createEClass(HEADER);
    createEAttribute(headerEClass, HEADER__KEYWORD);
    createEAttribute(headerEClass, HEADER__VALUE);

    schemaParserEClass = createEClass(SCHEMA_PARSER);
    createEAttribute(schemaParserEClass, SCHEMA_PARSER__NAME);
    createEAttribute(schemaParserEClass, SCHEMA_PARSER__SCHEMA_TYPE);
    createEReference(schemaParserEClass, SCHEMA_PARSER__SELECTORS);

    selectorEClass = createEClass(SELECTOR);
    createEAttribute(selectorEClass, SELECTOR__NAME);
    createEAttribute(selectorEClass, SELECTOR__STEPS);

    // Create enums
    schemaTypeEEnum = createEEnum(SCHEMA_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FormularPackage theFormularPackage = (FormularPackage)EPackage.Registry.INSTANCE.getEPackage(FormularPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    linkEClass.getESuperTypes().add(this.getTile());
    graphEClass.getESuperTypes().add(this.getTile());
    datasourceEClass.getESuperTypes().add(this.getSource());
    endPointEClass.getESuperTypes().add(this.getSource());
    postEndPointEClass.getESuperTypes().add(this.getEndPoint());
    getEndPointEClass.getESuperTypes().add(this.getEndPoint());

    // Initialize classes and features; add operations and parameters
    initEClass(systemEClass, org.xtext.sdu.iotvizualizerlanguage.vizualizer.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSystem_Pages(), this.getPage(), null, "pages", null, 0, -1, org.xtext.sdu.iotvizualizerlanguage.vizualizer.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_Sources(), this.getSource(), null, "sources", null, 0, -1, org.xtext.sdu.iotvizualizerlanguage.vizualizer.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_Schemas(), this.getSchemaParser(), null, "schemas", null, 0, -1, org.xtext.sdu.iotvizualizerlanguage.vizualizer.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_Tiles(), this.getTile(), null, "tiles", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTile_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_Page(), this.getPage(), null, "page", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraph_Source(), this.getDatasource(), null, "source", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datasourceEClass, Datasource.class, "Datasource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatasource_Source(), this.getSource(), null, "source", null, 0, 1, Datasource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatasource_Dimensions(), this.getDimension(), null, "dimensions", null, 0, -1, Datasource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimension_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDimension_Formula(), theFormularPackage.getFormula(), null, "formula", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndPoint_Url(), ecorePackage.getEString(), "url", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEndPoint_Parser(), this.getSchemaParser(), null, "parser", null, 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postEndPointEClass, PostEndPoint.class, "PostEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(getEndPointEClass, GetEndPoint.class, "GetEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGetEndPoint_Headers(), this.getHeader(), null, "headers", null, 0, -1, GetEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHeader_Value(), ecorePackage.getEString(), "value", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaParserEClass, SchemaParser.class, "SchemaParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchemaParser_Name(), ecorePackage.getEString(), "name", null, 0, 1, SchemaParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchemaParser_SchemaType(), this.getSchemaType(), "schemaType", null, 0, 1, SchemaParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaParser_Selectors(), this.getSelector(), null, "selectors", null, 0, -1, SchemaParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelector_Steps(), ecorePackage.getEString(), "steps", null, 0, -1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(schemaTypeEEnum, SchemaType.class, "SchemaType");
    addEEnumLiteral(schemaTypeEEnum, SchemaType.XML);
    addEEnumLiteral(schemaTypeEEnum, SchemaType.CSV);
    addEEnumLiteral(schemaTypeEEnum, SchemaType.JSON);

    // Create resource
    createResource(eNS_URI);
  }

} //VizualizerPackageImpl
