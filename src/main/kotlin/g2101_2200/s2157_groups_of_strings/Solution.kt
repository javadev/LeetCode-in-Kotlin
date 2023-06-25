package g2101_2200.s2157_groups_of_strings

// #Hard #String #Bit_Manipulation #Union_Find
class Solution {
    fun groupStrings(words: Array<String>): IntArray {
        val map = HashMap<Int, Int>()
        for (word in words) {
            var bitmask = 0
            for (ch in word.toCharArray()) {
                bitmask = bitmask or (1 shl ch.code - 'a'.code)
            }
            map[bitmask] = map.getOrDefault(bitmask, 0) + 1
        }
        val keyset: MutableList<Int> = ArrayList()
        for (key in map.keys) {
            keyset.add(key)
        }
        var totalGroups = 0
        var maxSize = 0
        for (key in keyset) {
            if (!map.containsKey(key)) {
                continue
            }
            totalGroups++
            val size = dfs(key, map)
            maxSize = Math.max(size, maxSize)
        }
        return intArrayOf(totalGroups, maxSize)
    }

    private fun dfs(key: Int, map: HashMap<Int, Int>): Int {
        if (!map.containsKey(key)) {
            return 0
        }
        var size = map[key]!!
        map.remove(key)
        for (i in 0..25) {
            size += dfs(key xor (1 shl i), map)
        }
        for (i in 0..25) {
            if (key and (1 shl i) > 0) {
                for (j in 0..25) {
                    if (key and (1 shl j) == 0) {
                        size += dfs(key xor (1 shl i) xor (1 shl j), map)
                    }
                }
            }
        }
        return size
    }
}
