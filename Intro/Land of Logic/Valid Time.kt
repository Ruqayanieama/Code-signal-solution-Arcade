/*
Check if the given string is a correct time representation of the 24-hour clock.

Example

For time = "13:58", the output should be
validTime(time) = true;
For time = "25:51", the output should be
validTime(time) = false;
For time = "02:76", the output should be
validTime(time) = false.
Input/Output

[execution time limit] 3 seconds (kt)

[input] string time

A string representing time in HH:MM format. It is guaranteed that the first two characters,
 as well as the last two characters, are digits.

[output] boolean

true if the given representation is correct, false otherwise.
 */
fun validTime(time: String): Boolean = (time.substring(0..1).toInt() in 0..23) && (time.substring(3..4).toInt() in 0..59)
