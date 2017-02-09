package info.donggan.core;

import info.donggan.core.model.Card;
import info.donggan.core.model.Deck;
import info.donggan.core.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gdong
 */
public class Game {

  private static final Logger logger = LoggerFactory.getLogger(Game.class);

  /**
   * The max player count a game can hold
   */
  public static final int MAX_PLAYER_COUNT = 22;

  private List<Player> players = new ArrayList<>();

  private Deck deck = new Deck();

  private List<Card> communityCards = new ArrayList<>();

  /**
   * The caller is responsible for not exceeding the maximum max player count
   * {@link #MAX_PLAYER_COUNT}, otherwise a runtime exception will be thrown
   *
   * @param player the player to join the game
   */
  public void join(Player player) {
    if (!isJoinable()) {
      throw new RuntimeException("too many players");
    }
    this.players.add(player);
  }

  private boolean isJoinable() {
    return this.players.size() < MAX_PLAYER_COUNT;
  }

  public void start() {
    if (players.size() < 2) {
      throw new RuntimeException("2 players are needed at least");
    }
    if (players.size() >= MAX_PLAYER_COUNT) {
      throw new IllegalStateException("Too many players");
    }
    logger.info(" ==== GAME STARTED ==== \n" +
        "  Players: {}", players);

    this.deck.shuffle();

    deal();

    determine();
  }

  private void determine() {

  }

  private void deal() {

    // we strictly deal the card one by one, instead of dealing 2 at once for each

    // first card
    for (Player player: players) {
      player.addHand(deck.dealCard());
    }
    // second card
    for (Player player: players) {
      player.addHand(deck.dealCard());
    }

    // pre flop bet

    deck.burnCard();

    // 3 community cards
    for (int i = 0; i < 3; i++) {
      communityCards.add(deck.dealCard());
    }

    // flop bet

    deck.burnCard();
    communityCards.add(deck.dealCard());

    // turn bet

    deck.burnCard();
    communityCards.add(deck.dealCard());

    // river bet


  }
}
