THE TOUR VAN  -  Chapter 4 Programming Assignment
=================================================

WHAT IS HERE
  src/Vehicle.java     empty class
  src/Leg.java         empty class
  src/Odometer.java    empty class
  src/TourCost.java    empty class
  src/TourApp.java     empty main method
  test/VehicleTest.java      GIVEN. These tests are part of the
                             assignment. Your code must pass them
                             exactly as they are written.
  test/LegTest.java          empty
  test/OdometerTest.java     empty
  test/TourCostTest.java     empty

THIS PROJECT DOES NOT COMPILE YET. THAT IS ON PURPOSE.
  VehicleTest calls methods that do not exist. Every red mark in it
  is telling you a signature you have to write. Open it first and
  read it as a specification, not as an error.

  The handout lists what every method takes in, what it gives back,
  and what it promises. Turning that into a signature is your job,
  and so is deciding what your instance variables are and which of
  them are private.

  You also write all of the javadoc. None is provided.

SETUP IN INTELLIJ
  1. File > Open, choose this folder.
  2. Right-click src      > Mark Directory as > Sources Root.
  3. Right-click test     > Mark Directory as > Test Sources Root.
  4. Open VehicleTest.java. Hover the red "org.junit.jupiter" import,
     press Alt+Enter, choose "Add JUnit5 to classpath".

THE RULE YOU CANNOT BREAK
  Scanner and System.out appear in TourApp.java and NOWHERE else.
  If the word "println" shows up in Vehicle, Leg, Odometer or
  TourCost, that part scores zero. There is no partial credit on it.

WHAT YOU SUBMIT MUST COMPILE
  Receiving a project that does not compile is this assignment.
  Handing one back is not finishing it. If a method defeats you,
  leave it returning a placeholder with a TODO comment so the rest
  of your work can still be run and graded.

WHAT YOU HAVE LEARNED THAT YOU NEED
  integer division and %, casting, Math.ceil, Math.round, printf, Scanner.

WHAT YOU HAVE NOT LEARNED AND DO NOT NEED
  if statements. loops. arrays. You can finish this without any of them.

SUBMITTING
  Close IntelliJ. Zip this whole folder, including the hidden .git
  folder if you made one. Upload the zip to Canvas.
