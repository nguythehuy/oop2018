package week1;

public class StudentManagement {
    // cau 6
    public static void main() {
        Student Student1=new Student();
        Student1.setName("Huy");
        Student1.setId("17020799");
        Student1.setGroup("INT22041");
        Student1.setEmail("nguythehuy@gmail.com");
        // in ra ten sv:
        System.out.println(Student1.getName());
        // in ra thong tin sv:
        Student1.getInfo();
        }
    // cau 8
    public static void main1() {
		    Student Student2 = new Student();
		    Student2.getInfo();
		    Student Student3 = new Student("Huy","170207699","nguythehuy@gmail.com");
		    Student3.getInfo();
		    Student s = new Student(Student2);
		    s.getInfo();	
            }
    

