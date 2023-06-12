package g1501_1600.s1526_minimum_number_of_increments_on_subarrays_to_form_a_target_array

// #Hard #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack
// #2023_06_12_Time_466_ms_(100.00%)_Space_51.6_MB_(100.00%)

class Solution {
    fun minNumberOperations(target: IntArray): Int {
        var operations = target[0]
        for (i in 1 until target.size) {
            if (target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1]
            }
        }
        return operations
    }
}
