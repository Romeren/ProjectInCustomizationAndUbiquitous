package org.xtext.sdu.iotvizualizerlanguage.generator;

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
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.GetEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.PostEndPoint;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.SchemaParser;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Selector;

@SuppressWarnings("all")
public class EndpointGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CharSequence _compileAbstractSelector = this.compileAbstractSelector();
    fsa.generateFile("DataHandle/Selectors/AbstractSelector", _compileAbstractSelector);
    CharSequence _compileAbstractSchemaParser = this.compileAbstractSchemaParser();
    fsa.generateFile("DataHandle/SchemaParsers/AbstractSchemaParser", _compileAbstractSchemaParser);
    CharSequence _compileAbstractEndpoint = this.compileAbstractEndpoint();
    fsa.generateFile("DataHandle/EndPoints/AbstractEndpoint", _compileAbstractEndpoint);
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EndPoint> _filter = Iterables.<EndPoint>filter(_iterable, EndPoint.class);
    for (final EndPoint p : _filter) {
      {
        SchemaParser _parser = p.getParser();
        String _name = _parser.getName();
        String _plus = ("DataHandle/SchemaParsers/SchemaParser" + _name);
        CharSequence _compile = this.compile(p);
        fsa.generateFile(_plus, _compile);
        SchemaParser _parser_1 = p.getParser();
        EList<Selector> _selectors = _parser_1.getSelectors();
        for (final Selector s : _selectors) {
          String _name_1 = s.getName();
          String _plus_1 = ("DataHandle/Selectors/Selector" + _name_1);
          CharSequence _compile_1 = this.compile(s);
          fsa.generateFile(_plus_1, _compile_1);
        }
        String _name_2 = p.getName();
        String _plus_2 = ("DataHandle/EndPoints/EndPoint" + _name_2);
        CharSequence _compile_2 = this.compile(p);
        fsa.generateFile(_plus_2, _compile_2);
      }
    }
  }
  
  public CharSequence compileAbstractEndpoint() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import requests");
    _builder.newLine();
    _builder.append("import time");
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
    _builder.append("def getJsonElement(self, jSon, selectorStep):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return jSon[selectorStep]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def getElement(self, data, selector):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for selc in selector.steps:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("data = self.getJsonElement(data,selc)");
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
    _builder.append("response = self.getJson(response)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("#TODO: handle multiple selectors");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("response = self.getElement(response, self.schemaParser.selectors[0])");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("self.data = response");
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
  
  public CharSequence compile(final Selector select) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHandle.Selectors.AbstractSelector import AbstractSelector");
    _builder.newLine();
    _builder.append("class Selector");
    String _name = select.getName();
    _builder.append(_name, "");
    _builder.append("(AbstractSelector»):");
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
        _builder.append("self.steps.append(");
        _builder.append(step, "\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
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
  
  public CharSequence compile(final SchemaParser parser) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHendle.Schemaparsers.AbstractSchemaParser import AbstractSchemaParser ");
    _builder.newLine();
    {
      EList<Selector> _selectors = parser.getSelectors();
      for(final Selector s : _selectors) {
        _builder.append("from DataHendle.Selectors.Selector");
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
        _builder.append(")\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final GetEndPoint endpoint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from DataHandle.Endpoints.AbstractEndpoint import AbstractEndpoint");
    _builder.newLine();
    _builder.append("from DataHandle.SchemaParsers.");
    SchemaParser _parser = endpoint.getParser();
    String _name = _parser.getName();
    _builder.append(_name, "");
    _builder.append(" import SchemaParser");
    SchemaParser _parser_1 = endpoint.getParser();
    String _name_1 = _parser_1.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("class EndPoint");
    String _name_2 = endpoint.getName();
    _builder.append(_name_2, "");
    _builder.append("(AbstractEndpoint):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.schemaParser = ");
    SchemaParser _parser_2 = endpoint.getParser();
    String _name_3 = _parser_2.getName();
    _builder.append(_name_3, "\t\t");
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
