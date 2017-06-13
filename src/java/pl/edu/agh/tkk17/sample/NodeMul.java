package pl.edu.agh.tkk17.sample;

public class NodeMul extends Node
{
    public NodeMul(Node left, Node right)
    {
        super(left, right);
    }

    public void accept(NodeVisitor visitor)
    {
        visitor.visit(this);
    }
}
