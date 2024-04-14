package g1701_1800.s1713_minimum_operations_to_make_a_subsequence

// #Hard #Array #Hash_Table #Greedy #Binary_Search
// #2023_06_16_Time_862_ms_(100.00%)_Space_67.3_MB_(100.00%)

class Solution {
    fun minOperations(target: IntArray, arr: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in target.indices) {
            map[target[i]] = i
        }
        val list: MutableList<Int?> = ArrayList()
        for (num in arr) {
            if (map.containsKey(num)) {
                list.add(map[num])
            }
        }
        return target.size - longestIncreasingSubsequence(list)
    }

    private fun longestIncreasingSubsequence(list: List<Int?>): Int {
        val n = list.size
        var l = 0
        val arr = IntArray(n)
        for (num in list) {
            var index = arr.binarySearch(0, l, num!!)
            if (index < 0) {
                index = index.inv()
            }
            arr[index] = num
            if (index == l) {
                l++
            }
        }
        return l
    }
}
