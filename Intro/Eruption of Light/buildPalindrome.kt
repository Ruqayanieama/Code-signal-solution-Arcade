/*
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".

Input/Output

[execution time limit] 3 seconds (kt)

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string
 */
fun String.reverse() : String {
    val x = toCharArray()
    x.reverse()
    return x.joinToString("")
}

fun buildPalindrome(s: String): String {
    val y = s.length - 1
    for (index in 0..y) {
        var j = StringBuilder(s)
        for (i in (index-1) downTo 0) {
            j.append(s[i])
        }
        val c = j.toString()
        if (c == c.reverse()) {
            return c
        }
    }
    return ""
}