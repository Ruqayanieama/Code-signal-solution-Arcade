/*
Given an integer product, find the smallest positive (i.e. greater than 0)
 integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
digitsProduct(product) = 26;
For product = 19, the output should be
digitsProduct(product) = -1.
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer
 */
fun digitsProduct(product: Int): Int {
    if (product == 0) {
        return 10
    }
    for (i in Math.sqrt(product.toDouble()).toInt()..product * product) {
        if (i.toString().map { it.toInt() - '0'.toInt() }.reduce { acc, next -> acc*next  } == product) {
            return i
        }
    }
    return -1
}
