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

### Simple ATM menu

[SimpleATM.java](04-switch-programs/SimpleATM.java) simulates an account starting at 1000 whole currency units. Switch menu: 1 balance, 2 deposit, 3 withdraw, 0 exit. Enter every choice and amount on its own line. Amounts must be positive signed 64-bit integers; insufficient funds and balance overflow leave the balance unchanged. Invalid numeric choices and rejected transactions return to the menu; malformed input ends the program. Balance is kept only in memory and resets to 1000 on each launch. No banking connection or real transactions are involved.

```sh
mkdir -p build
javac -d build 04-switch-programs/SimpleATM.java
java -cp build SimpleATM
```

Sample input (deposit 250, withdraw 100, then exit):

```text
2
250
3
100
0
```

Output includes `Balance: 1250`, `Balance: 1150`, and `Goodbye.` along with the menus and prompts.

### Shape area calculator

[ShapeAreaCalculator.java](04-switch-programs/ShapeAreaCalculator.java) Offers rectangle (length × width), circle (π × radius²), and triangle (base × height ÷ 2). Select a shape, then enter its dimensions on separate lines. Dimensions must be finite and non-negative. Results are shown to two decimal places.

```sh
mkdir -p build
javac -d build 04-switch-programs/ShapeAreaCalculator.java
java -cp build ShapeAreaCalculator
```

Sample input: `2
5
`

### Print numbers 1 to 100

[PrintOneToHundred.java](05-basic-loops/PrintOneToHundred.java) Uses a for loop to print every integer from 1 through 100, one per line. No input is required.

```sh
mkdir -p build
javac -d build 05-basic-loops/PrintOneToHundred.java
java -cp build PrintOneToHundred
```

Sample input: `No input`

### Print even numbers from 1 to 100

[PrintEvenNumbers.java](05-basic-loops/PrintEvenNumbers.java) Uses a for loop that advances by two to print the even integers from 2 through 100, one per line. No input is required.

```sh
mkdir -p build
javac -d build 05-basic-loops/PrintEvenNumbers.java
java -cp build PrintEvenNumbers
```

Sample input: `No input`

### Print odd numbers from 1 to 100

[PrintOddNumbers.java](05-basic-loops/PrintOddNumbers.java) Uses a for loop that advances by two to print odd integers from 1 through 99, one per line. No input is required.

```sh
mkdir -p build
javac -d build 05-basic-loops/PrintOddNumbers.java
java -cp build PrintOddNumbers
```

Sample input: `No input`

### Sum from 1 to n

[SumOneToN.java](05-basic-loops/SumOneToN.java) Reads a whole number n from 0 through 4294967295 and calculates n × (n + 1) ÷ 2. It divides an even factor before multiplying, keeping the result within the signed 64-bit range. n = 0 gives a sum of zero.

```sh
mkdir -p build
javac -d build 05-basic-loops/SumOneToN.java
java -cp build SumOneToN
```

Sample input: `10`

### Multiplication table

[MultiplicationTable.java](05-basic-loops/MultiplicationTable.java) Reads a signed integer and prints its first ten multiples. The input is limited to ±922337203685477580 so every product fits in a signed 64-bit integer. Negative numbers and zero are supported.

```sh
mkdir -p build
javac -d build 05-basic-loops/MultiplicationTable.java
java -cp build MultiplicationTable
```

Sample input: `7`

### Power of a number

[PowerCalculator.java](05-basic-loops/PowerCalculator.java) Reads a finite floating-point base and an integer exponent from -1024 through 1024. A loop multiplies the base by itself; negative exponents return the reciprocal. The result is printed with up to 10 significant digits. Zero with a negative exponent, non-finite inputs, and overflow are reported.

```sh
mkdir -p build
javac -d build 05-basic-loops/PowerCalculator.java
java -cp build PowerCalculator
```

Sample input: `2 10`

### Count digits in a number

[CountDigits.java](05-basic-loops/CountDigits.java) Reads one signed 64-bit integer and counts its base-10 digits with a do/while loop. The minus sign is not counted; zero has one digit. Decimals, extra values, and integers outside the signed 64-bit range are rejected.

```sh
mkdir -p build
javac -d build 05-basic-loops/CountDigits.java
java -cp build CountDigits
```

Sample input: `-12345`

### Reverse a number

