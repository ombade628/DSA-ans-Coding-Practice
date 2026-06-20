
import java.util.ArrayList;;
class Sol {
    static ArrayList<Integer> subSum(int[] arr , int target) {
        // code here
        int start = 0; 
        int sum= 0 ;
        ArrayList<Integer> result = new ArrayList<>() ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Shrink the window from the start if the sum is too large
            while (sum > target && start < i) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                // 1-based index, as per most subarray problems
                result.add(start + 1);
                result.add(i + 1);
                return result;
            }
        }

        result.add(-1); // If no valid subarray is found
        return result;

    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 5};
        int target_sum = 12;
        ArrayList<Integer> res = subSum(array, target_sum);
        System.out.println(res);
    }
}
