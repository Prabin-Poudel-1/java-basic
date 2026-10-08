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
