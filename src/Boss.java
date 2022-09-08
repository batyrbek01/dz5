public class Boss {
    private int helth;
    private  int damage;
    private String typeDefence;

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

    public Boss (int health, int damage, String typeDefence){
        this.helth = health;
        this.damage = health;
        this.typeDefence = typeDefence;



    }



    }


