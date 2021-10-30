package com.omer;

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int inFavor = 0;
                int isAgainst = 0;
                int abstain = 0;
                boolean vetoDropped = true;
                int i;
                System.out.println("Hello countries! Welcome to the UN!!\nyou can vote:\nin favor / against / abstain / veto:");
                for (i = 1; i < 11; i++) {
                    System.out.println("country #"+i+" please state your vote:");
                    String vote = scanner.nextLine();
                    if (vote.equals("veto")) {
                        vetoDropped = false;
                        break;
                    } else if (vote.equals("in favor")) {
                        inFavor++;
                    } else if (vote.equals("against")) {
                        isAgainst++;
                    } else if (vote.equals("abstain")) {
                        abstain++;
                    } else {
                        System.out.println("vote invalid!");
                        i--;
                    }
                }
                if (vetoDropped) {
                    System.out.println("The vote results are as followed:\nIn favor:\n" + inFavor + "\nAgainst:\n" + isAgainst + "\nAbstained:\n" + abstain);
                } else System.out.println("country#"+i+" has dropped veto! vote is over!");
            }
        }