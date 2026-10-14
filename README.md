# Java programming practice

Standalone beginner programs from the programming practice list.
Each solution is added with a separate commit and push.

## Run an exercise

Requires JDK 8 or newer.

```sh
mkdir -p build
javac -d build 01-basic-input-output/HelloWorld.java
java -cp build HelloWorld
```

Replace `HelloWorld` with the class name of the exercise you want to run.

## Exercises

| Program | Practice | Sample input |
| --- | --- | --- |
| [HelloWorld.java](01-basic-input-output/HelloWorld.java) | Print Hello World | `No input` |
| [PersonalDetails.java](01-basic-input-output/PersonalDetails.java) | Read name, age, and address | `Prabin Poudel / 20 / Kathmandu Nepal` |
| [DisplayTwoNumbers.java](01-basic-input-output/DisplayTwoNumbers.java) | Input and display two numbers | `12.5 -3` |
| [SimpleCalculator.java](01-basic-input-output/SimpleCalculator.java) | Calculate with +, -, *, /, and % | `8 + 2` |
| [SwapNumbers.java](01-basic-input-output/SwapNumbers.java) | Swap two numbers using a temporary variable | `2.5 -3.5` |
| [TemperatureConverter.java](01-basic-input-output/TemperatureConverter.java) | Convert Celsius and Fahrenheit in both directions | `C 0` |

## Basic mathematical programs

### Rectangle area and perimeter

[RectangleCalculator.java](02-basic-mathematical-programs/RectangleCalculator.java) accepts non-negative length and width, including zero, and prints results to two decimal places.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/RectangleCalculator.java
java -cp build RectangleCalculator
```

Sample input:

```text
5 3
```

Result (after the prompt):

```text
Area: 15.00
Perimeter: 16.00
```

### Circle area and circumference

[CircleCalculator.java](02-basic-mathematical-programs/CircleCalculator.java) accepts non-negative radius, including zero, and prints results to two decimal places.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/CircleCalculator.java
java -cp build CircleCalculator
```

Sample input:

```text
5
```

Result (after the prompt):

```text
Area: 78.54
Circumference: 31.42
```

### Simple interest

[SimpleInterest.java](02-basic-mathematical-programs/SimpleInterest.java) reads principal, annual percentage rate, and time in years (fractional years are allowed). Inputs must be finite and non-negative. Simple interest = principal × rate × years / 100; total amount = principal + interest. Results use two decimal places.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/SimpleInterest.java
java -cp build SimpleInterest
```

Sample input:

```text
1000 5 2
```

Result (after the prompt):

```text
Simple interest: 100.00
Total amount: 1100.00
```

### Compound interest

[CompoundInterest.java](02-basic-mathematical-programs/CompoundInterest.java) Reads principal, annual percentage rate, and time in years. Uses annual compounding: amount = principal × (1 + rate / 100)^years; interest = amount − principal. Fractional years use the same power formula. Inputs must be finite and non-negative; results use two decimal places.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/CompoundInterest.java
java -cp build CompoundInterest
```

Sample input:

```text
1000 5 2
```

Result (after the prompt):

```text
Compound interest: 102.50
Total amount: 1102.50
```

### Seconds to hours, minutes, and seconds

[SecondsConverter.java](02-basic-mathematical-programs/SecondsConverter.java) Reads one non-negative whole number on a line (up to 9223372036854775807). Uses division and remainder to split it into total hours, remaining minutes, and remaining seconds. Hours may exceed 23; minutes and seconds stay between 0 and 59.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/SecondsConverter.java
java -cp build SecondsConverter
```

Sample input:

```text
3661
```

Result (after the prompt):

```text
Hours: 1
Minutes: 1
Seconds: 1
```

### Average of numbers

[AverageOfNumbers.java](02-basic-mathematical-programs/AverageOfNumbers.java) reads a positive whole-number count on its own line, then that many finite numbers separated by whitespace. Negative values and decimals are allowed. It computes sum / count and displays the average to two decimal places. An overflowing running sum is reported instead of printing an invalid result.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/AverageOfNumbers.java
java -cp build AverageOfNumbers
```

