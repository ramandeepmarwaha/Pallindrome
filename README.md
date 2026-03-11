# Java Palindrome Number Checker

![Java](https://img.shields.io/badge/Java-17+-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Project-Learning-orange)

A simple **Java console application** that checks whether a given number is a **Palindrome**.

A palindrome number reads the same **forward and backward**.

Example:

- 121 → Palindrome  
- 123 → Not a Palindrome

This project demonstrates basic **Java programming concepts**, including loops, conditionals, and user input handling.

---

# What is a Palindrome?

A **palindrome number** is a number that remains the same when its digits are reversed.

Example:

| Number | Reversed | Result |
|------|------|------|
| 121 | 121 | Palindrome |
| 1331 | 1331 | Palindrome |
| 123 | 321 | Not Palindrome |

---

# Features

- Accepts user input from the console
- Reverses the number using mathematical operations
- Compares original number with reversed number
- Displays whether the number is a palindrome or not

---

# How the Program Works

1. The user enters a number.
2. The program extracts digits using the modulus operator `%`.
3. The digits are reversed using a loop.
4. The reversed number is compared with the original number.
5. The result is displayed.

---

# Program Flow

User Input
│
▼
Read Number
│
▼
Reverse Number using Loop
│
▼
Compare Original and Reversed
│
▼
Print Result


---

# Code Example

```
while (n > 0)
{
    s = n % 10;
    n = n / 10;
    t = t * 10 + s;
}

```

This logic extracts digits from the number and constructs the reversed number.

# Installation
Clone the repository

git clone https://github.com/yourusername/java-palindrome-checker.git
Navigate to the folder

cd java-palindrome-checker
Compile the program

javac Pallindrome.java
Run the program

java Pallindrome
# Example Run
Enter a number
121
Its a Pallindrome
Another example:

Enter a number
123
Its not a Pallindrome
# Project Structure
java-palindrome-checker
│
├── Pallindrome.java
├── README.md
Concepts Demonstrated
# This project demonstrates:

Java Console Input (Scanner)

While Loops

Conditional Statements (if / else)

Mathematical Operations (% modulus and division)

Basic Algorithm Design

