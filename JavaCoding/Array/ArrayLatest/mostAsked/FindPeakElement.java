package JavaCoding.Array.ArrayLatest.mostAsked;

public class FindPeakElement {

    public static void main(String[] args) {


        int[] nums = {1, 2, 1, 3, 5, 6,4};

        int left = 0 , right = nums.length-1;

        while(left<right){

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // You're on a descending slope → peak is on the left
                right = mid;
            } else {
                // You're on an ascending slope → peak is on the right
                left = mid + 1;
            }



        }

        System.out.println(left  + "  " +  nums[left]);
        
    }
    
}
