package JavaCoding.LinkList;

import java.util.LinkedList;

public class reverseLL {

    public static void main(String[] args) {
        

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(3);

            LinkedList<Integer> reversed = new LinkedList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                reversed.add(list.get(i));
            }
            System.out.println(reversed); // [3, 2, 1]
}
    
}
