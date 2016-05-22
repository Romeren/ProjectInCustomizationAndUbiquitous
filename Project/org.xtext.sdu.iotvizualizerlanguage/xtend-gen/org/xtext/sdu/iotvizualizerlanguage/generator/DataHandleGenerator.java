package org.xtext.sdu.iotvizualizerlanguage.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.formularzlanguage.formular.Expression;
import org.xtext.sdu.formularzlanguage.formular.Factor;
import org.xtext.sdu.formularzlanguage.formular.Formula;
import org.xtext.sdu.formularzlanguage.formular.Primitive;
import org.xtext.sdu.formularzlanguage.formular.Variable;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Dimension;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.DimensionSelector;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.NoQuotesString;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.PostEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaType;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Selector;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Source;

@SuppressWarnings("all")
public class DataHandleGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    InputOutput.<String>println("I MAKE FILES!");
    CharSequence _compileAbstractSelector = this.compileAbstractSelector();
    fsa.generateFile("DataHandle/Selectors/AbstractSelector.py", _compileAbstractSelector);
    CharSequence _compileAbstractSchemaParser = this.compileAbstractSchemaParser();
    fsa.generateFile("DataHandle/SchemaParsers/AbstractSchemaParser.py", _compileAbstractSchemaParser);
    CharSequence _compileAbstractEndpoint = this.compileAbstractEndpoint();
    fsa.generateFile("DataHandle/EndPoints/AbstractEndpoint.py", _compileAbstractEndpoint);
    CharSequence _compileDatasourceController = this.compileDatasourceController(input);
    fsa.generateFile("DataHandle/Datasources/Controller.py", _compileDatasourceController);
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EndPoint> _filter = Iterables.<EndPoint>filter(_iterable, EndPoint.class);
    for (final EndPoint p : _filter) {
      {
        SchemaParser _parser = p.getParser();
        String _name = _parser.getName();
        String _plus = ("DataHandle/SchemaParsers/SchemaParser" + _name);
        String _plus_1 = (_plus + ".py");
        SchemaParser _parser_1 = p.getParser();
        CharSequence _compileParser = this.compileParser(_parser_1);
        fsa.generateFile(_plus_1, _compileParser);
        SchemaParser _parser_2 = p.getParser();
        EList<Selector> _selectors = _parser_2.getSelectors();
        for (final Selector s : _selectors) {
          String _name_1 = s.getName();
          String _plus_2 = ("DataHandle/Selectors/Selector" + _name_1);
          String _plus_3 = (_plus_2 + ".py");
          CharSequence _compileSelector = this.compileSelector(s);
          fsa.generateFile(_plus_3, _compileSelector);
        }
        String _name_2 = p.getName();
        String _plus_4 = ("DataHandle/EndPoints/EndPoint" + _name_2);
        String _plus_5 = (_plus_4 + ".py");
        CharSequence _compile = this.compile(p);
        fsa.generateFile(_plus_5, _compile);
      }
    }
  }
  
  public CharSequence compileDatasourceController(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import numpy as np");
    _builder.newLine();
    {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<EndPoint> _filter = Iterables.<EndPoint>filter(_iterable, EndPoint.class);
      for(final EndPoint endPoint : _filter) {
        _builder.append("import DataHandle.EndPoints.EndPoint");
        String _name = endPoint.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("class DatasourceController():");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      TreeIterator<EObject> _allContents_1 = resource.getAllContents();
      Iterable<EObject> _iterable_1 = IteratorExtensions.<EObject>toIterable(_allContents_1);
      Iterable<Datasource> _filter_1 = Iterables.<Datasource>filter(_iterable_1, Datasource.class);
      for(final Datasource datasource : _filter_1) {
        _builder.append("\t");
        _builder.append("def datasource_");
        String _name_1 = datasource.getName();
        _builder.append(_name_1, "\t");
        _builder.append("(self):");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("result = {}");
        _builder.newLine();
        {
          EList<Dimension> _dimensions = datasource.getDimensions();
          for(final Dimension dimension : _dimensions) {
            {
              EList<DimensionSelector> _sourceSelectors = dimension.getSourceSelectors();
              for(final DimensionSelector selector : _sourceSelectors) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("input_");
                String _name_2 = selector.getName();
                _builder.append(_name_2, "\t\t");
                _builder.append(" = np.array(");
                Source _source = selector.getSource();
                NoQuotesString _selectVar = selector.getSelectVar();
                String _name_3 = _selectVar.getName();
                String _dimensionFromSource = this.getDimensionFromSource(_source, _name_3);
                _builder.append(_dimensionFromSource, "\t\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("input_");
            EList<DimensionSelector> _sourceSelectors_1 = dimension.getSourceSelectors();
            DimensionSelector _get = _sourceSelectors_1.get(0);
            String _name_4 = _get.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append("[1, ] = ");
            Formula _name_5 = dimension.getName();
            String _pythonFormula = this.getPythonFormula(_name_5);
            _builder.append(_pythonFormula, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("result.put(\"dimension_");
            Formula _name_6 = dimension.getName();
            String _name_7 = _name_6.getName();
            _builder.append(_name_7, "\t\t");
            _builder.append("\" : input_");
            EList<DimensionSelector> _sourceSelectors_2 = dimension.getSourceSelectors();
            DimensionSelector _get_1 = _sourceSelectors_2.get(0);
            String _name_8 = _get_1.getName();
            _builder.append(_name_8, "\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return result");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public String getDimensionFromSource(final Source source, final String dimension) {
    if ((source instanceof Datasource)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("datasource_");
      String _name = ((Datasource)source).getName();
      _builder.append(_name, "");
      _builder.append("().get(\"dimension_");
      _builder.append(dimension, "");
      _builder.append("\")");
      return _builder.toString();
    } else {
      if ((source instanceof GetEndPoint)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("EndPoint");
        String _name_1 = ((GetEndPoint)source).getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(".EndPoint");
        String _name_2 = ((GetEndPoint)source).getName();
        _builder_1.append(_name_2, "");
        _builder_1.append("().getData()");
        return _builder_1.toString();
      }
    }
    return null;
  }
  
  public String getPythonFormula(final Formula formula) {
    Expression _exp = formula.getExp();
    return this.leftResursiveTraversal(_exp, "");
  }
  
  protected String _leftResursiveTraversal(final Expression expression, final String string) {
    Factor _left = expression.getLeft();
    String result = this.leftResursiveTraversal(_left, string);
    Expression _right = expression.getRight();
    boolean _notEquals = (!Objects.equal(_right, null));
    if (_notEquals) {
      String _result = result;
      String _op = expression.getOp();
      result = (_result + _op);
      Expression _right_1 = expression.getRight();
      String _leftResursiveTraversal = this.leftResursiveTraversal(_right_1, result);
      result = _leftResursiveTraversal;
    }
    return result;
  }
  
  protected String _leftResursiveTraversal(final Factor factor, final String string) {
    Primitive _left = factor.getLeft();
    String result = this.leftResursiveTraversal(_left, string);
    Factor _right = factor.getRight();
    boolean _notEquals = (!Objects.equal(_right, null));
    if (_notEquals) {
      String _result = result;
      String _op = factor.getOp();
      result = (_result + _op);
      Factor _right_1 = factor.getRight();
      String _leftResursiveTraversal = this.leftResursiveTraversal(_right_1, result);
      result = _leftResursiveTraversal;
    }
    return result;
  }
  
  protected String _leftResursiveTraversal(final Variable variable, final String string) {
    String _name = variable.getName();
    String _plus = ((string + "input_") + _name);
    return (_plus + "[1, ]");
  }
  
  protected String _leftResursiveTraversal(final org.xtext.sdu.formularzlanguage.formular.Number number, final String string) {
    int _val = number.getVal();
    return (string + Integer.valueOf(_val));
  }
  
  public CharSequence compileAbstractEndpoint() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import requests");
    _builder.newLine();
    _builder.append("import time");
    _builder.newLine();
    _builder.append("import numpy as np");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class AbstractEndpoint():");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def fetchData(self, url):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("response = requests.get(url)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return response");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getJson(self, request):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return request.json()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getText(self, request):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return request.text");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getJsonElement(self, json, selectorStep):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return json[selectorStep]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getTextElement(self, text, selectorStep):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return text");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getElement(self, data, selector, type):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for selc in selector.steps:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if type == \'JSON\':");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("data = self.getJsonElement(data,selc)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("data = self.getTextElement(data,selc)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return data");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getData(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(not self.data):");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("response = self.fetchData(self.url)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if self.schemaParser.contentType is \'JSON\':");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("response = self.getJson(response)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else: #TODO: HANDLE CSV AND XML");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("response = self.getText() ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("#TODO: handle multiple selectors");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("response = self.getElement(response, self.schemaParser.selectors[0], self.schemaParser.contentType)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.data = np.array(response)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return self.data");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileAbstractSelector() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class AbstractSelector():");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def __init__(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.steps = []");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileSelector(final Selector select) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHandle.Selectors.AbstractSelector import AbstractSelector");
    _builder.newLine();
    _builder.append("class Selector");
    String _name = select.getName();
    _builder.append(_name, "");
    _builder.append("(AbstractSelector):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.steps = []");
    _builder.newLine();
    {
      EList<String> _steps = select.getSteps();
      for(final String step : _steps) {
        _builder.append("\t\t");
        String _appendStep = this.appendStep(step);
        _builder.append(_appendStep, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String appendStep(final String step) {
    try {
      Integer.parseInt(step);
      return (("self.steps.append(" + step) + ")");
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        return (("self.steps.append(\"" + step) + "\")");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public CharSequence compileAbstractSchemaParser() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class AbstractSchemaParser():");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def __init__(self):\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.selectors = []");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileParser(final SchemaParser parser) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHandle.SchemaParsers.AbstractSchemaParser import AbstractSchemaParser ");
    _builder.newLine();
    {
      EList<Selector> _selectors = parser.getSelectors();
      for(final Selector s : _selectors) {
        _builder.append("from DataHandle.Selectors.Selector");
        String _name = s.getName();
        _builder.append(_name, "");
        _builder.append(" import Selector");
        String _name_1 = s.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("class SchemaParser");
    String _name_2 = parser.getName();
    _builder.append(_name_2, "");
    _builder.append("(AbstractSchemaParser):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.selectors = []");
    _builder.newLine();
    {
      EList<Selector> _selectors_1 = parser.getSelectors();
      for(final Selector select : _selectors_1) {
        _builder.append("\t\t");
        _builder.append("self.selectors.append(Selector");
        String _name_3 = select.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("())\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("self.contentType = ");
    SchemaType _schemaType = parser.getSchemaType();
    _builder.append(_schemaType, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final GetEndPoint endpoint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHandle.EndPoints.AbstractEndpoint import AbstractEndpoint");
    _builder.newLine();
    _builder.append("import DataHandle.SchemaParsers.SchemaParser");
    SchemaParser _parser = endpoint.getParser();
    String _name = _parser.getName();
    _builder.append(_name, "");
    _builder.append("  as s");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("class EndPoint");
    String _name_1 = endpoint.getName();
    _builder.append(_name_1, "");
    _builder.append("(AbstractEndpoint):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.schemaParser = s.SchemaParser");
    SchemaParser _parser_1 = endpoint.getParser();
    String _name_2 = _parser_1.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("self.url = \"");
    String _url = endpoint.getUrl();
    _builder.append(_url, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("self.data = None");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final PostEndPoint endpoint) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String leftResursiveTraversal(final EObject expression, final String string) {
    if (expression instanceof Expression) {
      return _leftResursiveTraversal((Expression)expression, string);
    } else if (expression instanceof org.xtext.sdu.formularzlanguage.formular.Number) {
      return _leftResursiveTraversal((org.xtext.sdu.formularzlanguage.formular.Number)expression, string);
    } else if (expression instanceof Variable) {
      return _leftResursiveTraversal((Variable)expression, string);
    } else if (expression instanceof Factor) {
      return _leftResursiveTraversal((Factor)expression, string);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression, string).toString());
    }
  }
  
  public CharSequence compile(final EndPoint endpoint) {
    if (endpoint instanceof GetEndPoint) {
      return _compile((GetEndPoint)endpoint);
    } else if (endpoint instanceof PostEndPoint) {
      return _compile((PostEndPoint)endpoint);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(endpoint).toString());
    }
  }
}
