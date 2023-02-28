package g0601_0700.s0676_implement_magic_dictionary

// #Medium #String #Hash_Table #Design #Trie
// #2023_02_15_Time_256_ms_(100.00%)_Space_37.7_MB_(100.00%)

class MagicDictionary {
    private var dictionaryWords: Array<String>? = null
    fun buildDict(dictionary: Array<String>?) {
        dictionaryWords = dictionary
    }

    fun search(searchWord: String): Boolean {
        for (word in dictionaryWords!!) {
            if (isOffByOneLetter(word, searchWord)) {
                return true
            }
        }
        return false
    }

    private fun isOffByOneLetter(word: String, searchWord: String): Boolean {
        if (isDifferentLengths(word, searchWord) || word == searchWord) {
            return false
        }
        var numDifferentLetters = 0
        for (i in word.indices) {
            if (isNotTheSameLetter(word[i], searchWord[i])) {
                numDifferentLetters++
            }
            if (numDifferentLetters > 1) {
                return false
            }
        }
        return numDifferentLetters == 1
    }

    private fun isDifferentLengths(word: String, searchWord: String): Boolean {
        return word.length != searchWord.length
    }

    private fun isNotTheSameLetter(c1: Char, c2: Char): Boolean {
        return c1 != c2
    }
}

/*
 * Your MagicDictionary object will be instantiated and called as such:
 * var obj = MagicDictionary()
 * obj.buildDict(dictionary)
 * var param_2 = obj.search(searchWord)
 */
