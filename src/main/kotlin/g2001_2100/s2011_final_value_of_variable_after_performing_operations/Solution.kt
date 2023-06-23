package g2001_2100.s2011_final_value_of_variable_after_performing_operations

// #Easy #Array #String #Simulation #2023_06_23_Time_178_ms_(44.55%)_Space_37.3_MB_(66.34%)

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
