package com.levi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 2.0
 * @since 2019
 * @author Levi Rosal
 */
public class Ship {
    private static final int SHIP_SIZE = 3;
    private String name;
    private List<String> locations;
    private static List<String> locationsAll = new ArrayList<>();
    private static final String alphabet = "abcdefg";


    /**
     * Sets name and location of ship.
     * @param name - Name of ship.
     */
    public Ship(final String name) {
        int count = 0;
        this.name = name;

        labelWhile:
        while (true) {
            locations = generateLocations(SHIP_SIZE);

            for(String it : locations){
                if(locationsAll.contains(it)){
                    count = 0;
                    break;
                } else {
                    count++;
                }

                if(count == 3){
                    locationsAll.addAll(locations);
                    break labelWhile;
                }
            }
        }

//        System.out.println("Location " + name + " : " + locations);  // Show location ship.
    }

    /**
     * Returns name of ship
     * @return String - Name of ship.
     */
    public String getName() {
        return name;
    }

    /**
     * Removes location of ArrayList.
     * @param location - Location for remove.
     */
    public void removeLocation(final String location) {
        locations.remove(location);
    }

    /**
     * Returns locations of ship.
     * @return List - Locations of ship.
     */
    public List<String> getLocations() {
        return locations;
    }


    /**
     * Generates locations of ships.
     * @param size - Size of ships.
     * @return List - Locations.
     */
    public List<String> generateLocations(final int size){
        final List<String> alphaCells = new ArrayList<>();
        final Random random = new Random();
        String temp;
        int count = 0;
        int letter = random.nextInt((60 - 0) / 10);
        int number = random.nextInt((60 - 0) / 10);

        if(number > 4 && letter < 5) {
            while(count < size){
                temp = String.valueOf(alphabet.charAt(letter));
                alphaCells.add(temp.concat(Integer.toString(number)));
                letter++;
                count++;
            }
        } else {
            while(count < size){
                temp = String.valueOf(alphabet.charAt(letter));
                alphaCells.add(temp.concat(Integer.toString(number)));
                number++;
                count++;
            }
        }

        return alphaCells;
    }

}
