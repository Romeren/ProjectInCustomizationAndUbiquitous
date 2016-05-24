def dispatch String leftResursiveTraversal(Expression expression, String string) {
	var String result = expression.left.leftResursiveTraversal(string)
	result = expression.right == null ? result : expression.right.leftResursiveTraversal(result + factor.op)
	return result
}
def dispatch String leftResursiveTraversal(Factor factor, String string) {
	var String result = factor.left.leftResursiveTraversal(string)
	result = factor.right == null ? result : factor.right.leftResursiveTraversal(result + factor.op)
	return result
}
def dispatch String leftResursiveTraversal(Variable variable, String string) {
	return string + "input_" + variable.name + "[::, 1]"
}
def dispatch String leftResursiveTraversal(Number number, String string) {
	return string + number.^val
}