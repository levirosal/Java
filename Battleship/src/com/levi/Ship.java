package com.levi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private static final int SHIP_SIZE = 3;
    private String name;
    private List<String> locations;
    private static final String alphabet = "abcdefg";


    public Ship(final String name) {
        this.name = name;
        this.locations = generateLocations(SHIP_SIZE);
    }

    public String getName() {
        return name;
    }

    public void removeLocation(final String location) {
        locations.remove(location);
    }

    public List<String> getLocations() {
        return locations;
    }
    public List<String> generateLocations(final int size){
        List<String> alphaCells = new ArrayList<>();
        Random random = new Random();
        String temp;
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