Sample input:

```text
3
10 20 30
```

Result (after the prompts):

```text
Average: 20.00
```

### Percentage and grade

[PercentageAndGrade.java](02-basic-mathematical-programs/PercentageAndGrade.java) reads obtained marks and maximum marks, then calculates percentage = obtained / maximum × 100. Maximum marks must be positive; obtained marks must be between zero and maximum. Both values must be finite.

Example practice scale (not an institutional grading policy): A ≥ 90%, B ≥ 80%, C ≥ 70%, D ≥ 60%, E ≥ 50%, otherwise F. Grade comparisons use the unrounded percentage; the displayed percentage is rounded to two decimal places.

```sh
mkdir -p build
javac -d build 02-basic-mathematical-programs/PercentageAndGrade.java
java -cp build PercentageAndGrade
```

Sample input:

```text
425 500
```

Result (after the prompt):

```text
Percentage: 85.00%
Grade: B
```

## Decision-making

### Positive, negative, or zero

[NumberSign.java](03-decision-making/NumberSign.java) reads one finite floating-point number and uses `if/else` to classify it. Integers, decimals, and scientific notation are accepted. Both positive and negative zero are classified as zero. Values are interpreted using double-precision floating point.

```sh
mkdir -p build
javac -d build 03-decision-making/NumberSign.java
java -cp build NumberSign
```

Sample input:

```text
-12.5
```

Result (after the prompt):

```text
Negative
```

### Even or odd

[EvenOddChecker.java](03-decision-making/EvenOddChecker.java) reads one signed integer on a line and checks its remainder when divided by two. Zero and negative even numbers are even. Accepted range: −9223372036854775808 to 9223372036854775807. Decimals, extra tokens, and out-of-range inputs are rejected.

```sh
mkdir -p build
javac -d build 03-decision-making/EvenOddChecker.java
java -cp build EvenOddChecker
```

Sample input:

```text
-7
```

Result (after the prompt):

```text
Odd
```

### Largest of two numbers

[LargestOfTwo.java](03-decision-making/LargestOfTwo.java) reads two finite numbers and uses `if/else` to print the larger value. If they compare equal, it reports that both are equal. Integers, decimals, and scientific notation are accepted and interpreted using double-precision floating point; positive and negative zero compare equal.

```sh
mkdir -p build
javac -d build 03-decision-making/LargestOfTwo.java
java -cp build LargestOfTwo
```

Sample input:

```text
10 20
```

Result (after the prompt): `Largest: 20` (Java displays `20.0`).

### Largest of three numbers

[LargestOfThree.java](03-decision-making/LargestOfThree.java) reads three finite numbers and uses `if/else` comparisons to print the largest value. Tied maximum values are handled with `>=`. Integers, decimals, and scientific notation are accepted and interpreted using double-precision floating point; positive and negative zero compare equal.

```sh
mkdir -p build
javac -d build 03-decision-making/LargestOfThree.java
java -cp build LargestOfThree
```

Sample input:

```text
10 20 15
```

Result (after the prompt): `Largest: 20` (Java displays `20.0`).

### Leap year

[LeapYearChecker.java](03-decision-making/LeapYearChecker.java) reads one positive whole year and applies the Gregorian rule: divisible by 400, or divisible by 4 but not by 100. For example, 2000 is a leap year and 1900 is not. This exercise applies the rule to all accepted years, without modeling historical calendar changes. Accepted range: 1 to 9223372036854775807. Decimals and extra tokens are rejected.

```sh
mkdir -p build
javac -d build 03-decision-making/LeapYearChecker.java
java -cp build LeapYearChecker
```

Sample input:

```text
2024
```

Result (after the prompt):

```text
Leap year
```

### Voting eligibility (age-only practice)

[VotingEligibility.java](03-decision-making/VotingEligibility.java) reads one non-negative age in whole years and uses `if/else` with an example threshold of 18. This exercise checks only age, not citizenship, registration, or other voting requirements. The threshold is an exercise assumption rather than a complete eligibility determination. Accepted input range: 0 to 9223372036854775807; decimals and extra tokens are rejected.

