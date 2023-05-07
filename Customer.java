/*
 * Class: CMSC203 
 * Instructor: Khandan-Monshi
 * Description: Creates a cutomer with the information of name and age
 * Due: 5/7/2023
 * Platform/compiler: Eclipse-IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Aiin Khalilzadeh
*/

public class Customer {
    private String name;
    private int age;
    
    /** Constructors */
    public Customer(String n, int a) {
            name = n;
            age = a;
    }
    public Customer(Customer c) {
            name = c.getName();
            age = c.getAge();
    }
    
    /** Utility */
    public String toString() {
            return name +", " +age +"y/o";
    }
    
    /** Accessors */
    public String getName() {
            return name;
    }
    public int getAge() {
            return age;
    }
    
    /** Mutators */
    public void setName(String n) {
            name = n;
    }
    public void setAge(int a) {
            age = a;
    }
}
 