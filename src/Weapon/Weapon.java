package Weapon;

public class Weapon {
    private String name;
    private int slot;

   public Weapon(String name, int slot){
       this.name = name;
       this.slot = slot;
   }
    public Weapon(){
    }

   public String getName(){
       return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void shot(){
        System.out.println("Огонь!");
    }
}
