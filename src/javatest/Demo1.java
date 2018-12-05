package javatest;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Student> listA = new ArrayList<>();
        List<Student> listB = new ArrayList<>();
        Student student1 = new Student("liyaxi",23);
        Student student2 = new Student("liyaxi",96);
        Student student3 = new Student("zhangsan",29);
        listA.add(student1);
        listA.add(student2);
        listA.add(student3);

        for (Student stu : listA) {
            if (!listB.contains(stu)){
                listB.add(stu);
            }
        }

        System.out.println("============"+listB.toString());




    }

}
