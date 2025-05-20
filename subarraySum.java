/*import java.util.ArrayList;
class subarraySum{
    public ArrayList <Integer> subarraySum (int [] arr , int target ){
        int left = 0 ;
        int currSum = 0;
        for(int right = 0 ; right <arr.length; right++){
            currSum += arr[right];
        }
        while( currSum > target && left <= right){
            currSum -= arr[left];
            left++;
        }
        if(currSum == target){
            result.add(left +1);
            result.add(right +1);
            return result ;
            }

    }
    result.add(-1);
    return result;
}
    public static void main(String[] args) {
        subarraySum obj = new subarraySum();
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = obj.subarraySum(arr, target);
        System.out.println(result);
    }

    */


    import java.util.ArrayList;

class subarraySum {
    public ArrayList<Integer> subarraySum(int[] arr, int target) {
        int left = 0;
        int currSum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>(); // Initialize result ArrayList

        for (int right = 0; right < arr.length; right++) {
            currSum += arr[right]; // Expand the window

            // Shrink the window if currSum exceeds target
            while (currSum > target && left <= right) { // Corrected condition: left <= right
                currSum -= arr[left];
                left++;
            }

            // Check if currSum equals target after potential shrinking
            if (currSum == target) {
                result.add(left + 1); // 1-based indexing for start
                result.add(right + 1); // 1-based indexing for end
                return result; // Return immediately if found
            }
        }

        // If loop completes and no target sum is found
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        subarraySum obj = new subarraySum();
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = obj.subarraySum(arr, target);
        System.out.println(result);
    }
}