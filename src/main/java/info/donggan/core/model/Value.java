package info.donggan.core.model;

/**
 * Represents the value of a card
 *
 * @author gdong
 */
public enum Value {

  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K"),
  ACE("A");

  private String name;

  Value(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
