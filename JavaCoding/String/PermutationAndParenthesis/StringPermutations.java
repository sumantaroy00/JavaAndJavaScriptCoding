package JavaCoding.String.PermutationAndParenthesis;

public class StringPermutations{

    public static void main(String[] args) {

                    String str = "abc"; // Example string
                    int right = str.length()-1;
                    permute(str.toCharArray(), 0, right);
    }
    public static void permute(char [] str, int left, int right){
     
        if(left==right)
        System.out.println(str);
        else{

            for (int i = left; i <= right; i++) {

                swap(str, left, i);
                permute(str, left + 1, right);
                swap(str, left, i);

            }

        }      

    }
    private static void swap(char [] str, int left, int right) {
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;

    }



}