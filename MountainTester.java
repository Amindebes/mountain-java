

/**
 * MountainTester.java - Test the Mountain class with 6 summits
 * Author:   Amin Debes
 * Module:     3
 * Project:    Lab
 * Problem Statement:  Create a Mountain class that tracks the  
 *    mountain's name, the continent with the mountain, and the
 *    elevation at its peak (in feet).  Create 6 Mountain objects  
 *    for the largest mountain on each continent and display.
 *
 * Algorithm:
 *   1. Create Mountain objects for each of the tallest mountain
 *      summits using a constructor.  Use incorrect data for
 *      Aconcagua.
 *   2. Use toString() to display the values for all mountains
 *   3. Use setters to correct the values for Aconcagua
 *   4. Use getters to display the corrected values
 */
public class MountainTester {
    public static void main(String[] args) {

        // Create a mountain object for each continent
        Mountain denali = new Mountain("Denali", "North America", 20310);
        Mountain aconcagua = new Mountain("Aconcagua", "Bikini Bottom", -700);
        Mountain kilimanjaro = new Mountain("Kilimanjaro", "Africa", 19341);
        Mountain elbrus = new Mountain("Mt. Elbrus", "Europe", 18510);
        Mountain everest = new Mountain("Mt. Everest", "Asia", 29035);
        Mountain kosciuszko = new Mountain("Kosciuszko", "Australia", 7310);

        // Print the information for each mountain using toString()
        System.out.println(denali.toString());  
        System.out.println(aconcagua);  
        System.out.println(kilimanjaro);
        System.out.println(elbrus);
        System.out.println(everest);
        System.out.println(kosciuszko);

        System.out.println();

        // Correct the values for South America using setters
        aconcagua.setContinent("South America");  
        aconcagua.setElevation(22831);

        // Display the corrected values using getters
        System.out.println("The corrected value of " + 
                           aconcagua.getName() + " in " + 
                           aconcagua.getContinent() + " is " + 
                           aconcagua.getElevation() + " feet.");  
    }
}