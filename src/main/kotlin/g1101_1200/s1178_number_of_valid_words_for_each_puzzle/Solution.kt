package g1101_1200.s1178_number_of_valid_words_for_each_puzzle

// #Hard #Array #String #Hash_Table #Bit_Manipulation #Trie
// #2023_05_25_Time_675_ms_(100.00%)_Space_121.2_MB_(100.00%)

class Solution {
    fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        val map = HashMap<Int, Int>()
        for (word in words) {
            val wordmask = createMask(word)
            if (map.containsKey(wordmask)) {
                val oldfreq = map.getValue(wordmask)
                val newfreq = oldfreq + 1
                map[wordmask] = newfreq
            } else {
                map[wordmask] = 1
            }
        }
        for (puzzle in puzzles) {
            val puzzlemask = createMask(puzzle)
            val firstChar = puzzle[0]
            val first = 1 shl firstChar.code - 'a'.code
            var sub = puzzlemask
            var count = 0
            while (sub != 0) {
                val firstCharPresent = sub and first == first
                val wordvalid = map.containsKey(sub)
                if (firstCharPresent && wordvalid) {
                    count += map.getValue(sub)
                }
                sub = sub - 1 and puzzlemask
            }
            ans.add(count)
        }
        return ans
    }

    private fun createMask(str: String): Int {
        var mask = 0
        for (i in 0 until str.length) {
            val bit = str[i].code - 'a'.code
            mask = mask or (1 shl bit)
        }
        return mask
    }
}
