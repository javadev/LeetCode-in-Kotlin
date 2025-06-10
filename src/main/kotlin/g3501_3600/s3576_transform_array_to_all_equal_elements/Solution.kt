package g3501_3600.s3576_transform_array_to_all_equal_elements

// #Medium #Array #Greedy #2025_06_10_Time_11_ms_(92.31%)_Space_84.38_MB_(15.38%)

class Solution {
    fun canMakeEqual(nums: IntArray, k: Int): Boolean {
        val n = nums.size
        if (n == 1) {
            return true
        }
        var prod = 1
        for (x in nums) {
            prod *= x
        }
        val targets: MutableList<Int> = ArrayList<Int>()
        for (target in intArrayOf(1, -1)) {
            val tPowN = (if (n % 2 == 0) 1 else target)
            if (tPowN == prod) {
                targets.add(target)
            }
        }
        if (targets.isEmpty()) {
            return false
        }
        for (target in targets) {
            var ops = 0
            val a = nums.clone()
            var i = 0
            while (i < n - 1 && ops <= k) {
                if (a[i] != target) {
                    a[i] = -a[i]
                    a[i + 1] = -a[i + 1]
                    ops++
                }
                i++
            }
            if (ops <= k && a[n - 1] == target) {
                return true
            }
        }
        return false
    }
}
