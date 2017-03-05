package info.donggan.core.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gdong
 */
public class Player {

  private static final Logger logger = LoggerFactory.getLogger(Player.class);

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
    logger.info(" ==== Player [{}] got 1 card", this.name);
  }

  public void clearHand() {
    this.hand.clear();
  }

  @Override
  public String toString() {
    return name + ": " + hand;
  }
}
