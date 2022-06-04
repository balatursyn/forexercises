package kz.greetgo.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

  @Override
  public String getName() {
    return "AC/DC - Highway to Hell";
  }


}
