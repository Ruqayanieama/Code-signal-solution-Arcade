/*
A media access control address (MAC address) is a unique identifier assigned to network
interfaces for communications on the physical network segment.

The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is
six groups of two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.

Example

For inputString = "00-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = true;
For inputString = "Z1-1B-63-84-45-E6", the output should be
isMAC48Address(inputString) = false;
For inputString = "not a MAC-48 address", the output should be
isMAC48Address(inputString) = false.
Input/Output

[execution time limit] 3 seconds (kt)

[input] string inputString

Guaranteed constraints:
15 ≤ inputString.length ≤ 20.

[output] boolean

true if inputString corresponds to MAC-48 address naming rules, false otherwise.
 */
fun isMAC48Address(inputString: String): Boolean {
    if (inputString[0] == '-' || inputString[inputString.length - 1] == '-') {
        return false
    }
    val inputStrings = inputString.split("-".toRegex()).toTypedArray()
    return try {
        Arrays.stream(inputStrings).forEach { group: String ->
            group.toInt(16)
        }
        inputStrings.size == 6 && Arrays.stream(inputStrings)
            .allMatch { group: String -> group.length == 2 }
    } catch (e: NumberFormatException) {
        false
    }
}
