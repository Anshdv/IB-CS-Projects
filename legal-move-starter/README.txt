LEGAL MOVE  -  Chapter 5 Programming Assignment
===============================================

WHAT IS HERE
  src/Square.java      empty class
  src/Move.java        empty class
  src/MoveRules.java   empty class
  src/ChessApp.java    empty main method
  test/SquareTest.java       GIVEN. These tests are part of the
                             assignment. Your code must pass them
                             exactly as they are written.
  test/MoveTest.java         empty
  test/MoveRulesTest.java    empty
  docs/CHESS-RULES.txt       how each piece moves, if you need it
  docs/FLOWCHART.txt         what to draw and what the symbols mean

THIS PROJECT DOES NOT COMPILE YET. THAT IS ON PURPOSE.
  SquareTest calls methods that do not exist. Every red mark in it is
  telling you a signature you have to write. Open it first and read it
  as a specification, not as an error.

  The handout lists what every method takes in, what it gives back, and
  what it promises. Turning that into a signature is your job, and so
  is deciding what your instance variables are and which are private.

  You also write all of the javadoc. None is provided.

SETUP IN INTELLIJ
  1. File > Open, choose this folder.
  2. Right-click src  > Mark Directory as > Sources Root.
  3. Right-click test > Mark Directory as > Test Sources Root.
  4. Open SquareTest.java. Hover the red "org.junit.jupiter" import,
     press Alt+Enter, choose "Add JUnit5 to classpath".

THE RULES THAT COST YOU POINTS IF YOU BREAK THEM
  1. Scanner and System.out appear in ChessApp and NOWHERE else.
  2. What you SUBMIT must compile. Receiving a project that does not
     compile is this assignment. Handing one back is not finishing it.
     If a method defeats you, leave it returning false with a TODO
     comment so the rest of your work can still be run and graded.

WHAT YOU HAVE LEARNED THAT YOU NEED
  if / else if / else, relational operators, && || !, Math.abs,
  charAt, and the fact that == does not compare String contents.

WHAT YOU HAVE NOT LEARNED AND DO NOT NEED
  loops. arrays. Every method here is decisions and arithmetic.

SUBMITTING
  Close IntelliJ. Zip this whole folder, including the hidden .git
  folder if you made one. Upload the zip, the UML diagram, and the
  flowchart to Canvas.
