package com.levi;

import java.util.*;

public class Player{
  int number = 0;
  public void guess(){
    Scanner in = new Scanner(System.in);

    System.out.println("Insert guess: ");
    number = in.nextInt();
//    number = (int) (Math.random() * 10);
//    System.out.println("Estou pensando em " + number);
  }
}
