package pl.edu.agh.tkk17.sample;

public class NodeNumber extends Node
{
    private String value;

    public NodeNumber(String value)
    {
        this.value = value; // Character.getNumericValue(value);
    }

    public String getValue()
    {
        return this.value;
    }

    public void accept(NodeVisitor visitor)
    {
        visitor.visit(this);
    }

}
