/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (kt)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 */
fun palindromeRearranging(inputString: String): Boolean {
    val w = IntArray(inputString.length)
    var x = 0
    var y = 0
    val list = ArrayList<Char>()
    for (i in 0 until inputString.length) {
        list.add(inputString.toCharArray().get(i))
        if (list.contains(inputString.toCharArray().get(i))) {
            w[inputString.indexOf(inputString.toCharArray().get(i))]++
        }
    }
    for (i in w.indices) {
        if (w[i] % 2 == 1 && w[i] != 0) {
            x++
        } else if (w[i] % 2 == 0 && w[i] != 0) {
            y++
        }
    }
    println(Arrays.toString(w))
    println(x)
    println(y)
    return if (x > 1 && x > y) false else true
}
