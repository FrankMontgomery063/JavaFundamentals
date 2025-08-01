// While Loops Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Countdown
// Print numbers from start down to 1, then print "Blast off!"
public void countdown(int start) {
    int n = start;
    while (n > 0) {
        System.out.println(n);
        n--;
    }
    System.out.println("Blast off!");
    
}

// Exercise 2: Sum Calculator
// Calculate the sum of all integers from 1 to n
public int sumUpTo(int n) {
    int sum = 0;
    int i = 1;
    while (i <= n) {
        sum += i;
        i++;
    }
    return sum;
    
}

// Exercise 3: Number Guessing Helper
// Count how many steps it takes to get from start to target (adding 1 each time)
public int findNumber(int target, int start) {
    int steps = 0;
    while (start < target) {
        start++;
        steps++;
    }
    return steps;
    
}

// Exercise 4: Digit Counter
// Count how many digits are in a positive integer
public int countDigits(int number) {
    int count = 0;
    while (number > 0) {
        number /= 10;
        count++;
    }
    return count;
    
}

// Exercise 5: Password Strength Checker
// Use a while loop to count characters and determine password strength
public String checkPasswordStrength(String password) {
    if (password == null || password.length() < 2) {
        return "Weak";
    }
    
    int length = 0;
    int i = 0;
    while (i < password.length()) {
        length++;
        i++;
    }
    
    if (length >= 8) {
        return "Strong";
    } else if (length >= 4) {
        return "Medium";
    } else {
        return "Weak";
    }
    
}

// Exercise 6: Factorial Calculator
// Calculate n! (n factorial) using a while loop
public long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative");
    }
    long result = 1;
    int i = 1;
    while (i <= n) {
        result *= i;
        i++;
    }
    return result;
    
}

// Exercise 7: Power Calculator
// Calculate base^exp// Exercise 6: Factorial Calculator
// Calculate n! (n factorial) using a while loop
public long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative");
    }
    long result = 1;
    int i = 1;
    while (i <= n) {
        result *= i;
        i++;
    }
    return result;
    
}// Exercise 6: Factorial Calculator
// Calculate n! (n factorial) using a while loop
public long factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("n must be non-negative");
    }
    long result = 1;
    int i = 1;
    while (i <= n) {
        result *= i;
        i++;
    }
    return result;
    
}