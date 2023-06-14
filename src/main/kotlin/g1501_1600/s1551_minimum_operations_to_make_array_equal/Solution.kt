package g1501_1600.s1551_minimum_operations_to_make_array_equal

class Solution {
    fun minOperations(n: Int) = (n - (n % 2)) * (n + (n % 2)) / 4
}
