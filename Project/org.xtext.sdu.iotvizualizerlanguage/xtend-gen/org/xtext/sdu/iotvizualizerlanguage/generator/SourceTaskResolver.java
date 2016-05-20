package org.xtext.sdu.iotvizualizerlanguage.generator;

import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Datasource;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.Source;
import org.xtext.sdu.iotvizualizerlanguage.vizualizer.URI;

@SuppressWarnings("all")
public class SourceTaskResolver {
  private List<URI> URIs = new ArrayList<URI>();
  
  private LinkedList<Datasource> datasources = new LinkedList<Datasource>();
  
  public SourceTaskResolver(final Resource resource) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<URI> _filter = Iterators.<URI>filter(_allContents, URI.class);
    List<URI> _list = IteratorExtensions.<URI>toList(_filter);
    this.URIs = _list;
    HashSet<Datasource> sources = new HashSet<Datasource>();
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<Datasource> _filter_1 = Iterators.<Datasource>filter(_allContents_1, Datasource.class);
    List<Datasource> _list_1 = IteratorExtensions.<Datasource>toList(_filter_1);
    sources.addAll(_list_1);
    this.addInOrder(sources);
    int _size = this.URIs.size();
    String _plus = ("URIs Found: " + Integer.valueOf(_size));
    InputOutput.<String>println(_plus);
    int _size_1 = this.datasources.size();
    String _plus_1 = ("Handled Datasources Found: " + Integer.valueOf(_size_1));
    InputOutput.<String>println(_plus_1);
  }
  
  public String addInOrder(final Set<Datasource> remaining) {
    String _xblockexpression = null;
    {
      boolean change = true;
      while (((!remaining.isEmpty()) && change)) {
        {
          change = false;
          HashSet<Datasource> removals = new HashSet<Datasource>();
          for (final Datasource remainder : remaining) {
            boolean _or = false;
            Source _source = remainder.getSource();
            boolean _contains = this.datasources.contains(_source);
            if (_contains) {
              _or = true;
            } else {
              Source _source_1 = remainder.getSource();
              boolean _contains_1 = this.URIs.contains(_source_1);
              _or = _contains_1;
            }
            if (_or) {
              removals.add(remainder);
              change = true;
            }
          }
          this.datasources.addAll(removals);
          remaining.removeAll(removals);
        }
      }
      String _xifexpression = null;
      boolean _isEmpty = remaining.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        int _size = remaining.size();
        String _plus = ("Found " + Integer.valueOf(_size));
        String _plus_1 = (_plus + " Stranded Datasources");
        _xifexpression = InputOutput.<String>println(_plus_1);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public List<String> getSchedules() {
    final ArrayList<String> schedules = new ArrayList<String>();
    final Consumer<URI> _function = (URI uri) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      String _name = uri.getName();
      _builder.append(_name, "");
      _builder.append("\": \"");
      String _uri = uri.getUri();
      _builder.append(_uri, "");
      _builder.append("\"");
      schedules.add(_builder.toString());
    };
    this.URIs.forEach(_function);
    return schedules;
  }
}
