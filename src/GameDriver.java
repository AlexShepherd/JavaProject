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
        
    }
}

