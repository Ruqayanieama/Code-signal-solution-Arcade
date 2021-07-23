/*
In the popular Minesweeper game you have a board with some mines and those cells
 that don't contain a mine have a number in it that indicates the total number
  of mines in the neighboring cells. Starting off with some arrangement of mines we want
   to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (kt)

[input] array.array.boolean matrix

A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine,
 false otherwise.

Guaranteed constraints:
2 ≤ matrix.length ≤ 100,
2 ≤ matrix[0].length ≤ 100.

[output] array.array.integer

Rectangular matrix of the same size as matrix each cell of which contains an integer
equal to the number of mines in the neighboring cells. Two cells are called neighboring
 if they share at least one corner.
 */
fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    var mine : MutableList<MutableList<Int>> = mutableListOf(mutableListOf())
    mine.removeAt(0)

    for(i in 0 .. matrix.size - 1){
        var mine2:MutableList<Int> = mutableListOf()
        for(j in 0 .. matrix[0].size - 1){
            var sum = 0
            if(i - 1>=0 && j - 1>=0){
                if(matrix[i-1][j-1]){sum ++}
            }
            if(i -1 >=0){
                if(matrix[i-1][j]){sum++}
            }
            if(i-1 >=0 && j+1<matrix[0].size){
                if(matrix[i-1][j+1]){sum++}
            }

            if(j - 1>=0){
                if(matrix[i][j-1]){sum ++}
            }
            if( j+1<matrix[0].size){
                if(matrix[i][j+1]){sum++}
            }

            if(i + 1<matrix.size && j - 1>=0){
                if(matrix[i+1][j-1]){sum ++}
            }
            if(i +1 <matrix.size){
                if(matrix[i+1][j]){sum++}
            }
            if(i+1 <matrix.size && j+1<matrix[0].size){
                if(matrix[i+1][j+1]){sum++}
            }
            mine2.add(sum)
        }
        mine.add(mine2)
    }

    return mine
}
