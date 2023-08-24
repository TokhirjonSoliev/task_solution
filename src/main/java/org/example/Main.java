package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        LocalDate startDate = LocalDate.of(fromYear, 01, 01);
        LocalDate endDate = LocalDate.of(toYear, 12, 31);

        while (startDate.isBefore(endDate)) {

            String[] str = String.valueOf(startDate).split("-");
            StringBuilder builder = new StringBuilder(str[0]);

            StringBuilder sb = new StringBuilder(str[1]).append(str[2]);

            if (builder.reverse().toString().equals(sb.toString()))
                System.out.println(startDate);

            startDate = startDate.plusDays(1);

        }
    }
}