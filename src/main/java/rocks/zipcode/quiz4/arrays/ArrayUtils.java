package rocks.zipcode.quiz4.arrays;


import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        // copy the array
        //System.arraycopy() method copies a source array from
        // a specific beginning position to the destination array from the mentioned position
        //remove the middle element
        // return it
        System.arraycopy(values, values.length / 2 + 1, values, values.length / 2,
                values.length - 1 - values.length / 2);
        return removeLastElement(values);
    }


    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOfRange(values, 0, values.length -1);
    }
}