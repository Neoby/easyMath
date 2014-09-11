/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcGenerator;

import java.util.Random;

/**
 *
 * @author Enrico
 */
public class CalcGenerator {

    public static void main(String[] Args) {
        CalcMatrix m = new CalcMatrix(false, false, true, false, 9, 2);
        System.out.println("Matrice creata");
        CalcGenerator.newRandCalc(m);

    }

    /**
     * This will create a new calc.
     *
     * @param calcMatrix Create a new Rand calc using the matrix roules
     *
     *
     * <p>
     * <b>Example 1:</b> [youClassName].newRandCalc(new CalcMatrix()); -> will
     * create a new single calc using default settings</p>
     */
    public static String newRandCalc(CalcMatrix calcMatrix) {

        //Matrice non validata
        if (!calcMatrix.isValid()) {
            return ("Error! Matrix has no Operators enabled!");
        }

        char[] c = calcMatrix.getActiveOperands();

        int maxOperators = calcMatrix.getMaxOperators();

        return ("5+1");

    }

    /**
     * Returns a pseudo-random number between min and max, inclusive. The
     * difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value. Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    private static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    //(Thx Greg http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java)
    }

}
