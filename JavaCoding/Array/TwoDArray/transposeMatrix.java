package JavaCoding.Array.TwoDArray;

import java.util.Arrays;

public class transposeMatrix {

    public static void main(String[] args) {
        

       int [][] matrix = {{1,2,3},
                          {4,5,6}};
       int [][] result = transpose(matrix);

      int row = result.length;
      int coloum = result[0].length;
      
        for(int i =0 ;i<row;i++)
      {
        for(int j =0 ;j<coloum;j++){

           System.out.print(result[i][j] + " ");

        }
        
           System.out.println();
      }
    }


    public static int [][] transpose(int [][] arr){
      int row = arr.length;
      int coloum = arr[0].length;

      int [][] transpose =  new int[coloum][row];

     
      for(int i =0 ;i<row;i++)
      {
        for(int j =0 ;j<coloum;j++){

            transpose[j][i]=arr[i][j];

        }
      }

        return transpose;


    }
    
    
}
