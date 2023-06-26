package g2201_2300.s2239_find_closest_number_to_zero

// #Easy #Array
class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var mini = Int.MAX_VALUE
        var closestNum = 0
        for (n in nums) {
            if (mini > Math.abs(n)) {
                mini = Math.abs(n)
                closestNum = n
            } else if (mini == Math.abs(n) && closestNum < n) {
                closestNum = n
            }
        }
        return closestNum
    }
}
