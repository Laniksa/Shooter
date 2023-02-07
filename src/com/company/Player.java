package com.company;

import Weapon.Weapon;
import Weapon.BigGun;
import Weapon.WaterPistol;
import Weapon.Pistol;
import Weapon.RPG;
import Weapon.Slingshot;

public class Player {
    private String name;
    private Weapon[] weaponSlots ;
    private int sizeWeapon = 5;

    public Player(String name){
        this.name = name;
        weaponSlots = new Weapon[sizeWeapon];
        weaponSlots[0] = new BigGun();
        weaponSlots[1] = new WaterPistol();
        weaponSlots[2] = new Pistol();
        weaponSlots[3] = new RPG();
        weaponSlots[4] = new Slingshot();


    }

    public int getSlotsCount() {//количество слотов
        return weaponSlots.length;
    }

    public String getName() {
        return name;
    }

    public void shotWithWeapon(int slot) {
        if(slot==-1){
            System.out.println("Выход из программы");
            return;
        }else if (slot < 0 || slot > weaponSlots.length){
            System.out.println("Вы ввели не существующий слот");
            return;
        }else{
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }



    }

}
