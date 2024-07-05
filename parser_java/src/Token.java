public class Token {
  public enum Type {
    NUMBER, PLUS, MINUS, MULTIPLY, DIVIDE
  }

  public final Type type;
  public final String value;

  public Token(Type type, String value) {
    this.type = type;
    this.value = value;
  }
}
