package by.makhon.spring;

import by.makhon.spring.bean.music.HipHopMusic;
import by.makhon.spring.configuration.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    private static final String APPLICATION_CONTEXT_PACKAGE = "by.makhon.spring";

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(APPLICATION_CONTEXT_PACKAGE);
//
//        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
//        musicPlayer.playMusic(Genre.ROCK);
//        musicPlayer.playMusic(Genre.CLASSICAL);
//
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        HipHopMusic music = context.getBean(HipHopMusic.class);
        System.out.println(music.getSongName());

        context.close();
    }
}
