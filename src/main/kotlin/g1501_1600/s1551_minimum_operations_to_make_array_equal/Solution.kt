package g1501_1600.s1551_minimum_operations_to_make_array_equal

// #Medium #Math #2023_06_14_Time_119_ms_(100.00%)_Space_33.2_MB_(80.00%)

class Solution {
    fun minOperations(n: Int) = (n - (n % 2)) * (n + (n % 2)) / 4
}
