/*
Given an array of equal-length strings, you'd like to know if it's possible to rearrange
 the order of the elements in such a way that each consecutive pair of strings differ by exactly one character.
  Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character
 (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

Input/Output

[execution time limit] 3 seconds (kt)

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings
 differ by exactly one character (false otherwise).
 */
fun stringsRearrangement(inputArray: MutableList<String>): Boolean {
    var source = inputArray
    var destination = mutableListOf<String>()
    destination.add(source[0])
    source.removeAt(0)
    var w = 0
    var x = false
    var y = false
    while (!source.isEmpty()) {
        source.sort()
        for (i in source.indices) {
            if (isDiffByOne(destination[w],source[i])) {
                destination.add(source[i])
                source.removeAt(i)
                w++
                y= true
                break
            }


        }
        if (!y && x) return false
        else if (!y && !x) {
            destination.reverse()
            x = true
        }
        y = false
    }

    println(destination)

    return true
}

fun isDiffByOne(st1: String, st2: String) : Boolean {
    var R = 0
    for (i in st1.indices) {
        if (st1[i] != st2[i])
            if (R == 1) return false else R++
    }
    if (R == 0) return false else return true
}
