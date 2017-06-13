package pl.edu.agh.tkk17.sample;

import java.util.Stack;

public class RpnEvaluatorVisitor implements NodeVisitor
{
    private Stack<Integer> stack;

    public RpnEvaluatorVisitor()
    {
        this.stack = new Stack<Integer>();
    }

    public Integer getValue()
    {
        return this.stack.peek();
    }

    public void visit(NodeAdd node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Integer a = this.stack.pop();
        Integer b = this.stack.pop();
        Integer c = b + a;
        this.stack.push(c);
    }

    public void visit(NodeMul node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        Integer a = this.stack.pop();
        Integer b = this.stack.pop();
        Integer c = b * a;
        this.stack.push(c);
    }

    public void visit(NodeNumber node)
    {
        String value = node.getValue();
        Integer numericValue = Integer.parseInt(value);
        this.stack.push(numericValue);
    }
}
