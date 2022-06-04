package kz.greetgo.springcourse;


import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music {



  @Override
  public String getName() {
    return "Rammstein - Rosenrot";
  }

}
