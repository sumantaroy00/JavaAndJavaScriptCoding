package JavaCoding.Array.ArrayLatest.MergeArray;

public class mergeArray {

    public static void main(String[] args) {
        
                char arr1 [] = {'a','b','c'};

                int arr2[] = {1,2,3};

                StringBuilder sb = new StringBuilder();


                int len1 = arr1.length;
                int len2 = arr2.length;
                int finalLength  ;

                if(len1>len2)
                finalLength = len1;
                else
                finalLength = len2;

                for(int i =0 ;i<finalLength ; i++){

                    sb.append(arr1[i]).append(arr2[i]);

                }

                System.out.println(sb.toString());

    }
    
}
