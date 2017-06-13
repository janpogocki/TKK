package pl.edu.agh.tkk17.sample;

public abstract class Node
{
    protected Node left;
    protected Node right;

    public Node(Node left, Node right)
    {
        this.left = left;
        this.right = right;
    }

    public Node()
    {
        this.left = null;
        this.right = null;
    }

    public Node getLeft()
    {
        return this.left;
    }

    public Node getRight()
    {
        return this.right;
    }

    public abstract void accept(NodeVisitor visitor);
}
