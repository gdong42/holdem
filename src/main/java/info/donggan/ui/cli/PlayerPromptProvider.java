package info.donggan.ui.cli;

import org.springframework.shell.plugin.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * Date: 11/02/2017
 * Time: 2:19 PM
 *
 * @author Gan Dong
 */
@Component
public class PlayerPromptProvider implements PromptProvider {

  private String name = "player";

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
}
