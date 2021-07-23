/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (kt)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
 */
fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var x = mutableListOf(0)
    val w = mutableListOf("")
    w.remove("")
    for (i in 0 until inputArray.size ) {
        x.add(inputArray[i].length)
    }
    val y = x.max()
    for (j in 0 until inputArray.size ) {
        if (inputArray[j].length == y)

            w.add(inputArray[j])

    }
    return w
}
