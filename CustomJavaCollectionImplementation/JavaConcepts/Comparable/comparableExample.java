package CustomJavaCollectionImplementation.JavaConcepts.Comparable;

import java.util.*;

public class comparableExample 
{

    public static void main(String[] args) {
        
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(37,"sumanta"));
        studs.add(new Student(35,"subho"));
        studs.add(new Student(40,"dental"));

        Collections.sort(studs);
 
        for (Student s : studs) {
         System.out.println(s);
    }
    
}

}


class Student implements Comparable<Student>
{


    int age;
    String name;

    public Student(int age, String name)
     {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {

        return " age=" + age + ", name =" + name;
    }

    public int compareTo(Student that){

        if(this.age>that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    
}




