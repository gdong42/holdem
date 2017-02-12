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

  enum PatternRank {

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
    FULL_HOUSE,
    FLUSH,
    STRAIGHT,
    THREE_OF_A_KIND,
    TWO_PAIR,
    PAIR,
    HIGH_CARD;

    private int baseRank;

    /**
     * base rank is the rank category this rank falls into.
     *
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
}
