# The Phone Battery

## Before you start

1. Open this folder in IntelliJ.
2. Add JUnit 5 to the classpath: open `PhoneBatteryTest.java`, click the
   red JUnit import, choose **Add 'JUnit5' to classpath**.
3. Run the provided test `newBatteryIsFull`. It will fail — that is
   expected. It will pass once you write the constructor.
4. Run `git init` in this folder. Commit at least four times as you work.

## Order of work

1. Complete `DESIGN.md`. Do not skip this.
2. Declare your instance variables. Compile.
3. Write the constructor. Compile. The provided test should now pass.
4. Write `getMinutesRemaining`. Compile and test.
5. Write `use` and `charge`. Compile and test.
6. Write `getMinutesUsed`. Compile and test.
7. Write `getPercentRemaining`. Compile and test.
8. Fill in `PhoneBatteryApp`.
9. Write your Javadoc.
10. Build the UML diagram in Draw.io and export it into `src/`.

## The numbers your code must produce

A full battery lasts **400 minutes**. Each minute is worth **0.25 percent**.

| After these calls | getMinutesRemaining() | getMinutesUsed() | getPercentRemaining() |
|---|---|---|---|
| (new battery) | 400 | 0 | 100.0 |
| use(100) | 300 | 100 | 75.0 |
| use(100), use(200) | 100 | 300 | 25.0 |
| use(360) | 40 | 360 | 10.0 |
| use(400) | 0 | 400 | 0.0 |
| use(320), charge(120) | 200 | 200 | 50.0 |
| use(1) | 399 | 1 | 99.75 |

Minutes remaining and minutes used always add up to 400.

## Submitting

Zip the **entire** project folder, including hidden files, and upload the
zip to Canvas. Confirm the `.git` folder is inside your zip before you
submit.

**This assignment has a lockout date. Check Canvas. It does not move.**
