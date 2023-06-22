# Requirements

Attached is a file [cords.txt](src/resources/data/coords.txt). This file contains many lists with three values in each list. 

* Example [28,14,64] index 0 is an X coordinate, index 1 is an Y coordinate, and index 2 is the integer representation of an ascii character.

Within this repo is a program that will print the correct ascii character(s) at the specified x,y coordinates from the arrays

* X:28, Y:14 prints `@`
* X:57, Y57 prints `,`
* X:34, Y17 prints `,`
* X:1000000, Y:100000 prints `X:1000000, Y:100000 coordinates not found`
