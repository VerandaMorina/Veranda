package class6;

import java.util.Scanner;

public class Homework4 {
    /*
    Write a program for user to enter his/hers birth month. Based on the month define the season.
    Example: if user is born in March, April, May → season =”Spring”
    if user is born in June, July, August →
    season =”Summer”  etc …
    At the end of the program we should see 1 output as “You were born is season __”.
     */
    public static void main(String[] args) {
        Scanner month=new Scanner(System.in);
        System.out.println("Enter birth month");
        String season=month.next();


        if (season.equals("March")|| season.equals("April")||season.equals("May")) {
            System.out.println("You were born in season Spring");
        } else if (season.equals("June")||season.equals("July")||season.equals("August")) {
            System.out.println("You were born in season Summer");
        } else if (season.equals("September")||season.equals("October")||season.equals("November")) {
            System.out.println("You were born in season Autumn");
        } else if (season.equals("December")||season.equals("January")||season.equals("February")) {
            System.out.println("You were born in season Winter");
        }
    }
}

