public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        
        int i = 0;
        int val1 = 0;
        int val2 = 0;
        
        for (List<Integer> arr2 : arr) {
            val1 += arr2.get(i++);
        }
        
        i = arr.size()-1;
        for (List<Integer> arr2 : arr) {
            val2 += arr2.get(i--);
        }
            
        return Math.abs(val2-val1);
    }
}
