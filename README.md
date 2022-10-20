by Sebastian Kurka  
my [Git](https://github.com/Sebastian-Kurka/msd21_kurka_sebastian)  
[FH-Joanneum](https://www.fh-joanneum.at/)
# README <br> Lotto Number Generator


## What it does:

Generates an 6-digit array of random numbers between 1 and 45.
The amount of the generated tipps are based on the current time. 

## How it works:

1. Using the `Date().getTime`-funktion we get the current time in milliseconds wich passed since January 1. 1970.


2. By calculating the **checksum** of this number, we get the amount of tipps we will generate.


3. Printing the **single digits** of the milliseconds back to forth as well as the **checksum** in the console.


4. Generating an array of random numbers between **1** and **64** 
   * **_Note:_** it's only allowed to generate each number **once**.


5. Repeat _step 4._ for the number of **checksum** height.

## How to use it: 

Simply run the program, no user input required.

## List of exercises:

- [exercise1.md](exercise1.md)
- [exercise2.md](exercise2.md)
