# othman-abdalrahim-H-A-202501010595

Student Name:	Othman Abdalrahim H A

Student ID:	202501010595

Course:	BIT1123 – Object-Oriented Programming

Institution	City: University Malaysia

Campus:	Cyberjaya Campus

Assignment:	Assignment 1 – Individual

# Java Object-Oriented Programming Tutorials

This is a set of Java programming tutorials and exercises created for my Object-Oriented Programming (OOP) coursework.

This repository has several Java exercises related to the basic concepts of programming like class, object, constructor, method, inheritance, and GUI development.
---

## Contents

There are separate folders for each tutorial, and each tutorial concentrates on a particular java programming concept.

| Tutorial       | Main Content                                            |
| -------------- | ------------------------------------------------------- |
| `tutorial_1`   | Classes, objects, attributes, constructors, and methods |
| `tutorial_2`   | Java class and object exercises                         |
| `tutorial_3`   | Inheritance and relationships between classes           |
| `tutorial_5`   | Object-oriented programming practice and documentation  |
| `tutorial_6`   | Inheritance using employee and lecturer classes         |
| `tutorial_7`   | Abstract classes / inheritance using appliances         |
| `tutorial_8-9` | Practical tutorial work included in the repository      |
| `tutolrial_10` | Java GUI quiz application                               |

---

## Repository Structure 

```text
othman-abdalrahim-H-A-202501010595/
├── README.md
├── Report.pdf
|
├── tutorial_1/
│   ├── Student.java
│   └── main.java
│
├── tutorial_2/
│   ├── Student.java
│   └── main.java
│
├── tutorial_3/
│   ├── Person.java
│   ├── Student.java
│   ├── Lecturer.java
│   └── Main.java
│
├── tutorial_5/
│   ├── Student.java
│   ├── main.java
│   └── docementation.txt
│
├── tutorial_6/
│   ├── employee.java
│   ├── lecturer.java
│   └── main.java
│
├── tutorial_7/
│   ├── Applience.java
│   ├── Microwave.java
│   ├── WashingMachine.java
│   └── Main.java
│
├── tutorial_8-9/
│   ├── task.txt
│   └── main.java
|
├── tutolrial_10/
│   ├── Questions.java
│   └── QuizBattleGUI.java

```

> Note: The folder name tutolrial_10 was left as it was in the original repository.

---

## Technologies Used

* **Java**
* Object-Oriented Programming (OOP)
* Java Classes & Objects
* Constructors
* Methods
* Inheritance
* Polymorphism
* GUI Programming
* Git & GitHub

---

## Concepts Practiced

### 1. Classes and Objects

The early tutorials introduce the basic structure of Java classes.

For example, `tutorial_1` contains a `Student` class with attributes such as:

* Name
* Age
* GPA

It also includes methods for displaying student information and performing actions such as studying and taking an exam.

```java
Student s1 = new Student("Abdalrahim", 19, 3.6);

s1.displayInfo();
s1.study();
s1.takeExsam();
```

---

### 2. Constructors

Constructors are used to initialize objects when they are created.

Example:

```java
Student(String studentName, int studentAge, double studentGpa) {
    name = studentName;
    age = studentAge;
    gpa = studentGpa;
}
```

---

### 3. Methods

The projects demonstrate how methods can be used to define behaviors for objects.

Examples include:

```java
displayInfo()
study()
takeExsam()
```

---

### 4. Inheritance

Later tutorials introduce relationships between classes.

For example, `tutorial_3` contains:

* `Person`
* `Student`
* `Lecturer`
* `Main`

This provides practice with creating related classes and applying object-oriented design concepts.

---

### 5. Employee and Lecturer Classes

`tutorial_6` continues working with object-oriented relationships through:

```text
employee
   │
   └── lecturer
```

The tutorial contains separate classes for employees and lecturers together with a main program for testing them.

---

### 6. Abstract Classes and Appliances

`tutorial_7` works with appliance-related classes:

* `Applience`
* `Microwave`
* `WashingMachine`
* `Main`

This exercise provides practice with designing a parent class and specialized child classes.

---

### 7. Java GUI Programming

The final tutorial in the repository contains a small quiz application.

The `tutolrial_10` folder includes:

```text
Questions.java
QuizBattleGUI.java
```

The project demonstrates how Java can be used to create a graphical user interface for an interactive quiz.

---

## How to Run the Projects 

### Requirements

Install the following:

* Java Development Kit (JDK)
* A Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans

You can also compile and run the programs directly from the command line.

### Clone the Repository

```bash
git clone https://github.com/abdulrheemothman57-rgb/othman-abdalrahim-H-A-202501010595.git
```

Move into the project directory:

```bash
cd othman-abdalrahim-H-A-202501010595
```

### Compile a Tutorial

For example:

```bash
cd tutorial_1
javac Student.java main.java
```

Then run the main class:

```bash
java main
```

The exact command may vary depending on the class name and the Java environment being used.

---

## Learning Objectives

This repository is used for the practice and demonstration of basic programming concepts of Java and Object Oriented Programming.

I worked with the following exercises through this:

* Creating Java classes
Making and manipulating objects
* Defining attributes
* Creating constructors
* Creating methods
Implicitly passing values to objects
* Using inheritance
Write Parent and Child classes.
* Applying OOP principles
Constructing a GUI, very basic, in Java.
- Using Git and GitHub for organizing Java Projects

---


## License

This project is licensed under the **MIT License**.

See the [`LICENSE`](LICENSE) file for more information.

---

## Repository

The complete source code is available on GitHub:

[**othman-abdalrahim-H-A-202501010595**](https://github.com/abdulrheemothman57-rgb/othman-abdalrahim-H-A-202501010595)
