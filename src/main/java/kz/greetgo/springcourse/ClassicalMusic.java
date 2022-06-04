package kz.greetgo.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
  
  @Override
  public String getName() {
    return "Beethoven - Moonlight sonata";
  }

}
