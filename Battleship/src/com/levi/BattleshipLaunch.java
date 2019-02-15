package com.levi;

import java.util.*;

public class BattleshipLaunch{
  private BattleshipActions actions = new BattleshipActions();
  private ArrayList<BattleshipActions> shipsList = new ArrayList<BattleshipActions>();
  private int numOfGuesses = 0;

  /* Creates the ships and calls the method to generate the location */  
  private void setUpGame(){
    BattleshipActions one = new BattleshipActions();
    one.setName("Battlecruiser");
    BattleshipActions two = new BattleshipActions();
    two.setName("Aircraft Carrier");
    BattleshipActions three = new BattleshipActions();
    three.setName("Submarine");
    shipsList.add(one);
    shipsList.add(two);
    shipsList.add(three);

    System.out.println("Your goal is to sink three ships.");
    System.out.println("- 1 Battlecruiser\n- 1 Aircraft Carrier\n- 1 Submarine");
    System.out.println("Try to sink them all in the fewest number of guesses\n");
    System.out.println(" A *  *  *  *  *  *  *");
    System.out.println(" B *  *  *  *  *  *  *");
    System.out.println(" C *  *  *  *  *  *  *");
    System.out.println(" D *  *  *  *  *  *  *");
    System.out.println(" E *  *  *  *  *  *  *");
    System.out.println(" F *  *  *  *  *  *  *");
    System.out.println(" G *  *  *  *  *  *  *");
    System.out.println("   0  1  2  3  4  5  6\n");

    for(BattleshipActions shipSet : shipsList){
      ArrayList<String> newLocation = actions.generateLocations(3);
        shipSet.setLocationCells(newLocation);
    }
  }

  /* Calls the method to insert your shot and method to check guess */  
  private void startPlaying(){
    while(!shipsList.isEmpty()){
      String userGuess = actions.getUserInput("Enter the location of your shot: ");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  /* Calls the method to check the guess and shows the result of the check if result is "miss" */
  private void checkUserGuess(String userGuess){
    numOfGuesses++;
    String result = "miss";

    for(BattleshipActions shipsToTest : shipsList){
      result = shipsToTest.checkYourself(userGuess);
      if(result.equals("hit")){
        break;
      }
      if(result.equals("kill")){
        shipsList.remove(shipsToTest);
        break;
      }
    }
    if(result.equals("miss")) System.out.println("You missed the shot." + "\n");
  }

  /* Shows the result of game and number of guess used */
  private void finishGame(){
    System.out.println("All ships are dead !!!");
    if(numOfGuesses <= 18){
      System.out.println("It only took you " + numOfGuesses + " guesses");
      System.out.println("You got out before your options sank.");
    }else{
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
      System.out.println("Fish are dancing with their shots.");
    }
  }

  /* Start the game */
  public static void main(String[] args){
    BattleshipLaunch game = new BattleshipLaunch();
    game.setUpGame();
    game.startPlaying();
  }
}
