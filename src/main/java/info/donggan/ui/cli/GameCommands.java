package info.donggan.ui.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.shell.support.util.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author gdong
 */
@Component
public class GameCommands implements CommandMarker {

  @Autowired
  private PlayerSession playerSession;

  @CliAvailabilityIndicator({ "set" })
  public boolean isSetAvailable() {
    return true;
  }

  @CliAvailabilityIndicator({ "start" })
  public boolean isStartAvailable() {
    return true;
  }

  @CliAvailabilityIndicator({ "add bot" })
  public boolean isAddBotAvailable() {
    return true;
  }

  @CliAvailabilityIndicator({ "ls" })
  public boolean isLsAvailable() {
    return true;
  }

  /**
   * configuration command
   *
   * @param name name to be customized
   * @return success message
   */
  @CliCommand(value = "set", help = "Config settings")
  public String setName(
      @CliOption(key = { "name" }, mandatory = false,
          unspecifiedDefaultValue = "player", help = "Set your name")
      final String name
  ) {
    if (!StringUtils.isEmpty(name)) {
      this.playerSession.setName(name);
    }
    return "OK, name set to " + name;
  }

  /**
   * Adds a bot player
   *
   * @param name the name of the bot
   */
  @CliCommand(value = "add bot", help = "Add a bot with given name")
  public String addBot(
      @CliOption(key = {
          "name" }, mandatory = true, help = "the name of the bot") String name) {
    this.playerSession.addBot(name);
    return "Bot " + name + " added.";
  }

  /**
   * starts a new game
   */
  @CliCommand(value = "start", help = "Start the game")
  public void start() {
    this.playerSession.play();
  }

  @CliCommand(value = "ls", help = "list the players")
  public String ls() {
    return this.playerSession.printPlayers();
  }
}
