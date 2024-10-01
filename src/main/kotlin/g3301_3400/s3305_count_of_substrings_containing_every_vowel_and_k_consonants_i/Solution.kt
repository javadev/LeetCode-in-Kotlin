package g3301_3400.s3305_count_of_substrings_containing_every_vowel_and_k_consonants_i

// #Medium #String #Hash_Table #Sliding_Window
// #2024_10_01_Time_153_ms_(100.00%)_Space_35.1_MB_(100.00%)

class Solution {
    fun countOfSubstrings(word: String, k: Int): Int {
        val arr = word.toCharArray()
        val map = IntArray(26)
        map[0]++
        map['e'.code - 'a'.code]++
        map['i'.code - 'a'.code]++
        map['o'.code - 'a'.code]++
        map['u'.code - 'a'.code]++
        var need = 5
        var ans = 0
        var consCnt = 0
        var j = 0
        for (i in arr.indices) {
            while (j < arr.size && (need > 0 || consCnt < k)) {
                if (isVowel(arr[j])) {
                    map[arr[j].code - 'a'.code]--
                    if (map[arr[j].code - 'a'.code] == 0) {
                        need--
                    }
                } else {
                    consCnt++
                }
                j++
            }
            if (need == 0 && consCnt == k) {
                ans++
                var m = j
                while (m < arr.size) {
                    if (isVowel(arr[m])) {
                        ans++
                    } else {
                        break
                    }
                    m++
                }
            }
            if (isVowel(arr[i])) {
                map[arr[i].code - 'a'.code]++
                if (map[arr[i].code - 'a'.code] == 1) {
                    need++
                }
            } else {
                consCnt--
            }
        }
        return ans
    }

    private fun isVowel(ch: Char): Boolean {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
    }
}