[ReverseNumber.java](06-number-based/ReverseNumber.java) Reads a signed 64-bit integer and reverses its decimal digits with a loop. Leading zeroes in the reversed result disappear; a minus sign stays at the front. If the reversed value cannot fit in a signed 64-bit integer, the program reports it.

```sh
mkdir -p build
javac -d build 06-number-based/ReverseNumber.java
java -cp build ReverseNumber
```

Sample input: `-120`

### Palindrome number

[PalindromeNumber.java](06-number-based/PalindromeNumber.java) Checks whether a non-negative signed 64-bit integer reads the same forward and backward. Uses a half-reversal loop to avoid overflowing while reversing large values. Negative numbers are not considered palindromes; zero is a palindrome.

```sh
mkdir -p build
javac -d build 06-number-based/PalindromeNumber.java
java -cp build PalindromeNumber
```

Sample input: `12321`

### Armstrong number

[ArmstrongNumber.java](06-number-based/ArmstrongNumber.java) For a non-negative signed 64-bit integer, counts its decimal digits and checks whether the sum of each digit raised to that count equals the original number. For example, 153 = 1³ + 5³ + 3³. Negative numbers are rejected; zero is an Armstrong number.

```sh
mkdir -p build
javac -d build 06-number-based/ArmstrongNumber.java
java -cp build ArmstrongNumber
```

Sample input: `153`

### Prime number

[PrimeNumber.java](06-number-based/PrimeNumber.java) reads one signed 32-bit whole number and checks whether it is prime by trying divisors up to its square root. Numbers below 2 are not prime. Decimals, extra tokens, and out-of-range values are rejected.

```sh
mkdir -p build
javac -d build 06-number-based/PrimeNumber.java
java -cp build PrimeNumber
```

Sample input: `29` (result: `Prime number`)

### Prime numbers in a range

[PrimeNumbersInRange.java](06-number-based/PrimeNumbersInRange.java) reads an inclusive start and end as signed 32-bit whole numbers, then prints every prime in that range. Ranges may include negative numbers; values below 2 are skipped. The start must not exceed the end, and extra or invalid input is rejected.

```sh
mkdir -p build
javac -d build 06-number-based/PrimeNumbersInRange.java
java -cp build PrimeNumbersInRange
```

Sample input: `10 30` (result: `11 13 17 19 23 29`)

### Fibonacci series

[FibonacciSeries.java](06-number-based/FibonacciSeries.java) reads a term count from 0 to 93 and prints that many Fibonacci numbers starting with 0, 1. The 93-term limit keeps every printed value within a signed 64-bit integer. Zero terms prints `No terms`; invalid counts and extra input are rejected.

```sh
mkdir -p build
javac -d build 06-number-based/FibonacciSeries.java
java -cp build FibonacciSeries
```

Sample input: `10` (result: `0 1 1 2 3 5 8 13 21 34`)

### Perfect number

[PerfectNumber.java](06-number-based/PerfectNumber.java) checks a positive signed 32-bit integer by summing its positive proper divisors. For example, 6 is perfect because 1 + 2 + 3 = 6. Zero, negative values, and 1 are not perfect. Invalid or extra input is rejected.

```sh
mkdir -p build
javac -d build 06-number-based/PerfectNumber.java
java -cp build PerfectNumber
```

Sample input: `28` (result: `Perfect number`)

### Strong number

[StrongNumber.java](06-number-based/StrongNumber.java) sums the factorials of the decimal digits of a non-negative signed 32-bit integer and compares the sum with the original value. Zero is a Strong number because 0! = 1? This exercise uses the standard digit-factorial definition, so zero is not Strong (0 != 1). Negative and invalid input is rejected.

```sh
mkdir -p build
javac -d build 06-number-based/StrongNumber.java
java -cp build StrongNumber
```

Sample input: `145` (result: `Strong number`)

### Sum of digits

[SumOfDigits.java](06-number-based/SumOfDigits.java) adds the decimal digits of one signed 64-bit integer, ignoring its minus sign. Zero has a digit sum of zero. The calculation safely handles the minimum signed 64-bit value; invalid or extra input is rejected.

```sh
mkdir -p build
javac -d build 06-number-based/SumOfDigits.java
java -cp build SumOfDigits
```

Sample input: `-12345` (result: `15`)

### Product of digits

[ProductOfDigits.java](06-number-based/ProductOfDigits.java) solves the product of digits exercise. It accepts whole-number input and reports invalid input clearly.