```sh
mkdir -p build
javac -d build 03-decision-making/VotingEligibility.java
java -cp build VotingEligibility
```

Sample input:

```text
18
```

Result (after the prompt):

```text
Eligible by age.
```

### Grade calculation

[GradeCalculator.java](03-decision-making/GradeCalculator.java) reads one score out of 100, rather than calculating a percentage from marks. Uses the same example practice scale as PercentageAndGrade: A >= 90, B >= 80, C >= 70, D >= 60, E >= 50, otherwise F. The finite score must be in [0, 100]. Fractional scores use their unrounded value for comparison. This is an exercise scale, not an institutional grading policy.

```sh
mkdir -p build
javac -d build 03-decision-making/GradeCalculator.java
java -cp build GradeCalculator
```

Sample input:

```text
85
```

Result (after the prompt):

```text
Grade: B
```

### Divisible by 5 and 11

[DivisibleByFiveAndEleven.java](03-decision-making/DivisibleByFiveAndEleven.java) reads one signed 64-bit integer and uses remainder checks joined by && to test divisibility by both 5 and 11. Zero and negative multiples of 55 satisfy the condition. Accepted range: -9223372036854775808 to 9223372036854775807; decimals and extra tokens are rejected.

```sh
mkdir -p build
javac -d build 03-decision-making/DivisibleByFiveAndEleven.java
java -cp build DivisibleByFiveAndEleven
```

Sample input:

```text
55
```

Result (after the prompt):

```text
Divisible by both 5 and 11.
```

### Simple electricity bill

[ElectricityBillCalculator.java](03-decision-making/ElectricityBillCalculator.java) reads one finite, non-negative number of consumed units. Fractional units are allowed. Uses fictional progressive rates for practice: the first 100 units cost 1.50 each, the next 100 cost 2.50 each, and units above 200 cost 4.00 each. Each rate applies only to its slab. No fixed charge, tax, or surcharge is included; these are not utility tariffs. Output uses generic currency units and two decimal places.

```sh
mkdir -p build
javac -d build 03-decision-making/ElectricityBillCalculator.java
java -cp build ElectricityBillCalculator
```

Sample input:

```text
250
```

Result (after the prompt):

```text
Example bill: 600.00 currency units
```

## Switch programs

### Menu-driven calculator

[MenuCalculator.java](04-switch-programs/MenuCalculator.java) repeatedly displays a menu: 1 add, 2 subtract, 3 multiply, 4 divide, 5 remainder, 0 exit. Enter the choice and each operand on separate lines. Uses a switch for arithmetic and double-precision values; remainder uses Java `%` or C++ `std::fmod`. Invalid numeric choices, division/remainder by zero, and overflowing results return to the menu. Malformed or non-finite input ends the program with an error.

```sh
mkdir -p build
javac -d build 04-switch-programs/MenuCalculator.java
java -cp build MenuCalculator
```

Sample input (divide 9 by 2, then exit):

```text
4
9
2
0
```

Output includes `Result: 4.5` and `Goodbye.` along with the menus and prompts.

### Day number to day name

[DayName.java](04-switch-programs/DayName.java) reads one whole-number day and uses a switch to select its name. Mapping: 1 Monday, 2 Tuesday, 3 Wednesday, 4 Thursday, 5 Friday, 6 Saturday, 7 Sunday. Values outside 1-7 are rejected; malformed input, decimals, and extra tokens are rejected too.

```sh
mkdir -p build
javac -d build 04-switch-programs/DayName.java
java -cp build DayName
```

Sample input:

```text
3
```

Result (after the prompt):

```text
Wednesday
```

### Month number to month name

[MonthName.java](04-switch-programs/MonthName.java) reads one whole-number month and uses a switch to select its English Gregorian month name: 1 January through 12 December. Values outside 1-12, malformed input, decimals, and extra tokens are rejected.

```sh
mkdir -p build
javac -d build 04-switch-programs/MonthName.java
java -cp build MonthName
```

Sample input:

```text
10
```

Result (after the prompt):

```text
October
```
