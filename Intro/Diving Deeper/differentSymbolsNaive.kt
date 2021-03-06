/*
Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 3 seconds (kt)

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.

[output] integer
 */
fun differentSymbolsNaive(s: String): Int {
    var dist = s[0].toString()
    for (i in 1 until s.length) {
        if (dist.indexOf(s[i]) == -1) {
            dist += s[i]
        }
    }
    return dist.length
}
