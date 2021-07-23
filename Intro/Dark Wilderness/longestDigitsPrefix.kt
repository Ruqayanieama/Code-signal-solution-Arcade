/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".

Input/Output

[execution time limit] 3 seconds (kt)

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.

[output] string
 */
fun longestDigitsPrefix(inputString: String): String {
    var TheString = ""

    inputString.toCharArray().forEach {
        if (it.isDigit())
            TheString += it
        else
            return TheString

    }

    return TheString
}
