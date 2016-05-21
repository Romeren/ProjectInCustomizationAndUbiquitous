/**
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.vizualizer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Dimension;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.DimensionSelector;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Graph;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Header;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Link;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.NoQuotesString;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VizualizerFactoryImpl extends EFactoryImpl implements VizualizerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VizualizerFactory init()
  {
    try
    {
      VizualizerFactory theVizualizerFactory = (VizualizerFactory)EPackage.Registry.INSTANCE.getEFactory(VizualizerPackage.eNS_URI);
      if (theVizualizerFactory != null)
      {
        return theVizualizerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VizualizerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizualizerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VizualizerPackage.SYSTEM: return createSystem();
      case VizualizerPackage.PAGE: return createPage();
      case VizualizerPackage.TILE: return createTile();
      case VizualizerPackage.LINK: return createLink();
      case VizualizerPackage.GRAPH: return createGraph();
      case VizualizerPackage.DATASOURCE: return createDatasource();
      case VizualizerPackage.DIMENSION: return createDimension();
      case VizualizerPackage.DIMENSION_SELECTOR: return createDimensionSelector();
      case VizualizerPackage.NO_QUOTES_STRING: return createNoQuotesString();
      case VizualizerPackage.SOURCE: return createSource();
      case VizualizerPackage.END_POINT: return createEndPoint();
      case VizualizerPackage.POST_END_POINT: return createPostEndPoint();
      case VizualizerPackage.GET_END_POINT: return createGetEndPoint();
      case VizualizerPackage.HEADER: return createHeader();
      case VizualizerPackage.SCHEMA_PARSER: return createSchemaParser();
      case VizualizerPackage.SELECTOR: return createSelector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VizualizerPackage.SCHEMA_TYPE:
        return createSchemaTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VizualizerPackage.SCHEMA_TYPE:
        return convertSchemaTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.sdu.iotvizualizerlanguage.vizualizer.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tile createTile()
  {
    TileImpl tile = new TileImpl();
    return tile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasource createDatasource()
  {
    DatasourceImpl datasource = new DatasourceImpl();
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimension createDimension()
  {
    DimensionImpl dimension = new DimensionImpl();
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionSelector createDimensionSelector()
  {
    DimensionSelectorImpl dimensionSelector = new DimensionSelectorImpl();
    return dimensionSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoQuotesString createNoQuotesString()
  {
    NoQuotesStringImpl noQuotesString = new NoQuotesStringImpl();
    return noQuotesString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndPoint createEndPoint()
  {
    EndPointImpl endPoint = new EndPointImpl();
    return endPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostEndPoint createPostEndPoint()
  {
    PostEndPointImpl postEndPoint = new PostEndPointImpl();
    return postEndPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetEndPoint createGetEndPoint()
  {
    GetEndPointImpl getEndPoint = new GetEndPointImpl();
    return getEndPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaParser createSchemaParser()
  {
    SchemaParserImpl schemaParser = new SchemaParserImpl();
    return schemaParser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector createSelector()
  {
    SelectorImpl selector = new SelectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaType createSchemaTypeFromString(EDataType eDataType, String initialValue)
  {
    SchemaType result = SchemaType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSchemaTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizualizerPackage getVizualizerPackage()
  {
    return (VizualizerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VizualizerPackage getPackage()
  {
    return VizualizerPackage.eINSTANCE;
  }

} //VizualizerFactoryImpl
