package pl.edu.agh.tkk17.sample;

public class Token
{
    private TokenType type;
    private String value;
    private int position;

    public Token(TokenType type, int position, String value)
    {
        this.type = type;
        this.position = position;
        this.value = value;
    }

    public Token(TokenType type, int position)
    {
        this.type = type;
        this.position = position;
        this.value = "";
    }

    public TokenType getType()
    {
        return this.type;
    }

    public int getPosition()
    {
        return this.position;
    }

    public String getLocation()
    {
        String location = String.valueOf(position);
        return location;
    }

    public String getValue()
    {
        return this.value;
    }
}
