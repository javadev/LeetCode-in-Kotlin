package g1801_1900.s1865_finding_pairs_with_a_certain_sum

// #Medium #Array #Hash_Table #Design #2023_06_22_Time_1050_ms_(100.00%)_Space_93.9_MB_(50.00%)

class FindSumPairs(private val nums1: IntArray, private val nums2: IntArray) {
    private val numFreq: MutableMap<Int, Int> = HashMap()

    init {
        for (num in nums2) {
            numFreq[num] = numFreq.getOrDefault(num, 0) + 1
        }
    }

    fun add(index: Int, `val`: Int) {
        numFreq[nums2[index]] = numFreq.getOrDefault(nums2[index], 0) - 1
        nums2[index] += `val`
        numFreq[nums2[index]] = numFreq.getOrDefault(nums2[index], 0) + 1
    }

    fun count(tot: Int): Int {
        var res = 0
        for (num in nums1) {
            res += numFreq.getOrDefault(tot - num, 0)
        }
        return res
    }
}
/*
 * Your FindSumPairs object will be instantiated and called as such:
 * var obj = FindSumPairs(nums1, nums2)
 * obj.add(index,`val`)
 * var param_2 = obj.count(tot)
 */