```sh
mkdir -p build
javac -d build 06-number-based/ProductOfDigits.java
java -cp build ProductOfDigits
```

Sample input: `1234`

### GCD/HCF

[GcdHcf.java](06-number-based/GcdHcf.java) solves the gcd/hcf exercise. It accepts whole-number input and reports invalid input clearly.

```sh
mkdir -p build
javac -d build 06-number-based/GcdHcf.java
java -cp build GcdHcf
```

Sample input: `48 18`

### LCM

[LcmCalculator.java](06-number-based/LcmCalculator.java) solves the lcm exercise. It accepts whole-number input and reports invalid input clearly.

```sh
mkdir -p build
javac -d build 06-number-based/LcmCalculator.java
java -cp build LcmCalculator
```

Sample input: `12 18`

### Square star pattern

[SquareStarPattern.java](07-pattern-programs/SquareStarPattern.java) prints a square of stars for a size from 1 to 50. Compile with javac and run with java. Sample input: `3`.
### Right triangle star pattern

[RightTrianglePattern.java](07-pattern-programs/RightTrianglePattern.java) prints a growing right triangle for a size from 1 to 50. Compile with javac and run with java. Sample input: `3`.
### Inverted triangle star pattern

[InvertedTrianglePattern.java](07-pattern-programs/InvertedTrianglePattern.java) prints a shrinking inverted triangle for a size from 1 to 50. Compile with javac and run with java. Sample input: `3`.

### Pyramid pattern

[PyramidPattern.java](07-pattern-programs/PyramidPattern.java) prints a centered pyramid of stars. Input size is 1–50.

Sample input: `3`

### Number triangle

[NumberTriangle.java](07-pattern-programs/NumberTriangle.java) prints consecutive numbers in a growing triangle. Input size is 1–50.

Sample input: `3`

### Floyd's triangle

[FloydTriangle.java](07-pattern-programs/FloydTriangle.java) prints consecutive numbers in Floyd triangle rows. Input size is 1–50.

Sample input: `3`

### Pascal triangle

[PascalTriangle.java](07-pattern-programs/PascalTriangle.java) prints Pascal triangle rows for a size from 1 to 20.

Sample input: `5`

### Diamond star pattern

[DiamondPattern.java](07-pattern-programs/DiamondPattern.java) prints a centered diamond for half-height from 1 to 25.

Sample input: `5`

### Add two numbers using a function

[AddTwoNumbersFunction.java](08-functions-methods/AddTwoNumbersFunction.java) adds two signed 32-bit integers in a reusable function.

Sample input: `5`

### maximum using function

[MaximumUsingFunction.java](08-functions-methods/MaximumUsingFunction.java) finds the larger of two signed integers with a helper function.

Sample input: `8 3`

### prime checker function

[PrimeCheckerFunction.java](08-functions-methods/PrimeCheckerFunction.java) checks primality using a reusable helper function.

Sample input: `8 3`

### factorial using function

[FactorialUsingFunction.java](08-functions-methods/FactorialUsingFunction.java) calculates factorial for values from 0 through 20 with a helper function.

Sample input: `8 3`

### Fibonacci using function

[FibonacciUsingFunction.java](08-functions-methods/FibonacciUsingFunction.java) prints a Fibonacci sequence using a function, with a term count from 0 to 93.

Sample input: `8 2`

### Function overloading

[FunctionOverloading.java](08-functions-methods/FunctionOverloading.java) demonstrates overloaded addition for integer and decimal values.

Sample input: `8 2`

### Pass arguments and return values

[PassArgumentsReturnValue.java](08-functions-methods/PassArgumentsReturnValue.java) computes rectangle area by passing dimensions to a function and returning its result.

Sample input: `8 2`

### recursive factorial

[RecursiveFactorial.java](28-recursion-problems/RecursiveFactorial.java) calculates factorial recursively for values from 0 to 20.

Sample input: `5`

### recursive Fibonacci

[RecursiveFibonacci.java](28-recursion-problems/RecursiveFibonacci.java) prints Fibonacci terms with a memoized recursive function for up to 93 terms.

Sample input: `5`

### recursive sum of digits

[RecursiveSum.java](28-recursion-problems/RecursiveSum.java) adds digits recursively and handles the signed 64-bit minimum.

Sample input: `5`

### recursive GCD

