package JavaCoding.Array.ArrayLatest.ProductItself;

import java.util.Arrays;

public class productExceptItself {
    
    public static void main(String [] args){

        int [] nums = {1, 2, 3, 4};
        int n = nums.length;
        int ans [] = new int[n];
     // Step 1: Build prefix products

      ans[0]=1;
     for (int i = 1; i < n; i++) {
         ans[i] = ans[i-1]*nums[i-1];
     }

     int suffix =1;

     // Step 2: Multiply by suffix products
     for (int i = n - 2; i >= 0; i--) {
        suffix = suffix *nums[i+1];
        ans[i]= ans[i]*suffix;
     }
     
    System.out.println(Arrays.toString(ans));

int result ;

int arr[] = new int[n];

    for(int i = 0 ;i<n ;i++){

        result = 1;

        for(int j = 0 ;j<n;j++){      

            if(i!=j)
            result = nums[j]*result;
        }

        arr[i]=result;
    }
    System.out.println(Arrays.toString(arr));

    }
}
        