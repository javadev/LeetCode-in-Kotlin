package g2101_2200.s2135_count_words_obtained_after_adding_a_letter

// #Medium #Array #String #Hash_Table #Sorting #Bit_Manipulation
@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var set: MutableSet<Int>

    private fun preprocess(words: Array<String>) {
        set = HashSet()
        for (word in words) {
            val bitMap = getBitMap(word)
            set.add(bitMap)
        }
    }

    private fun matches(bitMap: Int): Boolean {
        return set.contains(bitMap)
    }

    private fun getBitMap(word: String): Int {
        var result = 0
        for (element in word) {
            val position = element.code - 'a'.code
            result = result or (1 shl position)
        }
        return result
    }

    private fun addBit(bitMap: Int, c: Char): Int {
        var bitMap = bitMap
        val position = c.code - 'a'.code
        bitMap = bitMap or (1 shl position)
        return bitMap
    }

    private fun removeBit(bitMap: Int, c: Char): Int {
        var bitMap = bitMap
        val position = c.code - 'a'.code
        bitMap = bitMap and (1 shl position).inv()
        return bitMap
    }

    fun wordCount(startWords: Array<String>, targetWords: Array<String>): Int {
        if (startWords.isEmpty()) {
            return 0
        }
        if (targetWords.isEmpty()) {
            return 0
        }
        preprocess(startWords)
        var count = 0
        for (word in targetWords) {
            var bitMap = getBitMap(word)
            for (i in word.indices) {
                bitMap = removeBit(bitMap, word[i])
                if (i > 0) {
                    bitMap = addBit(bitMap, word[i - 1])
                }
                if (matches(bitMap)) {
                    count++
                    break
                }
            }
        }
        return count
    }
}
