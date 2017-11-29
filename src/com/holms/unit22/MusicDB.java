package com.holms.unit22;

import com.holms.unit22.model.Datasource;

public class MusicDB {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        datasource.close();
        System.out.println("It's finished");
    }
}
