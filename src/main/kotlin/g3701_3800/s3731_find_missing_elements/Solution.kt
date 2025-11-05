package g3701_3800.s3731_find_missing_elements

// #Easy #Array #Hash_Table #Sorting #Weekly_Contest_474
// #2025_11_05_Time_2_ms_(100.00%)_Space_46.48_MB_(84.44%)

class Solution {
    fun findMissingElements(nums: IntArray): List<Int> {
        var maxi = 0
        var mini = 101
        val list: MutableList<Int> = ArrayList()
        val array = BooleanArray(101)
        for (num in nums) {
            array[num] = true
            if (maxi < num) {
                maxi = num
            }
            if (mini > num) {
                mini = num
            }
        }
        for (index in mini + 1..<maxi) {
            if (array[index]) {
                continue
            }
            list.add(index)
        }
        return list
    }
}
