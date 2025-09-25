package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;
public class RemoveDuplicatesfromSortedArray {

      public static void main(String[] args) {
          
          int[] nums = {1,1,1,2,2,3};

          int len = nums.length;

          int indexPos = 2;

          for(int i = 2; i<len ;i++){

               if(nums[i]!=nums[indexPos-2]){

                     nums[indexPos] = nums[i];
                     indexPos++;
               }
          }
           
              for(int i = 0; i<indexPos ;i++){
                System.out.print(nums[i]);
              }

      }
    
}
