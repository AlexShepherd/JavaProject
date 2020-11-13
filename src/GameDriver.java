import java.util.Scanner;
/**
 * Class Name: GameDriver <br>
 * Class Purpose: manipulates the equipment and equipment driver via CLI <br>
 *
 * <hr>
 * Date created: 10-13-2020
 * Date last modified: 10-13-2020
 * @author Alex Shepherd
 */
public class GameDriver {
    /**
     * Method Name: scrollTerminal <br>
     * Method Purpose: used to "clear" the terminal <br>
     *
     * <hr>
     * Date created: 10-19-2020 <br>
     * Date last modified: 10-25-2020 <br>
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
     * Date last modified: 10-19-2020 <br>
     *
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        EquipmentManager eqm = new EquipmentManager();
        boolean gameOver = false;

        while (!gameOver) {
        System.out.println("What would you like to do?");
        Thread.sleep(1000);
        System.out.println("You can...");
        Thread.sleep(1000);
        System.out.println("\tClear all\n\tCount Equipment\n\tCount Armor\n\tCount Weapons\n\tList All\n\tList All Details" +
                "\n\tAdd Equipment\n\tRemove Equipment\n\tQuit");

        String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "clear all":
                    eqm.clearAll();
                    System.out.println("Equipment cleared");
                    return;
                case "count equipment":
                    System.out.println("You currently have " + eqm.countEquipment() + "pieces of Equipment.");
                    return;
                case "count armor":
                    System.out.println("You currently have " + eqm.countArmor() + "pieces of Armor.");
                    break;

                case "count weapons":
                    System.out.println("You currently have " + eqm.countArmor() + "weapons.");
                    break;
                case "list all":
                    scrollTerminal();
                    System.out.println(eqm.getEquipmentList());
                    break;
                case "list all details":
                    scrollTerminal();
                    System.out.println(eqm.getEquipmentListDetails());
                    break;
                case "add equipment":
                    System.out.println("Please type 'add (equipment you'd like to add)'\tExample: add helmet" +
                            "\nYou can add:\n\tHelmet\n\tPlackart\n\tSpear" +
                            "\n\tSword\n\tlongBow\n\tthrowingAxe");
                    String equipToAdd = scanner.nextLine().toLowerCase();
                    String[] addSplit = equipToAdd.split(" ");

                    if (addSplit[0].equals("add")) {
                        switch (addSplit[1]) {
                            case "helmet":
                                Helmet helmet = new Helmet();
                                eqm.addHelmet(helmet);
                                System.out.println("\nDefault helmet added.\n");
                                break;
                            case "plackart":
                                Plackart plackart = new Plackart();
                                eqm.addPlackart(plackart);
                                System.out.println("\nDefault plackart added.\n");
                                break;
                            case "spear":
                                Spear spear = new Spear();
                                eqm.addSpear(spear);
                                System.out.println("\nDefault spear added.\n");
                                break;
                            case "sword":
                                Sword sword = new Sword();
                                eqm.addSword(sword);
                                System.out.println("\nDefault sword added.\n");
                                break;
                            case "longbow":
                                LongBow longbow = new LongBow();
                                eqm.addLongBow(longbow);
                                System.out.println("\nDefault longBow added.\n");
                                break;
                            case "throwingaxe":
                                ThrowingAxe throwingaxe = new ThrowingAxe();
                                eqm.addThrowingAxe(throwingaxe);
                                System.out.println("\nDefault throwingAxe added.\n");
                                break;
                            default:
                                System.out.println("\nThat is not a piece of equipment that you can add.\n");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid input");
                    }
                    break;
                case "remove equipment":
                    System.out.println("Please type 'rmv (equipment you'd like to remove) (index number)" +
                            "'\tExample: rmv helmet 0" +
                            "\nYou can remove:\n\tHelmet\n\tPlackart\n\tSpear" +
                            "\n\tSword\n\tlongBow\n\tthrowingAxe");
                    String equipToRemove = scanner.nextLine().toLowerCase();
                    String[] rmvSplit = equipToRemove.split(" ");
                    int idxSplit = Integer.parseInt(rmvSplit[2]);

                    if (rmvSplit[0].equals("rmv")) {
                        switch (rmvSplit[1]) {
                            case "helmet":
                                eqm.removeEquipment("Helmet", idxSplit);
                                System.out.println("\nHelmet removed.\n");
                                break;
                            case "plackart":
                                eqm.removeEquipment("Plackart", idxSplit);
                                System.out.println("\nPlackart removed.\n");
                                break;
                            case "spear":
                                eqm.removeEquipment("Spear", idxSplit);
                                System.out.println("\nSpear removed.\n");
                                break;
                            case "sword":
                                eqm.removeEquipment("Sword", idxSplit);
                                System.out.println("\nSword removed.\n");
                                break;
                            case "longbow":
                                eqm.removeEquipment("LongBow", idxSplit);
                                System.out.println("\nLongBow removed.\n");
                                break;
                            case "throwingaxe":
                                eqm.removeEquipment("ThrowingAxe", idxSplit);
                                System.out.println("\nThrowingAxe removed.\n");
                                break;
                            default:
                                System.out.println("This is not a piece of equipment that you can remove.");
                                break;
                        }
                    }
                case "get info":
                    System.out.println("Please type 'info (equipment you'd like info about) (index number)" +
                            "'\tExample: info helmet 0" +
                            "\nYou can get info on your:\n\tHelmet\n\tPlackart\n\tSpear" +
                            "\n\tSword\n\tlongBow\n\tthrowingAxe");
                    String equipToInfo = scanner.nextLine().toLowerCase();
                    String[] infoSplit = equipToInfo.split(" ");
                    int infoIdxSplit = Integer.parseInt(infoSplit[2]);

                    if (infoSplit[0].equals("info")) {
                        switch (infoSplit[1]) {
                            case "helmet":
                                eqm.getEquipmentDetails("Helmet", infoIdxSplit);
                                break;
                            case "plackart":
                                eqm.getEquipmentDetails("Plackart", infoIdxSplit);
                                break;
                            case "spear":
                                eqm.getEquipmentDetails("Spear", infoIdxSplit);
                                break;
                            case "sword":
                                eqm.getEquipmentDetails("Sword", infoIdxSplit);
                                break;
                            case "longbow":
                                eqm.getEquipmentDetails("LongBow", infoIdxSplit);
                                break;
                            case "throwingaxe":
                                eqm.getEquipmentDetails("ThrowingAxe", infoIdxSplit);
                                break;
                            default:
                                System.out.println("This is not a piece of equipment that you can get info on.");
                                break;
                        }
                    }
                case "quit":
                    gameOver = true;
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