[RecursiveGcd.java](28-recursion-problems/RecursiveGcd.java) finds the GCD/HCF of two signed 32-bit numbers using Euclid’s recursive algorithm.

Sample input: `48 18`

### recursive reverse number

[RecursiveReverseNumber.java](28-recursion-problems/RecursiveReverseNumber.java) reverses the digits of a signed 32-bit integer recursively.

Sample input: `48 18`

### Tower of Hanoi

[TowerOfHanoi.java](28-recursion-problems/TowerOfHanoi.java) prints the recursive moves for 1 to 10 disks and reports the move count.

Sample input: `48 18`

### recursive binary search

[RecursiveBinarySearch.java](28-recursion-problems/RecursiveBinarySearch.java) searches a sorted array recursively and reports the matching index or not found.

Sample input: `3`

### array input and display

[ArrayInputDisplay.java](09-one-dimensional-arrays/ArrayInputDisplay.java) reads up to 100 whole numbers and displays them in order.

Sample input: `3`

### sum of array elements

[ArraySum.java](09-one-dimensional-arrays/ArraySum.java) reads up to 100 whole numbers and calculates their sum.

Sample input: `3`

### average of array

[ArrayAverage.java](09-one-dimensional-arrays/ArrayAverage.java) calculates the average of 1 to 100 signed whole numbers.

Sample input: `3 2 4 6`

### largest and smallest array elements

[LargestSmallestArray.java](09-one-dimensional-arrays/LargestSmallestArray.java) finds the minimum and maximum values in the input array.

Sample input: `3 2 4 6`

### second largest array element

[SecondLargestArray.java](09-one-dimensional-arrays/SecondLargestArray.java) finds the second distinct largest value, including for arrays with duplicate or negative values.

Sample input: `3 2 4 6`

### Reverse an array

[ReverseArray.java](09-one-dimensional-arrays/ReverseArray.java) reads an array size from 1 to 100 followed by that many whole numbers, then prints the values in reverse order. A one-element array is supported.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/ReverseArray.java
java -cp build ReverseArray
```

Sample input:

```text
5
1 2 3 4 5
```

Result (after the prompts): `Reversed array: 5 4 3 2 1`

### Count even and odd array elements

[CountEvenOddArray.java](09-one-dimensional-arrays/CountEvenOddArray.java) reads 1 to 100 whole numbers and counts how many are even or odd. Zero and negative numbers are handled using their remainder when divided by two.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/CountEvenOddArray.java
java -cp build CountEvenOddArray
```

Sample input:

```text
6
0 1 2 3 -4 -5
```

Result: `Even count: 3` and `Odd count: 3`

### Search for an array element

[SearchArrayElement.java](09-one-dimensional-arrays/SearchArrayElement.java) reads an array of 1 to 100 whole numbers and then a target value. It uses a linear search and reports the zero-based index of the first match, or `Not found`.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/SearchArrayElement.java
java -cp build SearchArrayElement
```

Sample input:

```text
6
4 8 2 8 -1 0
8
```

Result: `Found at index 1`

### Copy an array

[CopyArray.java](09-one-dimensional-arrays/CopyArray.java) reads 1 to 100 whole numbers, copies each value into a second array, and displays the copy in its original order.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/CopyArray.java
java -cp build CopyArray
```

Sample input:

```text
4
7 -2 7 0
```

Result: `Copied array: 7 -2 7 0`

### Merge two arrays

