package com.levi;

import java.util.*;

/**
 * @version 2.0
 * @since 2019
 * @author Levi Rosal
 */
public class BattleshipLaunch {
  private BattleshipActions actions;
  private List<Ship> shipList;

  /**
   * Creates the ships and set ships in ArrayList.
   */
  public void launch(){
    shipList = new ArrayList<>();
    shipList.add(new Ship("Battlecruiser"));
    shipList.add(new Ship("Aircraft Carrier"));
    shipList.add(new Ship("Submarine"));

    actions = new BattleshipActions();
    actions.setAllShips(shipList);

    System.out.println("\nYour goal is to sink three ships.");
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

  }

  /**
   * Calls the method to insert your shot and method to check guess
   */
  public void start() {
    while(!actions.isAllShipDestroyed()) {
      final String userGuess = actions.getUserInput();
      actions.checkShot(userGuess);
    }
    actions.finish();
  }
}
