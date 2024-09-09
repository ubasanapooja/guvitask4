public class Student {
    
        int rollNo;
        String name;
        int age;
        String course;
    
        public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("Age should be between 15 and 21");
            }
            if (!name.matches("[a-zA-Z ]+")) {
                throw new NameNotValidException("Name should not contain numbers or special symbols");
            }
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.course = course;
        }
    
        public static void main(String[] args) {
            try {
                Student student = new Student(1, "Ramesh", 20, "B.Tech");
                System.out.println("Student created successfully");
            } catch (AgeNotWithinRangeException e) {
                System.out.println(e.getMessage());
            } catch (NameNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    

