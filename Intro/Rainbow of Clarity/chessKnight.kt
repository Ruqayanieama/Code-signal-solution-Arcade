/*
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically,
 or two squares vertically and one square horizontally away from it.
  The complete move therefore looks like the letter L. Check out the image below to see all valid moves
   for a knight piece that is placed on one of the central squares.



Example

For cell = "a1", the output should be
chessKnight(cell) = 2.



For cell = "c2", the output should be
chessKnight(cell) = 6.



Input/Output

[execution time limit] 3 seconds (kt)

[input] string cell

String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

Guaranteed constraints:
cell.length = 2,
'a' ≤ cell[0] ≤ 'h',
1 ≤ cell[1] ≤ 8.

[output] integer
 */
fun chessKnight(cell: String): Int {
    val x = cell[0] - 'a'
    val y = cell[1] - '1'
    var count = 0
    for (i in (x-2)..(x+2)) {
        for (j in (y-2)..(y+2)) {
            if (i < 0 || j < 0 || i > 7 || j > 7)
                continue

            val xDiff = i - x
            val yDiff = j - y
            if ((xDiff*xDiff + yDiff*yDiff) == 5)
                count++
        }
    }

    return count
}
