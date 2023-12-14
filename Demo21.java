import java.util.Scanner;
    class Demo21{
    public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            System.out.println("Enter student roll number:");
            int rollNumber = scanner.nextInt();

            
            Student student = new Student(name, rollNumber);

        
            student.displayDetails();

        
            
        }
    }

    class Student {
        
        private String name;
        private int rollNumber;

        
        public Student(String name, int rollNumber) {
            
            this.name = name;
            this.rollNumber = rollNumber;
        }

        
        public void displayDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
        }
    }
        