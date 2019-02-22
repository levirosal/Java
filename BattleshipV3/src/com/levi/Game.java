package com.levi;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Creates ships and reads locations files.
 * @version 3.0
 * @since 2019
 * @author Levi Rosal
 */
public class Game {
    private BattleshipActions actions;
    private List<String> locations1;
    private List<String> locations2;
    private static final String alphabet = "abcdefg";

    /**
     * Sets player and location of ship.
     */
    public Game() {
        actions = new BattleshipActions();

        locations1 = reader(1);
        actions.setAllShips(1, locations1);
        System.out.println("Location Player 1: " + locations1);  // Show location ship.

        locations2 = reader(2);
        actions.setAllShips(2, locations2);
        System.out.println("Location Player 2: " + locations2);  // Show location ship.
    }


    /**
     * Reads file and insert locations.
     * @param player Player.
     * @return List of locations.
     */
    public List<String> reader(final int player){
        Scanner in = new Scanner(System.in);
        List<String> alphaCells = new ArrayList<>();
        int line = 0;
        String temp;
//        String tem = "/home/levi-ia/Documentos/github/Java/BattleshipV3/src/com/levi/";

        System.out.print("Insert file location of Player " + player + ": ");
        String file = in.nextLine();

        try {
//            FileReader arq = new FileReader(tem.concat(file));
            FileReader arq = new FileReader(file);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {

                for (int i = 0; i < linha.length(); i++){
                    if(linha.charAt(i) == '1'){
                        temp = String.valueOf(alphabet.charAt(line));
                        alphaCells.add(temp.concat(Integer.toString(i)));
                    }
                }
                linha = lerArq.readLine();
                line++;
            }

            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        return alphaCells;
    }

}
