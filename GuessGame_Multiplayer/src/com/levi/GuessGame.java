package com.levi;

public class GuessGame{
  Player p1;
  Player p2;
  Player p3;

  public void startGame(){

    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    int targetNumber = (int) (Math.random() * 10);
    System.out.println("Drawing a number between 0 and 9... ");

    while(true){
      System.out.println("Number to be guessed: " + targetNumber);

      System.out.println("--- Player 1 ---");
      p1.guess();
      System.out.println("\n--- Player 2 ---");
      p2.guess();
      System.out.println("\n--- Player 3 ---");
      p3.guess();

      guessp1 = p1.number;
      System.out.println("Player 1 Guess: " + guessp1);
      guessp2 = p2.number;
      System.out.println("Player 2 Guess: " + guessp2);
      guessp3 = p3.number;
      System.out.println("Player 3 Guess: " + guessp3);

      if(guessp1 == targetNumber){
        p1isRight = true;
      }
      if(guessp2 == targetNumber){
        p2isRight = true;
      }
      if(guessp3 == targetNumber){
        p3isRight = true;
      }

      if(p1isRight || p2isRight || p3isRight){
        System.out.println("We have a winner!");
        System.out.println("Player 1 right? " + p1isRight);
        System.out.println("Player 2 right? " + p2isRight);
        System.out.println("Player 3 right? " + p3isRight);
        System.out.println("End game.");
        break;
      }else{
        System.out.println("We do not have a winner!");
        System.out.println("Try again.\n");
      }
    }
  }
}
