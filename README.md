The code provided is used to convert decimal numbers to octal numbers. The logic of the code is summarized for users as follows:

'main' function:
A user input is obtained using the Scanner class.
The entered decimal number is passed to the decimalToOctal function.
The resulting octal number, along with any additional information, is printed to the screen.

decimalToOctal function:
It utilizes the Integer.toOctalString() method to convert the given decimal number to octal.
The obtained octal number is returned as a String.

Example execution: The user is prompted with the message "Enter a decimal number: ", and they provide a decimal input. This input is then passed to the decimalToOctal function, and the program displays the result as "The octal representation of {enteredNumber} is: {result}". After the program is executed, the Scanner is closed using scanner.close().

As an example, if the user enters '26' in the "Enter a decimal number: " prompt, the program will display "The octal representation of {enteredNumber} is: 32".


!! Requirements: To actively use this code on your computer, you need to download Java JDK.
