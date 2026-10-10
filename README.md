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
