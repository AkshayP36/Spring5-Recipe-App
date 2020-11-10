public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>=0 && health<=200)
        this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void lossHealth(int damage){
        this.health=this.health-damage;
        System.out.println("health = "+health);
        if(this.health<=0)
            System.out.println("Player knocked out");
    }

    public int healthRemaining(){
        return this.health;
    }
}
