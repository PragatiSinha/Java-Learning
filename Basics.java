public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student("Ram",10,50);
        s1.displayStudentInfo();
        s1.result();
        Student s2 = new Student("John",19,70);
        s2.displayStudentInfo();
        s2.result();
        Student s3 = new Student("Rock",28,30);
        s3.displayStudentInfo();
        s3.result();

        
    }
    }
    class Student{
    String name;
    int rollNo;
    int marks;
    
    Student(String name, int rollNo, int marks){
        this.name= name;
        this.rollNo = rollNo;
        this.marks = marks;

    }
    void displayStudentInfo(){
        System.out.println("Name of student:"+" " + name);
        System.out.println("RollNo:"+" "+ rollNo);
        System.out.println("Marks:"+" "+ marks);
    }
    void result(){
        if(marks>40){
            System.out.println("Result:"+" "+"Passed");
        }
        else{
            System.out.println("Result:"+" "+"Failed");
        }
    }
}
    

