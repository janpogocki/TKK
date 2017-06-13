package pl.edu.agh.tkk17.sample;

public interface NodeVisitor
{
    public void visit(NodeAdd node);
    public void visit(NodeMul node);
    public void visit(NodeNumber node);
}
