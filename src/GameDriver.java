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
            String[] input = scan.nextLine().toLowerCase().split(" ");
            String command = "";
            String type = "";
            String target = "";

            if (input.length == 3) {
                command = input[0];
                type = input[1];
                target = input[2];
            }
            if (input.length == 2) {
                command = input[0];
                type = input[1];
            }
            if (input.length == 1) {
                command = input[0];
            }

            if (command.equals("make")) {
                switch (type) {
                    case "barrel":
                        world.makeBarrel();
                        System.out.println("Barrel made!");
                        break;
                    case "chest":
                        world.makeChest();
                        System.out.println("Chest made!");
                        break;
                    case "goblin":
                        world.makeGoblin();
                        System.out.println("Goblin made!");
                        break;
                    case "human":
                        world.makeHuman();
                        System.out.println("Villager made!");
                        break;
                    case "":
                        System.out.println("Make what?");
                        break;
                    default:
                        System.out.println("You can't make this! Try again.");
                        break;
                }
            }
            if (command.equals("list")) {
                switch (type) {
                    case "chests":
                        System.out.println(world.listChests());
                        break;
                    case "people":
                        System.out.println(world.listPeople());
                        break;
                    case " ":
                        System.out.println("List what?");
                        break;
                    default:
                        System.out.println("This can't be listed, please try again");
                        break;
                }
            }
            //both are throwing null pointer exceptions
            if (command.equals("my")) {
                switch (type) {
                    case "info":
                        System.out.println(world.getPlayerInfo());
                        break;
                    case "inventory":
                        System.out.println(world.listPlayerInventory());
                        break;
                }
            }
            //This is more of a proof of concept, because we aren't sure how to implement it fully
            if (command.equals("use")) {
                System.out.println("use what?");
                if (type.equals("weapon")) {
                    System.out.println("target?");
                    //118 is because having a third substring caused errors when typing inputs with only 2 words
                    target = scan.nextLine().toLowerCase();
                    if (target.equals("person0")) {
                        world.useEquipment(world.player.getEquipment(0), world.people.get(0));
                        System.out.println("used weapon on person0!");
                    }
                }
            }
            if (command.equals("attack")) {
                System.out.println("attack what?");
                if (type.equals("weapon")) {
                    System.out.println("target?");
                    //118 is because having a third substring caused errors when typing inputs with only 2 words
                    target = scan.nextLine().toLowerCase();
                    if (target.equals("person 0")) {
                        world.useEquipment(world.player.getEquipment(0), world.people.get(0));
                        System.out.println("attacked person0!");
                    }
                }
            }
            //this method assumes that the first person created is a goblin, and the second is a human.
            //again, a proof of concept because we're not sure how to implement
            if (command.equals("transfer")) {
                System.out.println("Source?");

                IInventory source = null;
                IInventory dest = null;

                //workaround
                String desti = scan.nextLine().toLowerCase();
                switch(desti) {
                    case "player":
                        source = world.player;
                        break;
                    case "goblin":
                        source = world.people.get(0);
                    case "human":
                        source = world.people.get(1);
                    case "chest":
                        source = world.chests.get(0);
                    case "barrel":
                        source = world.barrels.get(0);
                    default:
                        System.out.println("Invalid source");
                }
                System.out.println("target?");
                String targ = scan.nextLine().toLowerCase();
                switch (targ) {
                    case "player":
                        dest = world.player;
                        break;
                    case "goblin":
                        dest = world.people.get(0);
                    case "human":
                        dest = world.people.get(1);
                    case "chest":
                        dest = world.chests.get(0);
                    case "barrel":
                        dest = world.barrels.get(0);
                    default:
                        System.out.println("Invalid source");
                }
                world.transferEquipment(source, dest);
                System.out.println("All equipment transferred!");
            }
            //again assuming that the first created person is a goblin, and second is a human here
            //unsure how to implement correctly but is proof of concept
            if (command.equals("lookat"))
            {
                switch(type) {
                    case "human":
                        System.out.println(world.people.get(0).toString());
                    case "goblin":
                        System.out.println(world.people.get(1).toString());
                    case "chest":
                        System.out.println(world.chests.get(0).toString());
                    case "barrel":
                        System.out.println(world.chests.get(0).toString());
                }
            }
            if (command.equals("exit")) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }
    }
}
