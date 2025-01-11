# Circle Area Calculator

A simple Kotlin program that calculates the area of a circle based on the radius input provided by the user.

## Features
- Accepts user input for the radius of the circle.
- Validates the input to ensure it is a valid number.
- Calculates the area of the circle using the formula:
  
  ```
  area = π * radius * radius
  ```
- Outputs the result formatted to two decimal places.

## How to Use

1. Clone this repository or copy the Kotlin file to your local environment.
2. Ensure you have Kotlin installed on your machine. You can verify by running:
   ```bash
   kotlinc -version
   ```
3. Compile and run the program:
   ```bash
   kotlinc menghitungLuasLingkaran.kt -include-runtime -d menghitungLuasLingkaran.jar
   java -jar menghitungLuasLingkaran.jar
   ```
4. Follow the on-screen prompt to input the radius of the circle.
5. View the calculated area in the output.

## Example

### Input
```
Input: 7
```

### Output
```
Output: Luas lingkaran dengan jari-jari 7 adalah 153.94
```

## Code Highlights

- The program uses `Math.PI` for accurate π values.
- Input validation is performed to ensure the program doesn't crash on invalid inputs.
- The output is formatted to two decimal places using Kotlin's `String.format` method.

## Dependencies
- Kotlin 1.8 or newer.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to submit issues or pull requests to improve the project!
