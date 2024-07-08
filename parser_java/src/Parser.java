import java.util.List;

public class Parser {

  private final List<Token> tokens;
  private int currentPos;
  private Token currentToken;
    
  Parser(List<Token> tokens) {
    this.tokens = tokens;
    currentPos = 0;
    currentToken = tokens.get(currentPos);
  }
