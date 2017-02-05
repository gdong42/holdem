package info.donggan.core.model;

/**
 * Represents the suit of a card
 *
 * @author gdong
 */
public enum Suit {

  SPADES("♠"),
  HEARTS("♥"),
  DIAMONDS("♦"),
  CLUBS("♣");

  private String name;

  Suit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
