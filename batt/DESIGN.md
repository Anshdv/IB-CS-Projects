# PhoneBattery — Design

Name: Ansh Devlekar
Period: 1

**Complete this file BEFORE you write any Java.**

---

## 1. My instance variables

List every instance variable you will use.

| Name | Type | What it holds |
|---|---|---|
| FULL_CHARGE | int | The constant value of the initial charge a new battery starts at |
| PERCENT_PER_MINUTE | double | The constant amount of battery percentage that depletes with every minute of use |
| minutesOfCharge | int | The current charge in the phone's battery |
---

## 2. Why each one is needed

For each variable above, explain why the class cannot work without it.
Which of the six public members depend on it?

The constants FULL_CHARGE and PERCENT_PER_MINUTE were created to avoid magic numbers.
The constructor and method getMinutesUsed() are dependent on FULL_CHARGE.
The method getPercentRemaining() is dependent on PERCENT_PER_MINUTE.
The instance variable minutesOfCharge tracks the amount of time the phone can still run.
All six public members are dependent on this variable.

---

## 3. What I decided NOT to store

Name one value you considered storing as an instance variable and
decided against. Explain what you do instead.

**This is the most important part of the design. Most of the points for
Part 1 are here.**

**The value I considered storing:**
The actual percentage of the phone battery

**Why I decided not to:**
The percentage can be calculated from the minutes of charge in the phone.
It does not need its own variable to be kept track of.

**What I do instead:**
In the method getPercentRemaining(), I multiply the number of minutes of charge left in the phone by 0.25.
The value of this expression is the percentage of battery the phone has.

---



