package kz.greetgo.springcourse;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
  @Value("${deviceName}")
  private String deviceName;
  @Value("${volume}")
  private String volume;
  private List<Music> musicList;

  @Autowired
  public MusicPlayer(List<Music> musicList) {
    this.musicList = musicList;
  }

  public String playMusic() {
    Music currentMusic = null;
    Random random = new Random();
    currentMusic = musicList.get(random.nextInt(musicList.size()));
    return "Playing: " + currentMusic.getName();
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public String getVolume() {
    return this.volume;
  }
}
