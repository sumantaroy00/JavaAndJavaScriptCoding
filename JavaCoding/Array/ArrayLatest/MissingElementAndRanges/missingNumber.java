package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;

public class missingNumber {

    public static void main(String[] args) {

        int [] nums = {2,4,5,1,6,7};
        int result =0;
        int len=nums.length;
        int actualresult = len*(len+1)/2;

        for(int i=0;i<nums.length-1;i++){
          result = result + nums[i];
        }
        
        int missingNumber = actualresult - result;

        System.out.println(missingNumber);

        
    }
    
}
