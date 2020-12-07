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

    private MakeRooms makeMap = new MakeRooms();
    private final Map map = makeMap.getMap();
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
    public static void main(String[] args) throws Exception {
        Human player = new Human("Player");
        MakeRooms makeMap = new MakeRooms();
        Map map = makeMap.getMap();
        boolean gameOver = false;

        Scanner a = new Scanner(System.in);

        Room room = map.getRoom("Shelter");
        while(!gameOver) {
//            System.out.println("Welcome to Passing Team's Game!\n");
//            Thread.sleep(2000);
//            System.out.println("You can type 'help' to view all valid commands.");
//            Thread.sleep(2000);
//            System.out.println("Good luck!");
//            Thread.sleep(2000);
//            scrollTerminal();
//            System.out.println("...");
//            Thread.sleep(2000);
//            System.out.println("You wake up...");
//            Thread.sleep(2000);
//            System.out.println("You are in a damp room. You don't know how you got here.");
//            Thread.sleep(1000);
//            System.out.println("You see a barrel in the corner. You see a door." +
//                            "You can... " + "[loot barrel], [exit]");
            
            String input = a.nextLine().toLowerCase();
            String[] parsedStr = input.split(" ", -1);

            switch(parsedStr[0]) {
                case "help":
                    System.out.println("Commands: [loot barrel], [exit]");
                case "loot":
                    if (parsedStr[1].equals("barrel")) {
                        player.transferAllEquipmentFrom(room.barrels.get(0));
                        System.out.println("You loot the barrel.");
                    }
                    else {
                        System.out.println("Try looting the barrel!");
                    }
                    continue;
                case "exit":
                     room = map.getRoom("Shelter");
                     System.out.println("You open the door to the outside world.");
                     Thread.sleep(1500);
                     break;
                default:
                    System.out.println("Invalid input; try again");
                    continue;
            }

            room = map.getRoom("Wasteland");

            System.out.println("The world is barren and orange. You see a shed in the distance..");
            Thread.sleep(1500);
            input = a.nextLine().toLowerCase();
            parsedStr = input.split(" ", -1);

            switch(parsedStr[0]) {
                case "help":
                    System.out.println("Commands: [exit]");
                    return;
                case "exit":
                    room = map.getRoom("Shelter");
                    System.out.println("You trek through dirt and rubble to the shed.");
                    break;
                default:
                    System.out.println("Invalid input; try again");
                    continue;
            }

            gameOver = true;
        }
    }
}
