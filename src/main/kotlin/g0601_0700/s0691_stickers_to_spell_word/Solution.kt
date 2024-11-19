package g0601_0700.s0691_stickers_to_spell_word

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2023_02_20_Time_249_ms_(100.00%)_Space_42.6_MB_(100.00%)

class Solution {
    // count the characters of every sticker
    private lateinit var counts: Array<IntArray>

    // For each character, save the sticker index which has this character
    private val map: HashMap<Char, HashSet<Int>> = HashMap()
    private val cache: HashMap<Int, Int> = HashMap()
    fun minStickers(stickers: Array<String>, target: String): Int {
        counts = Array(stickers.size) { IntArray(26) }
        for (i in 0..25) {
            map[('a'.code + i).toChar()] = HashSet()
        }
        for (i in stickers.indices) {
            for (c in stickers[i].toCharArray()) {
                counts[i][c.code - 'a'.code]++
                map[c]!!.add(i)
            }
        }
        val res = dp(0, target)
        return if (res > target.length) {
            -1
        } else {
            res
        }
    }

    private fun dp(bits: Int, target: String): Int {
        val len = target.length
        if (bits == (1 shl len) - 1) {
            // all bits are 1
            return 0
        }
        if (cache.containsKey(bits)) {
            return cache[bits]!!
        }
        var index = 0
        // find the first bit which is 0
        for (i in 0 until len) {
            if (bits and (1 shl i) == 0) {
                index = i
                break
            }
        }
        // In worst case, each character use 1 sticker. So, len + 1 means impossible
        var res = len + 1
        for (key in map[target[index]]!!) {
            val count = counts[key].clone()
            var mask = bits
            for (i in index until len) {
                if (mask and (1 shl i) != 0) {
                    // this bit has already been 1
                    continue
                }
                val c = target[i]
                if (count[c.code - 'a'.code] > 0) {
                    count[c.code - 'a'.code]--
                    mask = mask or (1 shl i)
                }
            }
            val `val` = dp(mask, target) + 1
            res = res.coerceAtMost(`val`)
        }
        cache[bits] = res
        return res
    }
}
