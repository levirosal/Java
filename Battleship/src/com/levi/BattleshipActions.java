package com.levi;
import java.util.*;

public class BattleshipActions {
  private int numOfGuesses = 0;
  private List<Ship> allShips;

  public void setAllShips(List<Ship> allShips) {
    this.allShips = allShips;
  }

  /* Get guess player */
  public String getUserInput(final String msg) {
    Scanner in = new Scanner(System.in);
    System.out.println(msg);
    String inputLine = in.nextLine();

    if(inputLine.length() == 0){
      return null;
    }
    return inputLine.toLowerCase();
  }

  /* Calls the method to check the guess and shows the result of the check if result is "miss" */
  public void checkShot(final String userGuess) {
    numOfGuesses++;
    String result;

    result = checkYourself(userGuess);
    if(result.equals("hit")){
      System.out.println("You HIT a  !!! \n");
    }

    if(result.equals("kill")) {
      System.out.println("You missed the shot." + "\n");
    }

    if(result.equals("miss")) {
      System.out.println("You missed the shot." + "\n");
    }

  }

  /**
   * Check the guess and show the result of the check
   * @return hgjhgj
   */
  public boolean isAllShipDestroyed() {
    return allShips.isEmpty();
  }

  /**
   * Check the guess and show the result of the check
   * @param userInput hghkg
   * @return hgjhgj
   */
  private String checkYourself(final String userInput) {
    String result = "miss";

    for(Ship ship : allShips) {
      if(ship.getLocations().contains(userInput)) {
        result = "hit";
        ship.removeLocation(userInput);
      }

      if(ship.getLocations().size() == 0) {
        result = "kill";
        System.out.println("\nYOU DESTROYED A " + ship.getName().toUpperCase() + " !!!\n");
      }
    }

    return result;
  }

  /* Shows the result of game and number of guess used */
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
