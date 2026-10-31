package g3801_3900.s3843_first_element_with_unique_frequency

// #Medium #Array #Hash_Table #Counting #Senior #Weekly_Contest_489
// #2026_07_22_Time_96_ms_(93.48%)_Space_213.96_MB_(84.60%)

class Solution {
    fun firstUniqueFreq(nums: IntArray): Int {
        val c1: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        for (a in nums) {
            c1.put(a, c1.getOrDefault(a, 0)!! + 1)
        }
        val c2: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        for (f in c1.values) {
            c2.put(f, c2.getOrDefault(f, 0)!! + 1)
        }
        for (a in nums) {
            if (c2.get(c1.get(a)) == 1) {
                return a
            }
        }
        return -1
    }
}
