package pl.edu.agh.tkk17.sample;

import java.lang.Math;

public class Interpreter
{
    public static void main(String []args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            Node tree = Parser.parse(scanner);
            float result = Evaluator.evaluate(tree);
            String repr;
            if (result - Math.floor(result) > 0) {
                repr = String.valueOf(result);
            } else {
                int intval = Math.round(result);
                repr = String.valueOf(intval);
            }
            System.out.println(repr);
        } catch (OutputableException e) {
            String message = e.getMessage();
            System.err.println("Interpretation failed. " + message);
        }
    }
}
