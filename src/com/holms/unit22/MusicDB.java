package com.holms.unit22;

import com.holms.unit22.model.Artist;
import com.holms.unit22.model.Datasource;

import java.util.List;

public class MusicDB {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists();
        if (artists==null){
            System.out.println("No artists!");
            return;
        }

        for (Artist artist:artists){
            System.out.println("ID = "+artist.getId()+" , Name = "+artist.getName());
        }

        datasource.close();

        System.out.println("It's finished");
    }
}