[MergeArrays.java](09-one-dimensional-arrays/MergeArrays.java) reads two arrays, each with 1 to 100 whole numbers, and copies their values in order into one merged array.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/MergeArrays.java
java -cp build MergeArrays
```

Sample input:

```text
3
1 2 3
2
4 5
```

Result: `Merged array: 1 2 3 4 5`

### Remove duplicate array elements

[RemoveDuplicates.java](09-one-dimensional-arrays/RemoveDuplicates.java) reads 1 to 100 whole numbers and keeps the first occurrence of each value. It preserves the original order of the remaining elements.

```sh
mkdir -p build
javac -d build 09-one-dimensional-arrays/RemoveDuplicates.java
java -cp build RemoveDuplicates
```

Sample input:

```text
6
4 2 4 3 2 3
```

Result: `Array without duplicates: 4 2 3`

## Searching algorithms

### Binary search

[BinarySearch.java](10-searching-algorithms/BinarySearch.java) searches a sorted ascending array of 1 to 100 whole numbers. It repeatedly checks the middle value, reducing the search range by half. The result uses a zero-based index.

```sh
mkdir -p build
javac -d build 10-searching-algorithms/BinarySearch.java
java -cp build BinarySearch
```

Sample input:

```text
6
-5 -1 0 4 8 12
8
```

Result: `Found at index 4`

## Sorting algorithms

### Bubble sort

[BubbleSort.java](11-sorting-algorithms/BubbleSort.java) sorts 1 to 100 whole numbers in ascending order. It compares neighboring values and swaps them when they are out of order; an already sorted pass ends the algorithm early.

```sh
mkdir -p build
javac -d build 11-sorting-algorithms/BubbleSort.java
java -cp build BubbleSort
```

Sample input:

```text
6
5 -1 3 3 0 2
```

Result: `Sorted array: -1 0 2 3 3 5`

### Selection sort

[SelectionSort.java](11-sorting-algorithms/SelectionSort.java) sorts 1 to 100 whole numbers in ascending order. On each pass it selects the smallest remaining value and places it at the beginning of the unsorted portion.

```sh
mkdir -p build
javac -d build 11-sorting-algorithms/SelectionSort.java
java -cp build SelectionSort
```

Sample input:

```text
6
5 -1 3 3 0 2
```

Result: `Sorted array: -1 0 2 3 3 5`

### Insertion sort

[InsertionSort.java](11-sorting-algorithms/InsertionSort.java) sorts 1 to 100 whole numbers in ascending order. It takes each next value and inserts it into its correct position in the already sorted part of the array.

```sh
mkdir -p build
javac -d build 11-sorting-algorithms/InsertionSort.java
java -cp build InsertionSort
```

Sample input:

```text
6
5 -1 3 3 0 2
```

Result: `Sorted array: -1 0 2 3 3 5`

### Merge sort

[MergeSort.java](11-sorting-algorithms/MergeSort.java) sorts 1 to 100 whole numbers in ascending order. It recursively divides the array into halves, sorts them, and merges the sorted halves back together.

```sh
mkdir -p build
javac -d build 11-sorting-algorithms/MergeSort.java
java -cp build MergeSort
```

Sample input:

```text
6
5 -1 3 3 0 2
```

Result: `Sorted array: -1 0 2 3 3 5`

### Quick sort

[QuickSort.java](11-sorting-algorithms/QuickSort.java) sorts 1 to 100 whole numbers in ascending order. It partitions values around a pivot, then recursively sorts the portions on either side.

```sh
mkdir -p build
javac -d build 11-sorting-algorithms/QuickSort.java
java -cp build QuickSort
```

Sample input:

```text
6
5 -1 3 3 0 2
```

Result: `Sorted array: -1 0 2 3 3 5`

## Two-dimensional arrays and matrices

### Input and display a matrix

[MatrixInputDisplay.java](12-two-dimensional-arrays/MatrixInputDisplay.java) reads row and column counts from 1 to 10, then reads and displays the matrix row by row.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/MatrixInputDisplay.java
java -cp build MatrixInputDisplay
```

Sample input:

```text
2 3
1 2 3
4 5 6
```

The displayed matrix is:

```text
1 2 3
4 5 6
```

### Matrix addition

[MatrixAddition.java](12-two-dimensional-arrays/MatrixAddition.java) adds two matrices with the same dimensions. Enter row and column counts from 1 to 10, then enter each matrix row by row.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/MatrixAddition.java
java -cp build MatrixAddition
```

Sample input:

```text
2 2
1 2
3 4
5 6
7 8
```

The sum matrix is:

```text
6 8
10 12
```

### Matrix subtraction

[MatrixSubtraction.java](12-two-dimensional-arrays/MatrixSubtraction.java) subtracts the second matrix from the first. Both matrices use the same row and column counts, each from 1 to 10.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/MatrixSubtraction.java
java -cp build MatrixSubtraction
```

Sample input:

```text
2 2
9 8
7 6
1 2
3 4
```

The difference matrix is:

```text
8 6
4 2
```

### Matrix multiplication

