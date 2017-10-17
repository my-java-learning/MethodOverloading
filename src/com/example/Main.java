package com.example;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(13);
        calculateScore();

        System.out.println("Centimeters : " + calcFeetAndInchesToCentimeters(100));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unknown player scored " + score + " points");
        return score*1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0 && inches <= 12)){
            return (inches + feet * 12) * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches >= 0 ){
            return calcFeetAndInchesToCentimeters((int) inches / 12 , (int) inches % 12);
        }
        return -1;
    }
}
