package kz.greetgo.springcourse;


import org.springframework.stereotype.Component;

@Component
public class IndiMusic implements Music {
  @Override
  public String getName() {
    return "Billie Eilish - bad guy";
  }
}
