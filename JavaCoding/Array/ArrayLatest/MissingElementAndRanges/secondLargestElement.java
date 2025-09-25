package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;

public class secondLargestElement {

    public static void main(String[] args) {
        int [] arr = {5,12,14,13,14,15,16,30,29};

       // Arrays.sort(arr);

        int len = arr.length;
        int temp;

       // System.err.println("Smallest Number"  +  " " + arr[0]);
       // System.err.println("Largest Number"  +  " " + arr[len-1]);

        for(int i=0 ; i<len-1;i++){

            for(int j=0;j<len-i-1;j++){
                    
                  if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                  }
            }
        }
      
         System.err.println("Second largest Number"  +  " " + arr[len-2]);
    


    }
    /* o(n log n ) 
     * 
     * 
     * int[] arr = {5, 12, 14, 13, 14, 15, 16, 30, 29};

        Arrays.sort(arr); // O(n log n)
        int len = arr.length;

        int largest = arr[len - 1];
        int secondLargest = -1;

        // Traverse from end to find second distinct largest
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest != -1) {
            System.out.println("Second Largest (distinct): " + secondLargest);
        } else {
            System.out.println("No second distinct largest element found.");
        }
     *
     * 
     * 
     *  int[] arr = {5, 12, 14, 13, 14, 15, 16, 30, 29};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second Largest: " + second);
        }

     * 
     * 
     * 
    */


    }
    

