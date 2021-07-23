/*
Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".

Input/Output

[execution time limit] 3 seconds (kt)

[input] string text

Guaranteed constraints:
4 ≤ text.length ≤ 50.

[output] string

The longest word from text. It's guaranteed that there is a unique output.
 */
fun longestWord(text: String): String {
    return text.split("""[^a-zA-Z]""".toRegex()).maxBy { it.length }?:""

}
