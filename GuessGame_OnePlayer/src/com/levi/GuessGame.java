package com.levi;

public class GuessGame{
  Player p1;

  public void startGame(){
    p1 = new Player();

    int guessp1 = 0;

    boolean p1isRight = false;

    int targetNumber = (int) (Math.random() * 10);
    System.out.println("Drawing a number between 0 and 9... ");

    while(true){
      System.out.println("Number to be guessed: " + targetNumber);

      p1.guess();

      guessp1 = p1.number;
      System.out.println("Player Guess " + guessp1);
      if(guessp1 == targetNumber){
        p1isRight = true;
      }

      if(p1isRight){
        System.out.println("You win!!");
        System.out.println("End game.");
        break;
      }else{
        System.out.println("Try again.\n");
      }
    }
  }
}
