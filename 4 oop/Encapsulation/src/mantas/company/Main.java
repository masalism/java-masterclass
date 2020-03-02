package mantas.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mantas";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining healt = " + player.healtRemaing());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining healt = " + player.healtRemaing());

        EnhancedPlayer player = new EnhancedPlayer("Mantas", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
