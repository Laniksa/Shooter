package com.company;

import Weapon.Weapon;
import Weapon.BigGun;
import Weapon.WaterPistol;

public class Player {
    private String name;
    private Weapon[] weaponSlots ;
    private int sizeWeapon = 10;

    public Player(String name, Weapon[] weaponSlots){
        this.name = name;
        weaponSlots = new Weapon[sizeWeapon];
        weaponSlots[0] = new BigGun();
        weaponSlots[1] = new WaterPistol();
    }

    public int getSlotsCount() {//количество слотов
        return weaponSlots.length;
    }

}
