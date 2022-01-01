package com.priyanshu.springboot.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Anime_Downloader")
@AllArgsConstructor
public class Anime {
    //    @Id
//    private String Id;
    private String Provider;
    private String Anime_Name;
    private String Season;
    private String EP;
    private String Quality;
    private String Audio;
    private String Air_Day;

//    public Anime(String provider, String anime_Name, String season, String EP, String quality, String audio, String air_Day) {
//        Provider = provider;
//        Anime_Name = anime_Name;
//        Season = season;
//        this.EP = EP;
//        Quality = quality;
//        Audio = audio;
//        Air_Day = air_Day;
//    }
}
