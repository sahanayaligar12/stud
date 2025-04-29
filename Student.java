package StuDet;

public class Student {
        String name;
        int id;
        String course;
        long phno;
        String address;
    
        // Constructor
        public Student(String name, int id, String course,long phno,String address) {
            this.name = name;
            this.id = id;
            this.course = course;
            this.phno = phno;
            this.address = address;
        }
    
        // Method to display student details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Course: " + course);
            System.out.println("Phno: " + phno);
            System.out.println("Address: " + address);

        }
    
        public static void main(String[] args) {
            Student student1 = new Student("Sahana", 101, "Computer Science", 1234567898L,"hubli");
            student1.displayDetails();
        }
    }

