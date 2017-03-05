package info.donggan.core.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 11/02/2017
 * Time: 9:47 PM
 *
 * @author Gan Dong
 */
public class HandEvalResult {

  public enum PatternRank {

    /**
     * 1 in this category: A ~ 10
     */
    ROYAL_FLUSH(1),

    /**
     * 9 ( K - 5 + 1) ranks in this category: [K ~ 10, 5 ~ A]
     */
    STRAIGHT_FLUSH(10),

    /**
     * 156 ( P(13,12) = 13 x 12) ranks in this category
     */
    FOUR_OF_A_KIND(100),

    /**
     * 156 ( P(13, 12) = 13 x 12) ranks in this category
     */
    FULL_HOUSE(500),

    /**
     * 1287 =( 13!/(5! x 8!) ) ranks in this category
     */
    FLUSH(1000),

    /**
     * 9 ( K - 5 + 1) ranks in this category: [K ~ 10, 5 ~ A]
     */
    STRAIGHT(2000),

    /**
     * 858 = 13 * C(12, 2) = 13 x 12 x 11 / 2 ranks in this category
     */
    THREE_OF_A_KIND(3000),

    /**
     * 858 = C(13, 2) x 11 = 13 x 12 x 11 / 2 ranks in this category
     */
    TWO_PAIR(4000),

    /**
     * 6435 = 13 x C(12, 4) = 13 x (12! / (4! x 8!)) ranks in this category, at
     * most ( some are of equal rank)
     */
    PAIR(11000),

    /**
     * All cases beyond 20000 are of this category
     */
    HIGH_CARD(20000);

    private int baseRank;

    /**
     * base rank is the rank category this rank falls into.
     * <p>
     * together with the card value decides the hand score
     *
     * @param baseRank the category rank of this hand pattern
     */
    PatternRank(int baseRank) {
      this.baseRank = baseRank;
    }
  }

  private PatternRank patternRank;

  private int score;

  /**
   * The sorted cards of the hand consisting of this result
   */
  private List<Card> cards = new ArrayList<>(5);

  public PatternRank getPatternRank() {
    return patternRank;
  }

  public void setPatternRank(
      PatternRank patternRank) {
    this.patternRank = patternRank;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }
}
