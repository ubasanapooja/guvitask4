public class Voter {
           int voterId;
        String name;
        int age;
    
        public Voter(int voterId, String name, int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age for voter");
            }
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }
    
        public static void main(String[] args) {
            try {
                Voter voter = new Voter(1, "John", 20);
                System.out.println("Voter created successfully");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

