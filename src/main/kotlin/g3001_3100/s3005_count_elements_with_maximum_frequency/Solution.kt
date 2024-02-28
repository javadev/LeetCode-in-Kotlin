package g3001_3100.s3005_count_elements_with_maximum_frequency

// #Easy #Array #Hash_Table #Counting #2024_02_28_Time_168_ms_(80.00%)_Space_34.8_MB_(99.09%)

class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        if (nums.size == 1) {
            return 1
        }
        val list: MutableList<Int> = ArrayList()
        var co = 0
        var prev = 0
        for (num in nums) {
            if (list.contains(num)) {
                continue
            }
            list.add(num)
            if (list.size == nums.size) {
                break
            }
            var c = 0
            for (i in nums) {
                if (num == i) {
                    c++
                }
            }
            if (c > 1) {
                if (c > prev) {
                    co = c
                    prev = c
                } else if (c == prev) {
                    co += c
                }
            }
        }
        if (co == 0) {
            return nums.size
        }
        return co
    }
}
