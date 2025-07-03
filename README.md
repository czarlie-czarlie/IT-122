# Bambao_FinAct1: Bubble Sort Program with File Output

## Description
This is a simple Java program that:
1. Prompts the user to enter six random integers.
2. Displays the original array entered by the user.
3. Sorts the array using the Bubble Sort algorithm in ascending order.
4. Prints the sorted array on the console.
5. Writes the sorted array to a text file called `sorted_output.txt`.

This project was created for the first activity in our final term Saint Louis University's Java programming course 2.

## Core Concepts Demonstrated
- Bubble Sort (sorting algorithm)
- User Input Handling with Scanner
- File Output using PrintWriter and FileWriter
- Basic Exception Handling with try-catch-finally
- Looping constructs (for loops)
- Array manipulation

## How to Run
1. Run the code.

2. Follow the prompt and enter six integers one by one.

3. After sorting, the program will display the results and create a file:
   `sorted_output.txt` in the same directory containing the sorted array.

## Output Example
If you entered:

```
12, 7, 5, 3, 9, 1
```

Console output:
```
Original Array:
12 7 5 3 9 1 
Sorted Array:
1 3 5 7 9 12 
Sorted array has been written to sorted_output.txt
```

`sorted_output.txt` content:
```
Sorted Array:
1 3 5 7 9 12 
```

## Error Handling
- If the program can't create or write to the file, it throws a RuntimeException with a helpful message 😇.
- Input is expected to be valid integers; no additional input validation is currently implemented.

## Requirements
- Java Development Kit (JDK 8 or later)
- A terminal or IDE like IntelliJ, Eclipse, or VS Code

## File Structure
```
Finals/
├── Bambao_FinAct1.java
├── sorted_output.txt  ← generated after program runs 😇
```

## Author
Bambao, Czarlie
Final Activity 1 – Computer Programming 2
Saint Louis University

## License
This is an academic project. You are free to study and modify it for educational purposes 😇.
