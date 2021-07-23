/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
Input/Output

[execution time limit] 3 seconds (kt)

[input] array.integer inputArray

Array of positive integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
1 ≤ inputArray[i] ≤ 1000.

[input] integer k

An integer (not greater than the length of inputArray).

Guaranteed constraints:
1 ≤ k ≤ inputArray.length.

[output] integer

The maximal possible sum.
 */
fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int {
    var max = 0
    for (j in k-1 downTo 0) {
        max += inputArray[j]
    }

    var previousSum = max
    for ( i in k until inputArray.size) {
        var sum = 0
        sum = previousSum + inputArray[i] - inputArray[i-k]

        max = if (max < sum) sum else max
        previousSum = sum
    }
    return max
}
