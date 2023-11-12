/**
 * Students
 */
class Student {
    int rollNum;
    String name;
    int marks;

}

public class ArrayObject {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNum = 12;
        s1.name = "prasang";
        s1.marks = 66;

        Student s2 = new Student();
        s2.rollNum = 19;
        s2.name = "mani";
        s2.marks = 69;

        Student s3 = new Student();
        s3.rollNum = 12;
        s3.name = "manav";
        s3.marks = 99;


        // creating of a Array to hold three student object

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // Printing the name ,rollNum and marks of the students

        for(Student s : students){
            System.out.println("Name: "+s.name + "\n"+"RollNum: "+ + s.rollNum+ "\n"+"Marks: "+s.marks);
        }
    }
}
