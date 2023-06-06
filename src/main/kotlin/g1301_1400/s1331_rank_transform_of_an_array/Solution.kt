package g1301_1400.s1331_rank_transform_of_an_array

// #Easy #Array #Hash_Table #Sorting #2023_06_06_Time_553_ms_(100.00%)_Space_56.3_MB_(54.55%)

class Solution {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val tmp = arr.copyOf(arr.size)
        tmp.sort()
        val mp = HashMap<Int, Int>()
        var i = 1
        for (x in tmp) {
            if (!mp.containsKey(x)) {
                mp[x] = i++
            }
        }
        i = 0
        for (x in arr) {
            arr[i++] = mp[x]!!
        }
        return arr
    }
}
