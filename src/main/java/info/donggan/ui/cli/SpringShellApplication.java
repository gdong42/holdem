package info.donggan.ui.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.shell.support.logging.HandlerUtils;

import java.util.logging.Logger;

/**
 * Copied from https://github.com/linux-china/spring-boot-starter-shell/, could
 * not find the published artifact from maven repo
 *
 * @author Gan Dong
 */
public class SpringShellApplication {

  public static void run(Object source, String... args) {
    run(new Object[]{source}, args);
  }

  public static void run(Object[] sources, String[] args) {
    ConfigurableApplicationContext ctx = new SpringApplication(sources).run(args);
    try {
      new BootShim(args, ctx).run();
    } finally {
      HandlerUtils.flushAllHandlers(Logger.getLogger(""));
    }
  }

}
