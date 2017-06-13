package pl.edu.agh.tkk17.sample;

import java.util.Stack;

public class RpnEvaluatorVisitor implements NodeVisitor
{
    private Stack<Float> stack;

    public RpnEvaluatorVisitor()
    {
        this.stack = new Stack<Float>();
    }

    public Float getValue()
    {
        return this.stack.peek();
    }

    public void visit(NodeAdd node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Float a = this.stack.pop();
        Float b = this.stack.pop();
        Float c = b + a;
        this.stack.push(c);
    }

    public void visit(NodeMul node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Float a = this.stack.pop();
        Float b = this.stack.pop();
        Float c = b * a;
        this.stack.push(c);
    }

    public void visit(NodeNumber node)
    {
        String value = node.getValue();
        Float numericValue = Float.parseFloat(value);
        this.stack.push(numericValue);
    }
	
	public void visit(NodeSub node)
	{
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Float a = this.stack.pop();
        Float b = this.stack.pop();
        Float c = b - a;
        this.stack.push(c);
    }
	
	public void visit(NodeDiv node)
	{
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Float a = this.stack.pop();
        Float b = this.stack.pop();
        Float c = b / a;
        this.stack.push(c);
    }
}
