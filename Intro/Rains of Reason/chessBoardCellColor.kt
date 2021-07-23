/*
Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.



For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.



Input/Output

[execution time limit] 3 seconds (kt)

[input] string cell1

Guaranteed constraints:
cell1.length = 2,
'A' ≤ cell1[0] ≤ 'H',
1 ≤ cell1[1] ≤ 8.

[input] string cell2

Guaranteed constraints:
cell2.length = 2,
'A' ≤ cell2[0] ≤ 'H',
1 ≤ cell2[1] ≤ 8.

[output] boolean

true if both cells have the same color, false otherwise.
 */
fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    val Character1 = cell1[0].toInt() % 2 == 0
    val num1 = cell1[1].toInt() % 2 == 0
    val character2 = cell2[0].toInt() % 2 == 0
    val num2 = cell2[1].toInt() % 2 == 0
    return (Character1 == num1  && character2 == num2
            || Character1 == num2  && num1  == character2
            || cell1.compareTo(cell2) == 0)
}
