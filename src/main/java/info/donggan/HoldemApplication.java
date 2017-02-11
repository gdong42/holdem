package info.donggan;

import info.donggan.ui.cli.SpringShellApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HoldemApplication {

  public static void main(String[] args) throws IOException {
    SpringShellApplication.run(HoldemApplication.class, args);
  }
}
