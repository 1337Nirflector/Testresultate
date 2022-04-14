package com.corionsoftware.tests;

import java.util.HashMap;
import java.util.Scanner;

public class Test3 {

    private final HashMap<String, Integer> players;
    private final int playersAmount;

    public Test3() {
        this.players = new HashMap<>();
        this.playersAmount = 3;
    }

    public void addPlayer(String name, int player) {
        players.put(name, player);
    }

    public void getWinner() {
        String[] nameArr = new String[players.size()];
        nameArr = players.keySet().toArray(nameArr);

        String bestPlayer = nameArr[0];
        int maxVal = players.get(nameArr[0]);

        for (String player : nameArr){
            if(players.get(player) > maxVal) {
                bestPlayer = player;
                maxVal = players.get(player);
            }
        }

        System.out.println(bestPlayer);
    }

    public void query() {
        System.out.println("Test 3: Bitte gebe die 3 Teilnehmernamen als String oder Char ein!");
        Scanner scanner = new Scanner(System.in);
        this.calculate(scanner.nextLine().split(" "));
    }

    public void calculate(String[] values) {
        for (int i = 1; i < playersAmount; i++) {
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            this.addPlayer(name, points);
        }
        this.getWinner();
    }

}
