package pl.edu.agh.tkk17.sample;

public class NodeAdd extends Node
{
    public NodeAdd(Node left, Node right)
    {
        super(left, right);
    }

    public void accept(NodeVisitor visitor)
    {
        visitor.visit(this);
    }
}
