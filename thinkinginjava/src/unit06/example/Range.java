package unit06.example;

/**
 * This example is to talk about tools.
 * @author Kevin
 * @since 2017-08-05
 */
public class Range {

    // Produce a sequence [0..n)
    public static int[] range(int n){
        int[] result = new int[n];
        for(int i= 0; i < n; i++){
            result[i] = i;
        }
        return result;
    }


    // Produce a sequence [start..end)
    public static int[] range(int start, int end){
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++){
            result[i] = start + i;
        }
        return result;
    }


    // Produce  asequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step){
        int sz = (end - start)/step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++){
            result[i] = start + (i * step);
        }
        return result;
    }

}
