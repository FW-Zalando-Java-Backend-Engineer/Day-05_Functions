# **📘 Day-05: Java Methods - Defining and Using Methods**  
Welcome to **Day-05** of our Java learning journey! Today, we dive into one of the most essential building blocks of Java programming: **Methods**. Learning methods will help you structure, reuse, and maintain your code like a true pro.

---

## **📌 Lesson Structure**

### **1️⃣ What is a Method?**
- A **named block of code** that performs a specific task.
- Encourages **code reuse**, readability, and modularity.
- Must be **invoked** to execute.
- The `main()` method is the starting point of any Java application.

### **2️⃣ Naming and Best Practices**
- **Use meaningful names**: describe what the method does (`calculateTotal`, `findUserById`).
- **CamelCase** naming convention.
- Keep each method focused on **a single task**.
- Avoid overly long methods—split into smaller chunks if needed.

### **3️⃣ Declaring and Invoking Methods**
- Method signature typically includes:
  1. **Modifier** (`public`, `private`, etc.)
  2. **Return type**
  3. **Method name**
  4. **Parameters (optional)**
  5. **Throws clause (optional)**
  6. **Method body**
- **Invoking a method**: `methodName();`
- Can be called from `main`, another method, or recursively.

### **4️⃣ Void and Return Type Methods**
- `void` methods **don’t return values**, only perform actions.
- Return methods **produce a value** using `return`.
- Return value can be stored, used in expressions, or passed to another method.

### **5️⃣ Methods with Parameters**
- **Parameters** make methods flexible.
- You can pass:
  - No parameters
  - One or multiple parameters
  - Different data types
- Distinguish **Parameters (in method signature)** from **Arguments (at call site)**.

### **6️⃣ Value vs. Reference Types**
- **Value types** (e.g., `int`, `char`, `boolean`) store the actual value.
- **Reference types** (e.g., `String`, `Array`, Objects) store a reference to memory.
- Important for understanding **mutability** and **side effects** in methods.

### **7️⃣ Method Overloading**
- **Same method name**, different **parameter lists**.
- Compiler uses method **signature** to determine which one to execute.
- Makes code more intuitive (e.g., multiple `print()` methods).

---

## **📜 Live Coding Examples**

### **🖥️ Declaring & Invoking a Simple Method**
```java
public class HelloWorld {
    public static void main(String[] args) {
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello!");
    }
}
```

---

### **🖥️ Void vs. Return Method**
```java
public class Example {
    public static void main(String[] args) {
        printMessage();
        int result = square(5);
        System.out.println("Square of 5 is: " + result);
    }

    public static void printMessage() {
        System.out.println("This method returns nothing.");
    }

    public static int square(int x) {
        return x * x;
    }
}
```

---

### **🖥️ Methods with Parameters**
```java
public class StudentInfo {
    public static void printStudent(String name, int age, double grade) {
        System.out.println("Student: " + name + " Age: " + age + " Grade: " + grade);
    }

    public static void main(String[] args) {
        printStudent("Alice", 20, 3.9);
    }
}
```

---

### **🖥️ Value vs. Reference Example**
```java
public class ReferenceExample {
    public static void changeValue(int number) {
        number = 100;
    }

    public static void main(String[] args) {
        int x = 5;
        changeValue(x);
        System.out.println("Value of x: " + x); // Still 5
    }
}
```

---

### **🖥️ Overloaded Methods**
```java
public class Printer {
    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text, int number) {
        System.out.println(text + " " + number);
    }

    public static void main(String[] args) {
        print("Age");
        print(30);
        print("Age", 30);
    }
}
```

---

## **🎯 Hands-on Exercises**
✅ Write a method that takes a name and prints a greeting.  
✅ Create a method that returns the max of two numbers.  
✅ Build a class with a method to calculate area of a rectangle using parameters.  
✅ Demonstrate value vs. reference with primitive and object types.  
✅ Overload a method to handle different data types (e.g., `int`, `double`, `String`).

---

## **📚 Additional Resources**
- **[Java Methods (Oracle Docs)](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)**
- **[Method Overloading (GeeksForGeeks)](https://www.geeksforgeeks.org/method-overloading-in-java/)**
- **[Java Reference vs Value Types](https://www.baeldung.com/java-value-vs-reference)**
- [Video Lesson Recording](_will be added later_)  
- [Lesson Slides: Methods in Java](https://github.com/FW-Zalando-Java-Backend-Engineer/Day-05_Functions/blob/main/Methods%20in%20Java-%20Defining%20and%20Using%20Methods.pdf)

---

🚀 **Great work today! You’ve taken a big step toward writing clean, reusable Java code. Get ready for Day-06!** 🎉
