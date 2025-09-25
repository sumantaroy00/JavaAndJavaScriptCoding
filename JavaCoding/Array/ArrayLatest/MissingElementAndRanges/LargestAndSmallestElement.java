package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;


public class LargestAndSmallestElement {
    
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
      
         System.err.println("Smallest Number"  +  " " + arr[0]);
         System.err.println("Largest Number"  +  " " + arr[len-1]);

         /* int [] arr = {5,12,14,13,14,15,16,30,29};
       
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    
                    for(int num : arr){
                        
                        if(num<min)
                        min=num;
                        if(num>max)
                        max=num;
                        
           
       } */


    }
}
