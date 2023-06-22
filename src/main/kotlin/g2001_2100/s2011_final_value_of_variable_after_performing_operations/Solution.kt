package g2001_2100.s2011_final_value_of_variable_after_performing_operations

// #Easy #Array #String #Simulation
class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var xValue = 0
        for (word in operations) {
            if (word.contains("+")) {
                xValue++
            } else {
                xValue--
            }
        }
        return xValue
    }
}
