package org.xtext.sdu.iotvizualizerlanguage.generator

class TileColor {
	
	val String[] colors = #[
'bg-lime',
'bg-green',
'bg-emerald',
'bg-teal',
'bg-blue',
'bg-cyan',
'bg-cobalt',
'bg-indigo',
'bg-violet',
'bg-pink',
'bg-magenta',
'bg-crimson',
'bg-red',
'bg-orange',
'bg-amber',
'bg-yellow',
'bg-brown',
'bg-olive',
'bg-mauve',
'bg-taupe',
'bg-darkBrown',
'bg-darkCrimson',
'bg-darkMagenta',
'bg-darkIndigo',
'bg-darkCyan',
'bg-darkCobalt',
'bg-darkTeal',
'bg-darkEmerald',
'bg-darkGreen',
'bg-darkOrange',
'bg-darkRed',
'bg-darkPink',
'bg-darkViolet',
'bg-darkBlue',
'bg-lightBlue',
'bg-lightRed',
'bg-lightGreen',
'bg-lighterBlue',
'bg-lightTeal',
'bg-lightOlive',
'bg-lightOrange'
	]
	
	def getColor(int i)
	'''«colors.get(i)»'''
}