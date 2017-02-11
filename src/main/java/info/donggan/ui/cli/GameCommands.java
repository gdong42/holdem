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
  private PlayerPromptProvider playerPromptProvider;

  @CliAvailabilityIndicator({ "hello world" })
  public boolean helloworld() {
    return true;
  }

  @CliAvailabilityIndicator({ "set" })
  public boolean isSetAvailable() {
    return true;
  }

  @CliCommand(value = "set", help = "Config settings")
  public String setName(
      @CliOption(key = {
          "name" }, mandatory = false, unspecifiedDefaultValue = "player", help = "Set your name")
      final String name
  ) {
    if (!StringUtils.isEmpty(name)) {
      this.playerPromptProvider.setName(name);
    }
    return "OK, name set to " + name;
  }

  @CliCommand(value = "hello world", help = "Echo hello world")
  public String helloworld(
      @CliOption(key = {
          "message" }, mandatory = false, help = "the hello world message")
      final String message,

      @CliOption(key = {
          "location" }, mandatory = false, help = "your location", specifiedDefaultValue = "At work")
      final String location) {
    return "Hello world: " + message + ", greetings from " + location;
  }
}
