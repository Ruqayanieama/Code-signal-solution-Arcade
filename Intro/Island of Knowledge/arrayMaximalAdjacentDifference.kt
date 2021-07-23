/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (kt)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.
 */
fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var max = 0
    for (i in 0 until inputArray.size -1) {
        val x = Math.abs(inputArray[i] - inputArray[i + 1])
        if (x > max) {
            max = x
        }
    }
    return max
}