[MatrixMultiplication.java](12-two-dimensional-arrays/MatrixMultiplication.java) multiplies two matrices when the first matrix's column count equals the second matrix's row count. Each dimension must be from 1 to 10.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/MatrixMultiplication.java
java -cp build MatrixMultiplication
```

Sample input:

```text
2 3
1 2 3
4 5 6
3 2
7 8
9 10
11 12
```

The product matrix is:

```text
58 64
139 154
```

### Matrix transpose

[MatrixTranspose.java](12-two-dimensional-arrays/MatrixTranspose.java) reads a matrix with 1 to 10 rows and columns, then displays its transpose by turning each original column into a row.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/MatrixTranspose.java
java -cp build MatrixTranspose
```

Sample input:

```text
2 3
1 2 3
4 5 6
```

The transpose is:

```text
1 4
2 5
3 6
```

### Sum of main diagonal elements

[DiagonalSum.java](12-two-dimensional-arrays/DiagonalSum.java) reads a square matrix of size 1 to 10 and adds the values whose row and column indexes are equal (the main diagonal).

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/DiagonalSum.java
java -cp build DiagonalSum
```

Sample input:

```text
3
1 2 3
4 5 6
7 8 9
```

Result: `Main diagonal sum: 15`

### Check whether a matrix is symmetric

[SymmetricMatrix.java](12-two-dimensional-arrays/SymmetricMatrix.java) reads a square matrix of size 1 to 10 and checks whether each value at row `i`, column `j` equals the value at row `j`, column `i`.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/SymmetricMatrix.java
java -cp build SymmetricMatrix
```

Sample input:

```text
3
1 2 3
2 4 5
3 5 6
```

Result: `Symmetric matrix`

### Find the largest matrix element

[LargestMatrixElement.java](12-two-dimensional-arrays/LargestMatrixElement.java) reads a matrix with 1 to 10 rows and columns and tracks the largest whole number as each value is entered. Negative values are supported.

```sh
mkdir -p build
javac -d build 12-two-dimensional-arrays/LargestMatrixElement.java
java -cp build LargestMatrixElement
```

Sample input:

```text
2 3
-5 2 7
0 11 4
```

Result: `Largest matrix element: 11`

## String programs

### Read and display a string

[ReadDisplayString.java](13-string-programs/ReadDisplayString.java) reads a complete line, including spaces, and displays it. An empty line is accepted.

```sh
mkdir -p build
javac -d build 13-string-programs/ReadDisplayString.java
java -cp build ReadDisplayString
```

Sample input:

```text
Hello, Java and C++!
```

Result: `You entered: Hello, Java and C++!`

### Find the length of a string

[StringLength.java](13-string-programs/StringLength.java) reads a full line of text and prints its length, including spaces. An empty line has length zero.

```sh
mkdir -p build
javac -d build 13-string-programs/StringLength.java
java -cp build StringLength
```

Sample input: `Hello world`

Result: `String length: 11`

### Reverse a string

[ReverseString.java](13-string-programs/ReverseString.java) reads a full line, including spaces, and prints its characters in reverse order. An empty line remains empty.

```sh
mkdir -p build
javac -d build 13-string-programs/ReverseString.java
java -cp build ReverseString
```

Sample input: `A man`

Result: `Reversed string: nam A`

### Check for a palindrome string

[PalindromeString.java](13-string-programs/PalindromeString.java) checks whether a line reads the same forward and backward. It ignores spaces, punctuation, and letter case; this beginner example compares ASCII letters and digits.

```sh
mkdir -p build
javac -d build 13-string-programs/PalindromeString.java
java -cp build PalindromeString
```

Sample input: `A man, a plan, a canal: Panama!`

Result: `Palindrome`

### Count vowels and consonants

[CountVowelsConsonants.java](13-string-programs/CountVowelsConsonants.java) counts ASCII English letters in a line, treating uppercase and lowercase equally. Spaces, punctuation, and digits are ignored; `a`, `e`, `i`, `o`, and `u` are vowels, while other letters are consonants.

```sh
mkdir -p build
javac -d build 13-string-programs/CountVowelsConsonants.java
java -cp build CountVowelsConsonants
```

Sample input: `Hello, World! 123`

Result: `Vowels: 3` and `Consonants: 7`

### Count words in a string

[CountWords.java](13-string-programs/CountWords.java) counts whitespace-separated words in a full line. Multiple spaces do not add extra words, and an empty or whitespace-only line has a count of zero.

```sh
mkdir -p build
javac -d build 13-string-programs/CountWords.java
java -cp build CountWords
```

Sample input: `Hello, world! from Java`

Result: `Word count: 4`

### Convert text to uppercase and lowercase

