package JavaCoding.Array.ArrayLatest.DynamicProgramming;

public class coinChange {

    public static void main(String[] args) {

        int [] coins = {1,2,5};
        int amount = 11;


        if(amount<1)
        System.out.println("Coin needed " + 0);

                // create DP array
      int[] arr = new int[amount+1];

        for(int i=1;i<=amount;i++){            // i = 1 , 2 , 3,4 ,5 , 6,7,8,9,10,11
 
            arr[i] = Integer.MAX_VALUE;

            for(int coin : coins){      // coin = 1,2,5   

               if(coin<=i && arr[i-coin]!=Integer.MAX_VALUE){  
                arr[i]=Math.min(arr[i],1+arr[i-coin]);
               }
            }

        }

        System.out.println(arr[amount]);
        
    }
    
}


//1<=max.value && arr[1-1] is arr[0] is 0!=max.value // true ans -> arr[i] = 1;
// 2<=max.value && arr[1-2] is arr[0] is 0!=max.value // false
// 5<=max.value && arr[1-2] is arr[0] is 0!=max.value // false  


//1<=max.value && arr[2-1] is arr[1] is 1!=max.value // true ans -> arr[i] = 2;
// 2<=max.value && arr[1-2] is arr[0] is 0!=max.value // false
// 5<=max.value && arr[1-2] is arr[0] is 0!=max.value // false                                                                                                                      