package pl.edu.agh.tkk17.sample;

import java.io.PrintStream;

public class Generator
{
    public static void generate(Node tree, PrintStream output)
    {
        output.println(".global main");
        output.println(".text");
        output.println("main:");
        generateRpn(tree, output);
        output.println("mov $format, %rdi");
        output.println("pop %rsi");
        output.println("xor %rax, %rax");
        output.println("call printf");
        output.println("ret");
        output.println("format:");
        output.println(".asciz \"%d\\n\"");
    }

    private static void generateRpn(Node node, PrintStream output)
    {
        RpnGeneratorVisitor visitor = new RpnGeneratorVisitor(output);
        node.accept(visitor);
    }

}
