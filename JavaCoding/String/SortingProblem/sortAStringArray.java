package JavaCoding.String.SortingProblem;

public class sortAStringArray {

    public static void main(String[] args) {

        //ascending lexicographical order

        String [] str = {"apple","aaple", "banana","grape", "cherry","bbnana"};

        boolean swapped;
       // Bubble sort

       for(int i=0;i<str.length-1;i++){
                    swapped = false;
                    for(int j=0;j<str.length-i-1;j++){
                
                        if(str[j].compareTo(str[j+1])>0){ //// Reverse comparison str[j].compareTo(str[j+1])<0 - descending order
                            String temp = str[j+1];
                            str[j+1]=str[j];
                            str[j]=temp;
                            swapped = true;
                        }

                        

                    }
            if (!swapped) {
                break;
            }

       }
       for (String s : str) {
        System.out.println(s);
    }

        
    }
    
}
