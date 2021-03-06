/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
Input/Output

[execution time limit] 3 seconds (kt)

[input] string inputString

A string consisting of lowercase English letters and the characters ( and ).
 It is guaranteed that all parentheses in inputString form a regular bracket sequence.

Guaranteed constraints:
0 ≤ inputString.length ≤ 50.

[output] string

Return inputString, with all the characters that were in parentheses reversed.
 */
fun reverseInParentheses(inputString: String):String {
    val listOfCharactar = inputString.toCharArray().toMutableList()
    while (listOfCharactar.contains('(')){
        val  endBracket = listOfCharactar.indexOf(')')
        var i = endBracket -1
        val j = mutableListOf<Char>()
        while (listOfCharactar[i] != '('){
            j.add(listOfCharactar[i])
            i--
        }
        val startBracket = i
        var w = 0
        while (w <= endBracket-startBracket){
            listOfCharactar.removeAt(startBracket)
            w++
        }
        listOfCharactar.addAll(startBracket, j)
    }
    return String(listOfCharactar.toCharArray())
}
