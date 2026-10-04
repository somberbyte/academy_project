public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.hp=100;
        player1.armor="iron";
        player1.damage=0;
        player1.food="Apple";

        Player.fight();
        Player.defend();
        Player.heal();
    }
}
