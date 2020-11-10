public class Player {
    public String name;
    public int health;
    public String weapon;

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
