package com.codewithmosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.print("Enter a value to play (r, p, s) :");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                } else
                    System.out.println(playerMove + " it's not a valid value !!");
            }
            System.out.println("The computer played : " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Tie!!");

            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You loose !!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win !!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win !!");
                } else if (computerMove.equals("s")) {
                    System.out.println("You loose !!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You loose !!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win !!");
                }
            }
            System.out.println("Wanna play again? (y/n)");
            String answer = scanner.nextLine();
            if (!answer.equals("y")){
                break;
            }
        }
    }
}
