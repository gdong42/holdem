package info.donggan.core.model;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author gdong
 */
public class Deck {

  private LinkedList<Card> cards;

  public Deck() {
    init();
  }

  private void init() {
    cards = new LinkedList<>();
    for (Suit suit: Suit.values()) {
      for(Value value: Value.values()) {
        Card card = new Card(suit, value);
        cards.add(card);
      }
    }
  }

  /**
   *  shuffle this deck
   */
  public void shuffle() {
    init();
    Collections.shuffle(cards);
  }

  public Card dealCard() {
    return cards.removeFirst();
  }

  public void burnCard() {
    cards.removeFirst();
  }
}
