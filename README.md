# Ascii Character Coordinates

* Attached is a file [cords.txt](src/resources/data/coords.txt). This file contains many lists with three values in each list.

* Example [28,14,64] index 0 is an X coordinate, index 1 is an Y coordinate, and index 2 is the integer representation of an ascii character.

* This program accepts 2 arguments `X` & `Y` coordinates. Upon execution, it will print the correct ascii character(s) at the specified x,y coordinates

* If not arguments are passed via command line, test simulation data will display
    * X:28, Y:14 prints `@` // first line in file
    * X:57, Y57 prints `,` // random line in file
    * X:34, Y17 prints `,` // last line in file
    * X:1000000, Y:100000 prints `X:1000000, Y:100000 coordinates not found` // coordinates out of bounds/not found

# Requirements

* [IntelliJ](https://www.jetbrains.com/idea/download/)
* Java [JDK](https://www.oracle.com/java/technologies/downloads/)
* [Terminal](https://iterm2.com/)

# How to Run

* Open command line application
* CD into project
* run the following command ` java -classpath [project-path]/Cords/out/production/Cords com.example.cords.Cords [X coordinate] [Y coordinate]`
  * for example `java -classpath [project-path]/Cords/out/production/Cords com.example.cords.Cords 28 14`





