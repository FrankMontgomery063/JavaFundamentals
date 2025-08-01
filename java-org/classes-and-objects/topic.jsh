// Classes and Objects Exercises - Complete the classes and methods below
// Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;

// Exercise 1: Basic Class Creation
// Create a Person class with name and age fields
class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "Hello, I'm " + name + " and I'm " + age + " years old.";
    
    }
    
}


// Exercise 2: Class with Methods
// Create a BankAccount class with account operations
public class BankAccount {
    String accountNumber;
    double balance;
     
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
        return balance;
    }
    
    public double getBalance() {
        return balance;
    
    }

    public String getAccountInfo() {
        return "accountNumber: " + accountNumber + ", Balance: $" + balance; 
    }


}

// Exercise 3: Object Creation and Usage
// Create and return a Person object
public Person createPerson(String name, int age) {
    Person person = new Person(name, age);
    return person;
    
}

// Create and return a BankAccount object
public BankAccount createBankAccount(String accountNumber) {
    BankAccount account = new BankAccount(accountNumber);
    return account;
    
}

// Demonstrate creating and using a Person object
public void demonstratePersonUsage() {
    Person person = createPerson("Alice", 30);
    System.out.println(person.introduce()); // 
    
}

// Exercise 4: Working with Multiple Objects
// Create a Car class
class Car {
    // Your fields here
    String brand;
    String model;
    int year;
    
    // Your constructor here
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Your getCarInfo method here
    public String getCarInfo() {
        return "Car: " + brand + " " + model + ", Year: " + year;
    }
    
    // Your isClassic method here (car is classic if > 25 years old)
    public boolean isClassic() {
        int currentYear = 2025;
        return (currentYear - year) > 25;

    }

    public int getCarYear() {
        return year;
    }
    
}

// Compare two cars and return which is older
public Car compareCars(Car car1, Car car2) {
    if (car1.getCarYear() < car2.getCarYear()) {
        return car1;
    } else if (car1.getCarYear() > car2.getCarYear()){
        return car2;
    }
    return null;
    
}

// Exercise 5: Object State and Behavior
// Create a Counter class that can increment/decrement
class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int increment() {
        count++;
        return count;
    }

    public int decrement() {
        if (count > 0) {
            count--;
        }
        return count;
    }

    public int reset() {
        count = 0;
        return count;
    }

    public int getCount() {
        return count;
    }
    
}

// Demonstrate the Counter classpublic class HelloWorld {
   // public static void main(String[] args)
 
// Exercise 6: Class with Validation
// Create a Student class with input validation
System.out.println("Student System");
class Student {
    
    String name;
    int grade;
    double gpa;

    public Student(String name, int grade, double gpa) throws Exception {
        if ( name == null || name.isEmpty()) {
            throw new Exception("Name cannot be null or empty");
        }   
        this.name = name;

        if (grade < 1 || grade > 12) {
            throw new Exception("Grade must be between 1 and 12");
        } 
        this.grade = grade;

        if (gpa < 0.0 || gpa > 4.0) {
            throw new Exception("GPA must be between 0.0 and");
        }
        this.gpa = gpa;

    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    // Your getStudentInfo method here
    public String getStudentInfo(){
        return "Student:" + name + ", Grade: " + grade + ", GPA: " + gpa;
    }
    
}

// Exercise 7: Object Interaction
// Create a Book class
System.out.println("Book System");
class Book {
    // Your fields here
    String title;
    String author;
    boolean isCheckedOut;
    
    // Your constructor here
    public Book(String title, String author, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = isCheckedOut;
    }
    
    // Add any helpful methods here
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
    
}

// Create a Library class that manages books
System.out.println("Library System");
public class Library {
    // Your fields here
    ArrayList<Book> books;
    
    // Your constructor here
    public Library() {
        books = new ArrayList<Book>();
    }

    
    // Your addBook method here
    public void addBook(Book book) {
        books.add(book);
    }

    // Your checkOutBook method here
    public String checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.getIsCheckedOut()) {
                book.isCheckedOut = true;
                return "Checked out; " + title;
            } else if (book.getTitle().equalsIgnoreCase(title) && book.getIsCheckedOut()) {
                return "Book is already checked out: " + title;
            }
        }
        return "Book not found: " + title;

    }

    // Your returnBook method here
    public String returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getIsCheckedOut()) {
                book.isCheckedOut = false;
                return "Returned Book; " + title;
            } else if (book.getTitle().equalsIgnoreCase(title) && !book.getIsCheckedOut()) {
                return "Book is already in the library: " + title;
            }
        }
        return "Book not found: " + title;
    }

    
    // Your getAvailableBooks method here
    public int getAvailableBooks() {
        return books.size();
    }
    
}

// Test your classes here - uncomment and modify as needed

System.out.println("Testing Person class:");
Person person1 = createPerson("Frank", 30);
Person person2 = new Person("Bob", 25);
System.out.println(person1.introduce());
System.out.println(person2.introduce());

System.out.println("\nTesting BankAccount class:");
BankAccount account = createBankAccount("123456");
System.out.println("Initial: " + account.getAccountInfo());
account.deposit(100.0);
System.out.println("After deposit: Balance = " + account.getBalance());
account.withdraw(30.0);
System.out.println("After withdrawal: Balance = " + account.getBalance());
account.withdraw(100.0); // Should fail - insufficient funds
System.out.println("Final: " + account.getAccountInfo());

System.out.println("\nTesting Car class:");
Car car1 = new Car("Toyota", "Camry", 1995);
Car car2 = new Car("Honda", "Civic", 2020);
System.out.println(car1.getCarInfo());
System.out.println("Is classic: " + car1.isClassic());
System.out.println(car2.getCarInfo());
System.out.println("Is classic: " + car2.isClassic());
Car older = compareCars(car1, car2);
System.out.println("Older car: " + older.getCarInfo());

System.out.println("\nTesting Counter class:");
Counter counter = new Counter();
System.out.println("Initial count: " + counter.getCount());
counter.increment();
counter.increment();
counter.increment();
System.out.println("After 3 increments: " + counter.getCount());
counter.decrement();
System.out.println("After 1 decrement: " + counter.getCount());
counter.reset();
System.out.println("After reset: " + counter.getCount());

System.out.println("\nTesting Student class:");
try {
    Student student1 = new Student("John", 10, 3.8);
    System.out.println(student1.getStudentInfo());
    System.out.println("Is honor student: " + student1.isHonorStudent());
    
    Student student2 = new Student("Jane", 12, 2.5);
    System.out.println(student2.getStudentInfo());
    System.out.println("Is honor student: " + student2.isHonorStudent());
} catch (Exception e) {
    System.out.println("Validation error: " + e.getMessage());
}

System.out.println("\nTesting Library system:");
Library library = new Library();
Book book1 = new Book("1984", "George Orwell", false);
Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", false);

library.addBook(book1);
library.addBook(book2);
System.out.println("Available books: " + library.getAvailableBooks());

library.checkOutBook("1984");
System.out.println("After checking out 1984: " + library.getAvailableBooks());

library.returnBook("1984");
System.out.println("After returning 1984: " + library.getAvailableBooks());

