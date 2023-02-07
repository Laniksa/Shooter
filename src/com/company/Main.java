package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player = new Player("Вася");

        System.out.format("У игрока " + player.getName() + ", " + player.getSlotsCount() + " слотов с оружием,"
                        + " введите номер ( от 0 до " + player.getSlotsCount() + " ), чтобы выстрелить,"
                        + " -1 чтобы выйти%n");
        int slot = scan.nextInt();
        player.shotWithWeapon(slot);
    }
}
