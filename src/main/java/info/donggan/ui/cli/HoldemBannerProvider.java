package info.donggan.ui.cli;

import org.springframework.shell.plugin.BannerProvider;
import org.springframework.stereotype.Component;

/**
 * Date: 11/02/2017
 * Time: 2:05 PM
 *
 * @author Gan Dong
 */
@Component
public class HoldemBannerProvider implements BannerProvider {
  @Override
  public String getBanner() {
    return "  __                                 .__           .__       .___              \n" +
        "_/  |_  ____ ___  ________    ______ |  |__   ____ |  |    __| _/____   _____  \n" +
        "\\   __\\/ __ \\\\  \\/  /\\__  \\  /  ___/ |  |  \\ /  _ \\|  |   / __ |/ __ \\ /     \\ \n" +
        " |  | \\  ___/ >    <  / __ \\_\\___ \\  |   Y  (  <_> )  |__/ /_/ \\  ___/|  Y Y  \\\n" +
        " |__|  \\___  >__/\\_ \\(____  /____  > |___|  /\\____/|____/\\____ |\\___  >__|_|  /\n" +
        "           \\/      \\/     \\/     \\/       \\/                  \\/    \\/      \\/ ";
  }

  @Override
  public String getVersion() {
    return "0.0.1a";
  }

  @Override
  public String getWelcomeMessage() {
    return "Welcome! Good luck. Type `help` to print help message";
  }

  @Override
  public String getProviderName() {
    return "Holdem Banner";
  }
}
