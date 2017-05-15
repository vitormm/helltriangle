# This project implements the Hell Triangle Challenge.

## HEll triangle problem

Given a triangle of numbers, find the maximum total from top to bottom
Example:

   6 
  3 5 
 9 7 1 
4 6 8 4    In this triangle the maximum total is 6 + 5 + 7 + 8 = 26 

An element can only be summed with one of the two nearest elements in the next row So the element 3 in row 2 can be summed with 9 and 7, but not with 1.

Choose the programming language you want... let us know about why is that your choice. Besides the solution itself, write an automated test for your code (using a known framework or just another function/method)

Your code will receive an (multidimensional) array as input. The triangle from above would be: 

example = [[6],[3,5],[9,7,1],[4,6,8,4]] 

## About this solution
This solution implements a java code to solve the hell triangle challenge. The main class receives an string input like "[[6],[3,5],[9,7,1],[4,6,8,4]]" and returns the maximum total as described in the problem section.

This solutions throws some exceptions to indicate when the inputs are not ok. 

Every class was covered with automated unit tests.

It was used maven to manage the dependencies and to generate a jar with all it together. The final executable jar and javadocs will be in target directory.

## Requirements, Compiling, Package and Execution
To run this program, you will need

* JDK 1.8 (I used oracle JDK 1.8.0_66)
* Apache Maven (Used version 3.3.9)

### Compiling and package

* run mvn clean install
When this command runs, it compiles, package and run the tests

### Run tests

* run mvn test

### Execution

* java -jar target/hell-triangle-1.0-SNAPSHOT.jar "[[6],[3,5],[9,7,1],[4,6,8,4]]"
