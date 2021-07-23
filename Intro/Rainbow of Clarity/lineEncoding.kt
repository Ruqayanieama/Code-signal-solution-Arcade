/*
Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings
 consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length
and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
Example

For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".

Input/Output

[execution time limit] 3 seconds (kt)

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.
 */
fun lineEncoding(s: String): String {
    var x = StringBuilder()
    var y = 1
    for(i in 1..s.lastIndex){
        if(s[i] != s[i-1]){
            x.append(if (y != 1){y.toString() + s[i-1]} else s[i-1])
            y = 1
        }
        else y++
    }
    x.append(if(y != 1){y.toString() + s[s.lastIndex]} else s[s.lastIndex])
    return x.toString()
}
