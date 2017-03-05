package info.donggan.util;

import info.donggan.core.model.Card;
import info.donggan.core.model.HandEvalResult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Date: 11/02/2017
 * Time: 8:33 PM
 *
 * @author Gan Dong
 */
public class HandEvalUtils {

  public static HandEvalResult eval(Collection<Card> hand,
      Collection<Card> communityCards) {
    List<Card> input = new ArrayList<>();
    input.addAll(hand);
    input.addAll(communityCards);

    return eval(input);
  }

  public static HandEvalResult eval(Collection<Card> input) {
    HandEvalResult result = new HandEvalResult();
    result.setPatternRank(HandEvalResult.PatternRank.HIGH_CARD);
    result.setScore(30000);
    // TODO to be implemented

//    Collections.sort(input);
    return result;
  }
}
