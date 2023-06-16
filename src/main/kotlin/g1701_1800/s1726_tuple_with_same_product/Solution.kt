package g1701_1800.s1726_tuple_with_same_product

// #Medium #Array #Hash_Table
class Solution {
    fun tupleSameProduct(nums: IntArray): Int {
        val ab = HashMap<Int, Int>()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                ab[nums.get(i) * nums.get(j)] = ab.getOrDefault(nums.get(i) * nums.get(j), 0) + 1
            }
        }
        var count = 0
        for (entry: Map.Entry<Int, Int> in ab.entries) {
            val `val`: Int = entry.value
            count += `val` * (`val` - 1) / 2
        }
        return count * 8
    }
}
