package by.makhon.spring.bean.music;

import org.springframework.stereotype.Component;

public class HipHopMusic implements Music {

    private String songName;

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public String getSong() {
        return "Kanye West - No Church In The Wild";
    }
}
