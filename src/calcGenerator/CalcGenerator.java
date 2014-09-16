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
    /**
     * Package-test method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcMatrix m = new CalcMatrix(true, true, false, false, 9, 2);
        System.out.println("Matrice creata");
        CalcGenerator.newRandCalc(m);
    }

    /**
     * This will create a new calc.
     *
     * @param calcMatrix Create a new Rand calc using the matrix roules
     * @return Return a the calc on a string
     *
     * <P>
     * <b>Example 1:</b> [youClassName].newRandCalc(new CalcMatrix()); - will
     * create a new single calc using default settings</P>
     */
    public static String newRandCalc(CalcMatrix calcMatrix) {

        //not validated matrix
        if (!calcMatrix.isValid()) {
            return ("Error! Matrix has no Operators enabled!");
        }

        char[] c = calcMatrix.getActiveOperands();

        int maxOperators = calcMatrix.getMaxOperators();
        int maxOpValue = calcMatrix.getMaxOperandsValue();
        int lastNumber =  CalcGenerator.randInt(0, maxOpValue);
        //calc. Generator
        String calc = "" + lastNumber;
        for (int i = 0; i < maxOperators; i++) {
            //new rand num generation
            int f = CalcGenerator.randInt(0, (c.length - 1));
           
            if (c[f]==':'){ //split check
                int factor[]=(CalcGenerator.getAllFactors(lastNumber, 9));
                lastNumber = factor[(CalcGenerator.randInt(0, factor.length-1))];
                calc = calc +c[f] + lastNumber;
            }
            else{
                lastNumber = CalcGenerator.randInt(0, maxOpValue);
                calc = calc +c[f] + lastNumber;
            }
        }

        System.out.println(calc);

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
     * @seelink(Thx Greg http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java)
     */
    private static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    private static int[] getAllFactors(int factNum,int maxOperandValue) {
        int i = 1;
        int factorSize = 0;
        int factors[];

        while ((i <= factNum)&&(i<=maxOperandValue)) {

            if (factNum % i == 0) {

                factorSize++;

            }

            i++;

        }

       // System.out.println("FactorSize = "+factorSize);
        
        factors = new int[factorSize];
        int l = 0;
        i=1;
        
        while ((i <= factNum)&&(i<=maxOperandValue)) {

            if (factNum % i == 0) {
                System.out.println(i);
                factors[l++] = i;

            }

            i++;

        }
      //  System.out.println("The end");
        return factors;
    }

}
