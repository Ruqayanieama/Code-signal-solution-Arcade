/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[execution time limit] 3 seconds (kt)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
 */
fun addBorder(picture: MutableList<String>): MutableList<String> {
    var asterisks = ""
    val X: MutableList<String> = ArrayList()
    val lengthOfPicture = picture[0].length
    for (i in 0 until lengthOfPicture + 2) {
        asterisks = "$asterisks*"
    }
    for (i in picture.indices) {
        picture[i] = "*" + picture[i] + "*"
    }
    X.add(asterisks)
    for (i in picture.indices) {
        X.add(picture[i])
    }
    X.add(asterisks)
    return X
}
