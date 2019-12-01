package com.brunoyam.unit_2;

import com.brunoyam.unit_2.models.BattleField;
import com.brunoyam.unit_2.models.BattleFieldImpl;

import java.io.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Application {

    public final static Properties properties = new Properties();
    public final static BattleField battleField = new BattleFieldImpl();

    public static void main(String[] args) throws IOException {
        //TODO: loadProperties
        //TODO: LoadNames
        //TODO: runCobsole

        Locale ru = new Locale("ru", "RU");

        Locale.setDefault(new Locale("ru", "RU"));
        properties.load(new FileInputStream("resources/application.properties"));
        ResourceBundle.getBundle("/resource/names", Locale.ENGLISH);


    }

    private static void startGame() throws IOException {
        BufferedReader concoleReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String command = concoleReader.readLine();

        }
    }

    private static void handleCommand(String command) {
        switch(command) {
            case "new":

        }
    }

}
