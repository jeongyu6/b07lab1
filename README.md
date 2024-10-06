# Polynomial Class
The Polynomial class is designed to represent and manipulate polynomials efficiently in Java. This implementation allows you to store polynomials using two separate arrays: one for non-zero coefficients and another for their corresponding exponents.

# Features
Polynomial Representation:

Coefficients stored as an array of double.
Exponents stored as an array of int.
# Methods:

Addition of polynomials.
Evaluation of polynomials.
Multiplication of polynomials, combining like terms.
Initialization from a text file containing a valid polynomial string.
Saving the polynomial to a text file in a readable format.
# Implementation Details
1.Class Structure
The class contains:

double[] coefficients: Array of non-zero coefficients.
int[] exponents: Array of corresponding exponents.
2.Constructor
Polynomial(double[] coefficients, int[] exponents): Initializes a polynomial from given coefficients and exponents.

Polynomial(File file): Initializes a polynomial from a file. The file should contain a single line with no whitespace representing a valid polynomial (e.g., 5-3x^2+7x^8).

3.Methods
multiply(Polynomial other): Multiplies the current polynomial with another polynomial and returns the resulting polynomial without redundant exponents.

saveToFile(String fileName): Saves the polynomial in textual format to the specified file.
