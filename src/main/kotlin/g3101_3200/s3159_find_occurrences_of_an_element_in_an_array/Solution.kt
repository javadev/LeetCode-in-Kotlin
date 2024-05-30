package g3101_3200.s3159_find_occurrences_of_an_element_in_an_array

// #Medium #Array #Hash_Table #2024_05_30_Time_810_ms_(98.28%)_Space_66.3_MB_(81.03%)

class Solution {
    fun occurrencesOfElement(nums: IntArray, queries: IntArray, x: Int): IntArray {
        val a = ArrayList<Int>()
        run {
            var i = 0
            val l = nums.size
            while (i < l) {
                if (nums[i] == x) {
                    a.add(i)
                }
                i++
            }
        }
        val l = queries.size
        val r = IntArray(l)
        for (i in 0 until l) {
            r[i] = if (queries[i] > a.size) -1 else a[queries[i] - 1]
        }
        return r
    }
}
