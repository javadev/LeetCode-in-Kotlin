package g1301_1400.s1356_sort_integers_by_the_number_of_1_bits

// #Easy #Array #Sorting #Bit_Manipulation #Counting
// #Programming_Skills_I_Day_11_Containers_and_Libraries
class Solution {
    fun sortByBits(arr: IntArray): IntArray {
        val map: MutableMap<Int, MutableList<Int>> = HashMap()
        for (num in arr) {
            val count = Integer.bitCount(num)
            map.putIfAbsent(count, ArrayList())
            map[count]!!.add(num)
        }
        val result = IntArray(arr.size)
        var i = 0
        for ((_, list) in map) {
            list.sort()
            for (num in list) {
                result[i++] = num
            }
        }
        return result
    }
}
