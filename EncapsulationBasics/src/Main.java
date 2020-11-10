public class Main {
    public static void main(String[] args) {
        /*Player player = new Player();
        player.name= "Tim";
        //player.health=20;
        player.weapon="Sword";
        int damage= 10;
        player.lossHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());

        damage= 20;
        //player.health=300;
        player.lossHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());
    }*/

        EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Arrow");
        System.out.println("Initial player health is = " + player.getHealth());
    }
}
