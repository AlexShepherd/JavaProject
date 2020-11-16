// ---------------------------------------------------------------------------
// File name: GameDriver.java
// Project name: Game Project
// ---------------------------------------------------------------------------
// Creator’s name and email: Alex Shepherd
// Course-Section: CSCI-1260-900
// Creation Date: 10-13-2020
// Date of Last Modification: 11/15/20
// ---------------------------------------------------------------------------

import java.util.Scanner;
/**
 * Class Name: GameDriver <br>
 * Class Purpose: manipulates the equipment and equipment driver via CLI <br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 11/14/2020
 * @author Alex Shepherd
 */
public class GameDriver {
    private static World world = new World();
    private static boolean gameOver = false;
    /**
     * Method Name: scrollTerminal <br>
     * Method Purpose: used to "clear" the terminal <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 11-14-2020 <br>
     * @author Alex Shepherd
     */
    public static void scrollTerminal()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("\n");
        }
    }
    /**
     * Method Name: main <br>
     * Method Purpose: main method <br>
     *
     * <hr>
     * Date created: 10-13-2020 <br>
     * Date last modified: 11-14-2020 <br>
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (!gameOver) {
            System.out.println("What would you like to do?");
            String input = scan.nextLine().toLowerCase();

            switch (input) {
                case "make barrel":
                    world.makeBarrel();
                    System.out.println("Barrels made!");
                    break;
                case "make chest":
                    world.makeChest();
                    System.out.println("Chests made!");
                    break;
                case "make goblin":
                    world.makeGoblin();
                    System.out.println("Goblins Made!");
                    break;
                case "make human":
                    world.makeHuman();
                    System.out.println("Villager Made!");
                    break;
                case "list people":
                    System.out.println(world.listPeople());
                    break;
                case "my info":
                    System.out.println(world.getPlayerInfo());
                case "my inventory":
                    System.out.println(world.listPlayerInventory());
                case "use weapon human1":
                    //no weapon specifier that i see
                    world.useEquipment(world.player.getEquipment(0), world.human1);

                    //bad design, searching an array would be better in hindsight
                case "transfer":
                    System.out.println("Source?");

                    IInventory source = null;
                    IInventory dest = null;

                    input = scan.nextLine().toLowerCase();
                    if (input.equals("player"))
                        source = world.player;

                    if (input.equals("barrel1"))
                        source = world.barrel1;

                    if (input.equals("barrel2"))
                        source = world.barrel2;

                    if (input.equals("barrel3"))
                        source = world.barrel3;

                    if (input.equals("chest1"))
                        source = world.chest1;

                    if (input.equals("chest2"))
                        source = world.chest2;

                    if (input.equals("goblin1"))
                        source = world.goblin1;

                    if (input.equals("goblin2"))
                        source = world.goblin2;

                    if (input.equals("human1"))
                        source = world.human1;

                    System.out.println("Destination?");
                    if (input.equals("player"))
                        dest = world.player;

                    if (input.equals("barrel1"))
                        dest = world.barrel1;

                    if (input.equals("barrel2"))
                        dest = world.barrel2;

                    if (input.equals("barrel3"))
                        dest = world.barrel3;

                    if (input.equals("chest1"))
                        dest = world.chest1;

                    if (input.equals("chest2"))
                        dest = world.chest2;

                    if (input.equals("goblin1"))
                        dest = world.goblin1;

                    if (input.equals("goblin2"))
                        dest = world.goblin2;

                    if (input.equals("human1"))
                        dest = world.human1;

                    world.transferEquipment(source, dest);
                    System.out.println("All equipment transferred!");

                case "exit":
                    System.out.println("Thanks for playing!");
                    System.exit(0);
            }
        }
    }
}