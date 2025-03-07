package g3301_3400.s3366_minimum_array_sum

// #Medium #Array #Dynamic_Programming #2024_12_03_Time_15_ms_(100.00%)_Space_39.5_MB_(92.86%)

class Solution {
    fun minArraySum(nums: IntArray, k: Int, op1: Int, op2: Int): Int {
        var op1 = op1
        var op2 = op2
        nums.sort()
        val high = lowerBound(nums, k * 2 - 1)
        val low = lowerBound(nums, k)
        val n = nums.size
        for (i in n - 1 downTo high) {
            if (op1 > 0) {
                nums[i] = (nums[i] + 1) / 2
                op1--
            }
            if (op2 > 0) {
                nums[i] -= k
                op2--
            }
        }
        val count: MutableMap<Int, Int> = HashMap<Int, Int>()
        var odd = 0
        for (i in low..<high) {
            if (op2 > 0) {
                nums[i] -= k
                if (k % 2 > 0 && nums[i] % 2 > 0) {
                    count.merge(nums[i], 1) { a: Int, b: Int -> Integer.sum(a, b) }
                }
                op2--
            } else {
                odd += nums[i] % 2
            }
        }
        nums.sort(0, high)
        var ans = 0
        if (k % 2 > 0) {
            var i = high - op1
            while (i < high && odd > 0) {
                val x = nums[i]
                if (count.containsKey(x)) {
                    if (count.merge(x, -1) { a: Int, b: Int ->
                            Integer.sum(a, b)
                        } == 0
                    ) {
                        count.remove(x)
                    }
                    odd--
                    ans--
                }
                i++
            }
        }
        var i = high - 1
        while (i >= 0 && op1 > 0) {
            nums[i] = (nums[i] + 1) / 2
            i--
            op1--
        }
        for (x in nums) {
            ans += x
        }
        return ans
    }

    private fun lowerBound(nums: IntArray, target: Int): Int {
        var left = -1
        var right = nums.size
        while (left + 1 < right) {
            val mid = (left + right) ushr 1
            if (nums[mid] >= target) {
                right = mid
            } else {
                left = mid
            }
        }
        return right
    }
}