[ChangeCase.java](13-string-programs/ChangeCase.java) reads a full line and displays uppercase and lowercase versions. This beginner example converts ASCII English letters and leaves spaces, digits, and punctuation unchanged.

```sh
mkdir -p build
javac -d build 13-string-programs/ChangeCase.java
java -cp build ChangeCase
```

Sample input: `Java 101!`

Result: `Uppercase: JAVA 101!` and `Lowercase: java 101!`

### Compare two strings

[CompareStrings.java](13-string-programs/CompareStrings.java) reads two complete lines and compares them lexicographically, including spaces and letter case. It reports whether they are equal or which comes first.

```sh
mkdir -p build
javac -d build 13-string-programs/CompareStrings.java
java -cp build CompareStrings
```

Sample input:

```text
apple
banana
```

Result: `First string comes before the second`

### Concatenate two strings

[ConcatenateStrings.java](13-string-programs/ConcatenateStrings.java) reads two complete lines and joins them in order. It does not add a separator, so include spaces in either input line when needed.

```sh
mkdir -p build
javac -d build 13-string-programs/ConcatenateStrings.java
java -cp build ConcatenateStrings
```

Sample input:

```text
Good 
morning
```

Result: `Concatenated string: Good morning`

### Character frequency

[CharacterFrequency.java](13-string-programs/CharacterFrequency.java) counts each distinct character in a full line, preserving the order of its first appearance. Counting is case-sensitive; spaces are shown as `(space)`. An empty line has no character entries.

```sh
mkdir -p build
javac -d build 13-string-programs/CharacterFrequency.java
java -cp build CharacterFrequency
```

Sample input: `banana`

Result: `b: 1`, `a: 3`, and `n: 2`

### Remove spaces from a string

[RemoveSpaces.java](13-string-programs/RemoveSpaces.java) removes ordinary space characters from a full line while preserving all other characters and their order.

```sh
mkdir -p build
javac -d build 13-string-programs/RemoveSpaces.java
java -cp build RemoveSpaces
```

Sample input: `a b  c`

Result: `Without spaces: abc`

### Find duplicate characters

[DuplicateCharacters.java](13-string-programs/DuplicateCharacters.java) lists each character that appears more than once, with its count. Results follow the order of first appearance; matching is case-sensitive, and spaces are labeled `(space)`.

```sh
mkdir -p build
javac -d build 13-string-programs/DuplicateCharacters.java
java -cp build DuplicateCharacters
```

Sample input: `banana`

Result: `a: 3` and `n: 2`

## Structures and classes

### Student information

[StudentInformation.java](14-structures-classes/StudentInformation.java) stores a student's name, positive roll number, and positive age in a `Student` class, then displays the record. Names can contain spaces.

```sh
mkdir -p build
javac -d build 14-structures-classes/StudentInformation.java
java -cp build StudentInformation
```

Sample input:

```text
Prabin Poudel
27
20
```

The program displays the name, roll number, and age.

### Employee information

[EmployeeInformation.java](14-structures-classes/EmployeeInformation.java) stores an employee's name, positive ID, and non-negative monthly salary in an `Employee` class, then displays the record. Names can contain spaces.

```sh
mkdir -p build
javac -d build 14-structures-classes/EmployeeInformation.java
java -cp build EmployeeInformation
```

Sample input:

```text
Ada Lovelace
102
55000.50
```

The salary is displayed to two decimal places.

### Book information

[BookInformation.java](14-structures-classes/BookInformation.java) stores a book's title, author, ISBN, and positive page count in a `Book` class, then displays the record. The ISBN is kept as text so leading zeroes are preserved.

```sh
mkdir -p build
javac -d build 14-structures-classes/BookInformation.java
java -cp build BookInformation
```

Sample input:

```text
The Hobbit
J. R. R. Tolkien
9780547928227
310
```

The program displays all four fields.

### Multiple student records

[MultipleStudentRecords.java](14-structures-classes/MultipleStudentRecords.java) stores and displays 1–100 student records in an array of `Student` objects. Each name may contain spaces; roll numbers and ages must be positive whole numbers.

```sh
mkdir -p build
javac -d build 14-structures-classes/MultipleStudentRecords.java
java -cp build MultipleStudentRecords
```

Sample input:

```text
2
Ada Lovelace
101
36
Grace Hopper
102
85
```

The program displays both complete student records.
