package org.xtext.sdu.iotvizualizerlanguage.generator;

import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.EndPoint;

@SuppressWarnings("all")
public class SourceTaskResolver {
  private List<EndPoint> URIs = new ArrayList<EndPoint>();
  
  public SourceTaskResolver(final Resource resource) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<EndPoint> _filter = Iterators.<EndPoint>filter(_allContents, EndPoint.class);
    List<EndPoint> _list = IteratorExtensions.<EndPoint>toList(_filter);
    this.URIs = _list;
    HashSet<Datasource> sources = new HashSet<Datasource>();
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<Datasource> _filter_1 = Iterators.<Datasource>filter(_allContents_1, Datasource.class);
    List<Datasource> _list_1 = IteratorExtensions.<Datasource>toList(_filter_1);
    sources.addAll(_list_1);
    int _size = this.URIs.size();
    String _plus = ("URIs Found: " + Integer.valueOf(_size));
    InputOutput.<String>println(_plus);
  }
  
  public List<String> getSchedules() {
    final ArrayList<String> schedules = new ArrayList<String>();
    final Consumer<EndPoint> _function = (EndPoint uri) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      String _name = uri.getName();
      _builder.append(_name, "");
      _builder.append("\": \"");
      String _url = uri.getUrl();
      _builder.append(_url, "");
      _builder.append("\"");
      schedules.add(_builder.toString());
    };
    this.URIs.forEach(_function);
    return schedules;
  }
}
