package info.donggan.core.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gdong
 */
public class Player {

  private String name;

  private List<Card> hand = new ArrayList<>(2);

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Card> getHand() {
    return hand;
  }

  public void addHand(Card card) {
    this.hand.add(card);
  }
}
