# Console Scientific Calculator

## Overview
This project is a console-based scientific calculator implemented using a client-server architecture in Java. The server performs various mathematical operations, and the client communicates with the server to perform calculations.

## Features
Basic arithmetic operations (addition, subtraction, multiplication, division)
Advanced mathematical functions (square root, power, sine, cosine, tangent, logarithm)

## Prerequisites
Java Development Kit (JDK) installed on both server and client machines.

## Setup

1. Clone the repository:
```bash
git clone https://github.com/chandan19/Scientific-Calculator.git
```
2. Compile the server and client classes:
```bash
javac Server.java
javac Client.java
```
## Usage

1. Run the server:

```bash
java Server
```

2. In a separate terminal, run the client:

```bash
java Client
```

3. Enter mathematical expressions in the client terminal to perform calculations.

4. Type "Over" to close the connection and terminate the application.

## Examples
##### To add: add 5 3
##### To calculate the square root: sqrt 25
##### To calculate the sine: sin 90

## Error Handling
The calculator handles invalid input gracefully and provides detailed error messages.

## Contributions
Contributions are welcome! If you find a bug or have suggestions for improvement, please open an issue or create a pull request.

## License
This project is licensed under the MIT License.
