package info.donggan.ui.cli;

import info.donggan.core.Game;
import info.donggan.core.model.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author gdong
 */
@Component
public class GameCommandRunner implements ApplicationRunner {

  @Value("${name:World}")
  private String name;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Game game = new Game();
    game.join(new Player("Alice"));
    game.join(new Player("Bob"));

    game.start();

    System.out.println(args.getOptionValues("name"));
    System.out.println(this.name);
  }
}
