/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (kt)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
 */

fun commonCharacterCount(s1: String, s2: String): Int {
    var common = 0
    var x = s2
    for (y in s1.toCharArray())
    {
        for (i in 0 until x.length)
        {
            if (y == x[i])
            {
                ++common
                x = x.removeRange(i, i+1)
                break
            }
        }
    }
    return common
}
