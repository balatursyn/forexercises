package kz.greetgo.springcourse;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "kz.greetgo.springcourse")
@PropertySource("musicPlayer.properties")
public class SpringConf {
  @Bean
  public Music rockMusicBean() {
    return new RockMusic();
  }

  @Bean
  public Music classicalMusicBean() {
    return new ClassicalMusic();
  }

  @Bean
  public Music metalMusicBean() {
    return new MetalMusic();
  }

  @Bean
  public Music indiMusicBean() {
    return new IndiMusic();
  }

  @Bean
  public MusicPlayer musicPlayerBean() {
    ArrayList<Music> musicArrayList = new ArrayList<>();
    musicArrayList.add(rockMusicBean());
    musicArrayList.add(classicalMusicBean());
    musicArrayList.add(metalMusicBean());
    musicArrayList.add(indiMusicBean());
    return new MusicPlayer(musicArrayList);
  }
}
