package pl.edu.agh.tkk17.sample;

import java.io.PrintStream;

public class RpnGeneratorVisitor implements NodeVisitor
{
    private PrintStream output;

    public RpnGeneratorVisitor(PrintStream output)
    {
        this.output = output;
    }

    public void visit(NodeAdd node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        this.output.println("pop %r10");
        this.output.println("pop %r11");
        this.output.println("add %r10, %r11");
        this.output.println("push %r11");
    }

    public void visit(NodeMul node)
    {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        this.output.println("pop %r10");
        this.output.println("pop %r11");
        this.output.println("imul %r10, %r11");
        this.output.println("push %r11");
    }

    public void visit(NodeNumber node)
    {
        String value = node.getValue();
        this.output.println("push $" + value);
    }
}
