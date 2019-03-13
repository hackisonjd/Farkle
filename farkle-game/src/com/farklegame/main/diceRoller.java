package com.farklegame.main;

import java.util.Arrays;
import java.util.Random;

public class diceRoller {
    public static int[] arr = new int[6];

    public static void newRoll(){
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int dSix = rand.nextInt(6) + 1;
            arr[i] = dSix;
        }
    }
    public static void outputScores(){
        System.out.println("Here are your scores!");
        System.out.println(Arrays.toString(arr));
    }
}
