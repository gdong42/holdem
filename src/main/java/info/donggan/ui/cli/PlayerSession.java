package info.donggan.ui.cli;

import info.donggan.core.Game;
import info.donggan.core.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.plugin.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * Date: 11/02/2017
 * Time: 2:19 PM
 *
 * @author Gan Dong
 */
@Component
public class PlayerSession implements PromptProvider {

  private String name = "player";

  @Autowired
  private Game game;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getPrompt() {
    return "[" + this.name + "]> ";
  }

  @Override
  public String getProviderName() {
    return "Player Prompt Provider";
  }

  /**
   * joins a game and play a new game
   */
  public void play() {
    Player player = new Player(name);
    game.join(player);
    game.start();
  }

  /**
   * adds a bot to game with given name
   *
   * @param botName the name of the bot player
   */
  public void addBot(String botName) {
    Player player = new Player(botName);
    game.join(player);
  }

  /**
   * returns current players as a String that is ready to print
   * @return
   */
  public String printPlayers() {
    StringBuilder sb = new StringBuilder();
    game.getPlayers().forEach(p -> sb.append('\n').append(p).append('\n'));
    return sb.toString();
  }
}
