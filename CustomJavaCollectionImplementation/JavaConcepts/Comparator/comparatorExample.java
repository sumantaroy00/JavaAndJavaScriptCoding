package CustomJavaCollectionImplementation.JavaConcepts.Comparator;

import java.util.*;

public class comparatorExample 
{


    public static void main(String[] args) 
    {
        

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(37,"sumanta"));
        studs.add(new Student(35,"subho"));
        studs.add(new Student(40,"dental"));


/* 
                    Comparator <Student> com = new Comparator<Student>()
                    {

                        public int compare(Student i , Student j)
                        {

                            if(i.age>j.age){
                                return 1;
                            }
                            else{
                                return -1;
                            }
                        }
                    };
*/

       Comparator<Student> com = (i,j) -> i.age>j.age?1:-1;
       Collections.sort(studs , com);

       for (Student s : studs) {
        System.out.println(s);
    }

    }

}


 class Student {

    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() { 
        return "Student [ age=" + age + ", name " + name + "]";
    }


    


}
