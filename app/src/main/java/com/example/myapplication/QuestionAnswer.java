package com.example.myapplication;

public class QuestionAnswer {

    public static String question[] ={
            "På vilket lager i OSI-modellen hittar du TCP?",
            "Hur många bitar innehåller ett IPv6 paket?",
            "Vad står ATM för?",
            "CSMA/CA använder RTS/CTS för att undvika 'Hidden terminal problem'?"
    };

    public static String choices [][] = {
            {"Lager 2", "Lager 4", "Lager 6", "Lager 3"},
            {"16", "128", "64", "32"},
            {"Asynchronus transfer mode", "Abbas transport medel", "Autmoated teller machine", "At the moment"},
            {"Ja", "Nej", "Kanske", "Om du vill"}
    };

    public static String correctAnswers[] = {
            "Lager 4",
            "128",
            "Asynchronus transfer mode",
            "Ja"
    };

}
