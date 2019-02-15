package com.levi;
import java.io.*;
import java.util.*;

public class BattleshipActions{
  ArrayList<String> locationCells;
  private String name;
  
  private static final String alphabet = "abcdefg";

  /* Get guess player */
  public String getUserInput(String msg){
    Scanner in = new Scanner(System.in);
    System.out.println(msg);
    String inputLine = in.nextLine();

    if(inputLine.length() == 0){
      return null;
    }
    return inputLine.toLowerCase();
  }

  /* Set ships location in ArrayList */
  public void setLocationCells(ArrayList<String> loc){
    locationCells = loc;
  }

  /* Set name of ships */  
  public void setName(String string){
    name = string;
  }

  /* Check the guess and show the result of the check */  
  public String checkYourself(String userInput){
    String result = "miss";
    int index = locationCells.indexOf(userInput);
    if(index >= 0){
      locationCells.remove(index);
      if(locationCells.isEmpty()){
        result = "kill";        
        System.out.println("\nYOU DESTROYED A " + name.toUpperCase() + " !!!\n");
      }else{
        result = "hit";
        System.out.println("You HIT a " + name + " !!! \n");
      }
    }
    return result;
  }

  /* Randomly generates the location */  
  public ArrayList<String> generateLocations(int size){
    ArrayList<String> alphaCells = new ArrayList<String>();
    Random random = new Random();
    String temp = null;
    int x = 0;
    int letter = random.nextInt((60 - 0) / 10);
    int number = random.nextInt((60 - 0) / 10);    
    
    if(number > 4 && letter < 5){
      while(x < size){
        temp = String.valueOf(alphabet.charAt(letter));
        alphaCells.add(temp.concat(Integer.toString(number)));
        letter++;
        x++;
      }      
    }else{
      while(x < size){
        temp = String.valueOf(alphabet.charAt(letter));
        alphaCells.add(temp.concat(Integer.toString(number)));
        number++;
        x++;
      }
    }
    System.out.println("Locations: " + alphaCells);  // Show location ship.
    return alphaCells;
  }
  
}
