package by.makhon.spring.configuration;

import by.makhon.spring.bean.music.ClassicMusic;
import by.makhon.spring.bean.music.HipHopMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public HipHopMusic getHipHopMusic() {
        HipHopMusic hipHopMusic = new HipHopMusic();
        hipHopMusic.setSongName(getClassicMusic().getSong());
        return hipHopMusic;
    }
}
