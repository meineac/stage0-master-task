package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }

        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println(seasons[(monthNumber / 3) % 4]);
    }

}
