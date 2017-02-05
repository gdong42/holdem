package info.donggan.core.model;

/**
 * Represents a card
 *
 * @author gdong
 */
public class Card implements Comparable<Card> {

  private Suit suit;

  private Value value;

  public Card(Suit suit, Value value) {
    this.suit = suit;
    this.value = value;
  }

  public Suit getSuit() {
    return suit;
  }

  public Value getValue() {
    return value;
  }

  @Override
  public int compareTo(Card in) {
    return this.value.ordinal() - in.getValue().ordinal();
  }
}
