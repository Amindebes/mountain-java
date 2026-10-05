

/**
 * Mountain.java - Describes the highest mountain on a continent  
 * Author:  Amin Debes  
 * Module:     3
 * Project:    Lab
 *
 * Instance variables:
 *   String name - the official name of the mountain
 *   String continent - the continent of the mountain
 *   int elevation - the elevation of the summit (in feet)
 */
public class Mountain {

    // Private instance variables
    private String name = "";
    private String continent = "";  
    private int elevation = 0;

    // Constructor sets the instance variables.  
    public Mountain(String newName, String newContinent, int newElevation) {  
        name = newName;
        continent = newContinent;
        elevation = newElevation;
    }

    // Setters
    public void setName(String newName) {  
        name = newName;  
    }
           
    public void setContinent(String newContinent) {
        continent = newContinent;
    }

    public void setElevation(int newElevation) {
        if (newElevation > 0) {
            elevation = newElevation;
        } else {
            elevation = 0;
        }
    }

    // Getters
    public String getName() {  
        return name;
    }
  
    public String getContinent() {
        return continent;
    }

    public int getElevation() {
        return elevation;
    }

    // Returns String with mountain name, continent, and elevation
    public String toString() {
        return name + " is the highest mountain in " +
               continent + " at " + elevation + " feet.";  
    }
}