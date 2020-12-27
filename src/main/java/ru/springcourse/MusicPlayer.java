package ru.springcourse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class MusicPlayer {

    private List<Music> listMusic = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {

    }

    public void playMusic() {
        listMusic.forEach(music -> System.out.println(music.getSong()));
    }

}
