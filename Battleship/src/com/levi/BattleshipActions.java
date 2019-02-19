package com.levi;

import java.util.*;

/**
 * @version 2.0
 * @since 2019
 * @author Levi Rosal
 */
public class BattleshipActions {
  private int numOfGuesses = 0;
  private List<Ship> allShips;

  /**
   * Sets ships in ArrayList allShips.
   * @param allShips
   */
  public void setAllShips(final List<Ship> allShips) {
    this.allShips = allShips;
  }

  /**
   * Checks if ships list empty.
   * @return boolean - True if list is empty and false if list contains elements.
   */
  public boolean isAllShipDestroyed() {
    return allShips.isEmpty();
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
   * @param userGuess
   */
  public void checkShot(final String userGuess) {
    numOfGuesses++;
    String result = "miss";

    for(Ship ship : allShips) {
      if(ship.getLocations().contains(userGuess)) {
        result = "hit";
        System.out.println("You HIT a " + ship.getName() + " !!!\n");
        ship.removeLocation(userGuess);
      }

      if(ship.getLocations().size() == 0) {
        result = "kill";
        System.out.println("\nYOU DESTROYED A " + ship.getName().toUpperCase() + " !!!\n");
        allShips.remove(ship);
        break;
      }
    }

    if(result.equals("miss")) {
      System.out.println("You missed the shot.\n");
    }

  }

  /**
   * Shows the result of game and number of guess used.
   */
  public void finish() {
    System.out.println("All ships are dead !!!");
    if(numOfGuesses >= 18) {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with their shots.");

      return;
    }

    System.out.println("It only took you " + numOfGuesses + " guesses");
    System.out.println("You got out before your options sank.");
  }
}
