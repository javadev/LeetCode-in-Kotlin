package g1301_1400.s1338_reduce_array_size_to_the_half

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue
class Solution {
    fun minSetSize(arr: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        for (num in arr) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        val freq: MutableList<Int> = ArrayList(map.values)
        freq.sortWith(reverseOrder())
        var i = 0
        var count = 0
        var totalLength = arr.size
        while (totalLength > arr.size / 2) {
            totalLength -= freq[i]
            count++
            i++
        }
        return count
    }
}
