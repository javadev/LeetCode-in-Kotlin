package g2301_2400.s2344_minimum_deletions_to_make_array_divisible

// #Hard #Array #Math #Sorting #Heap_Priority_Queue #Number_Theory
@Suppress("NAME_SHADOWING")
class Solution {
    fun minOperations(nums: IntArray, numsDivide: IntArray): Int {
        var g = numsDivide[0]
        for (i in numsDivide) {
            g = gcd(g, i)
        }
        var minOp = 0
        var smallest = Int.MAX_VALUE
        for (num in nums) {
            if (g % num == 0) {
                smallest = Math.min(smallest, num)
            }
        }
        for (num in nums) {
            if (num < smallest) {
                ++minOp
            }
        }
        return if (smallest == Int.MAX_VALUE) -1 else minOp
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b > 0) {
            val tmp = a
            a = b
            b = tmp % b
        }
        return a
    }
}
