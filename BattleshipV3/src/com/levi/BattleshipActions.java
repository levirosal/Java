package com.levi;

import java.util.*;

/**
 * Checks and other actions of the game.
 * @version 3.0
 * @since 2019
 * @author Levi Rosal
 */
public class BattleshipActions {
    private static List<String> locations1;
    private static List<String> locations2;


    /**
     * Sets locations of ships.
     * @param player Player
     * @param locs locations of ships.
     */
    public void setAllShips(final int player, final List<String> locs) {
        if (player == 1) {
            locations1 = locs;
        } else {
            locations2 = locs;
        }
    }

    /**
     * Removes location of ArrayList.
     * @param player Player
     * @param location Location for remove.
     */
    public void removeLocation(final int player, final String location) {
        if (player == 1) {
            locations2.remove(location);

        } else {
            locations1.remove(location);
        }
    }

    /**
     * Returns locations of ship.
     * @param player Player
     * @return List - Locations of ship.
     */
    public List<String> getLocations(final int player) {
        if (player == 1) {
            return locations2;

        }
        return locations1;

    }

    /**
     * Gets guess player.
     * @return String - Value user guess.
     */
    public String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the location of your shot: ");
        String inputLine = in.nextLine();

        if (inputLine.length() == 0){
            return null;
        }
        return inputLine.toLowerCase();
    }

    /**
     * Checks the user's guess and removes the location if the guess is correct.
     * @param player Player.
     * @param userGuess User Guess.
     * @return String - Result user guess.
     */
    public String checkShot(int player, final String userGuess) {
        String result = "miss";

        if(getLocations(player).contains(userGuess)) {
            result = "hit";
            System.out.println("You HIT !!!\n");
            removeLocation(player, userGuess);
        }

        if(getLocations(player).size() == 0) {
            result = "kill";
            System.out.println("YOU DESTROYED !!!\n");
        }

        if(result.equals("miss")) {
            System.out.println("You missed the shot.\n");
        }

        return result;
    }

    /**
     * Shows the result of game.
     */
    public void finish(final int player) {
        System.out.println("All ships are dead !!!");
        System.out.println("Player " + player + " Wins !!!");
    }
}
