package pl.edu.agh.tkk17.sample;

import java.util.Collection;
import java.util.LinkedList;

public class UnexpectedTokenException extends OutputableException
{
    public UnexpectedTokenException(Token token)
    {
        super(unexpectedText(token) + ".");
    }

    public UnexpectedTokenException(Token token, TokenType expected)
    {
        super(unexpectedText(token) + expectedText(tokenName(expected)) + ".");
    }

    public UnexpectedTokenException(Token token, Collection<TokenType> expected)
    {
        super(unexpectedText(token) + expectedText(tokenName(expected)) + ".");
    }

    private static String unexpectedText(Token token)
    {
        return "Unexpected token " + token.getType().getName() + " at " + token.getLocation();
    }

    private static String expectedText(String expected)
    {
        return ", expecting " + expected;
    }

    private static String tokenName(TokenType type)
    {
        return type.getName();
    }

    private static String tokenName(Iterable<TokenType> types)
    {
        Collection<String> strlist = new LinkedList<String>();
        for (TokenType type : types) {
            String strtype = tokenName(type);
            strlist.add(strtype);
        }
        String str = String.join(", ", strlist);
        return str;
    }

}
