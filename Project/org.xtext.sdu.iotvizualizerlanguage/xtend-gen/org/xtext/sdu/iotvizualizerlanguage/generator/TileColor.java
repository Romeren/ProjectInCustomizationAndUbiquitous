package org.xtext.sdu.iotvizualizerlanguage.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TileColor {
  public final String[] colors = { "bg-lime", "bg-green", "bg-emerald", "bg-teal", "bg-blue", "bg-cyan", "bg-cobalt", "bg-indigo", "bg-violet", "bg-pink", "bg-magenta", "bg-crimson", "bg-red", "bg-orange", "bg-amber", "bg-yellow", "bg-brown", "bg-olive", "bg-mauve", "bg-taupe", "bg-lightBlue", "bg-lightRed", "bg-lightGreen", "bg-lighterBlue", "bg-lightTeal", "bg-lightOlive", "bg-lightOrange" };
  
  public CharSequence getColor(final int i) {
    StringConcatenation _builder = new StringConcatenation();
    String _get = this.colors[i];
    _builder.append(_get, "");
    return _builder;
  }
}
