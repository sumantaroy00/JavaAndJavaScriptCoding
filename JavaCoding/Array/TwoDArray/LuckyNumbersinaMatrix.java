package JavaCoding.Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {

    public static void main(String[] args) {
        
       int[][] matrix = {
            {9, 7, 8},
            {9, 8, 13},
            {15, 7, 17}
        };

        List<Integer> lucky = luckyNumbers(matrix);
        System.out.println("Lucky numbers: " + lucky); 

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

            List<Integer> result = new ArrayList<>();

            int n = matrix.length;
            int m = matrix[0].length;

        for(int i = 0 ; i<n;i++)
        {
              
                            // Step 1: Find min in the row
                                int rowMin = matrix[i][0];
                                int colIndex = 0;

                                for(int j =1; j<m;j++)
                                {
                                        if (matrix[i][j] < rowMin) {

                                            rowMin = matrix[i][j];
                                            colIndex = j;

                                        }
                                
                                } 
            

                                // Step 2: Check if this min is the max in its column
                                boolean isMaxInCol = true;
                                for (int k = 0; k < n; k++) {
                                    if (matrix[k][colIndex] > rowMin) {
                                        isMaxInCol = false;
                                        break;
                                    }
                                }
                                if (isMaxInCol) {
                                    result.add(rowMin);
                                }

        }
                   return result;
        }
        



 }

    

