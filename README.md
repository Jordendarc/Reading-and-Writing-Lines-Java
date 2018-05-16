# Reading-and-Writing-Lines-Java
This program reads lines in from a file, stores those lines into an array, sorts it, and then writes the array to a file

The lines in the file have information seperated by "|" and the integer value of each line is located between the last two pipes.  Before simply sorting it by value, it makes sure the two values are in the same catagory.  The catagory is a string located between the first two pipes.

### Example of lines:  
Cat|2|Sue|Young|16|  
Cat|2|Sue|Young|14|  
Cat|2|Sue|Young|3|  
Cat|2|Sue|Young|5|  
Cat|2|Sue|Young|8|  
Dog|2|Sue|Young|16|  
Dog|2|Sue|Young|5|  
Dog|2|Sue|Young|3|  
### Example of Sorted Lines:  
Cat|2|Sue|Young|3|  
Cat|2|Sue|Young|5|  
Cat|2|Sue|Young|8|  
Cat|2|Sue|Young|14|  
Cat|2|Sue|Young|16|  
Dog|2|Sue|Young|3|  
Dog|2|Sue|Young|5|  
Dog|2|Sue|Young|16|  
