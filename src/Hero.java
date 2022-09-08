public class Hero {
    private int health;
   private  int damage;
   private String typeAttack;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public Hero(int health, int damage, String typeAttack) {
        this.health = health;
        this.damage = damage;
        this.typeAttack = typeAttack;
    }
}
