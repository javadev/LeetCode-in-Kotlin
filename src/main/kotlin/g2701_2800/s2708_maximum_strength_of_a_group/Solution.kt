package g2701_2800.s2708_maximum_strength_of_a_group

// #Medium #Array #Sorting #Greedy #Backtracking
// #2023_07_31_Time_183_ms_(100.00%)_Space_36.9_MB_(90.91%)

class Solution {
    fun maxStrength(nums: IntArray): Long {
        val filtered = mutableListOf<Int>()
        var product = 1L
        var hasZero = false
        for (num in nums) {
            if (num == 0) {
                hasZero = true
                continue
            }
            filtered.add(num)
            product *= num.toLong()
        }
        if (filtered.size == 0) return 0
        if (filtered.size == 1 && filtered.get(0) <= 0) return if (hasZero) 0 else filtered.get(0).toLong()
        var result = product
        for (num in nums) {
            if (num == 0) continue
            result = result.coerceAtLeast(product / num.toLong())
        }
        return result
    }
}
