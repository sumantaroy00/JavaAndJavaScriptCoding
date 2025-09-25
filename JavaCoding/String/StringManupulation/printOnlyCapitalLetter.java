package JavaCoding.String.StringManupulation;

public class printOnlyCapitalLetter {

    public static void main(String[] args) {
        String str = "shsh shshsh hshsh hshshasMWQQ";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){

                System.out.print(ch + " " );

            }
        }
    }
    
}
