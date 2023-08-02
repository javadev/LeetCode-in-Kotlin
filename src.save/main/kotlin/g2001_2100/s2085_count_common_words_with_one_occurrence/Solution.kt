package g2001_2100.s2085_count_common_words_with_one_occurrence

// #Easy #Array #String #Hash_Table #Counting
// #2023_06_27_Time_192_ms_(100.00%)_Space_37.6_MB_(88.89%)

class Solution {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        var count = 0
        val map = HashMap<String, Int>()
        val map1 = HashMap<String, Int>()
        // Putting the "words1" array in the map
        for (s in words1) {
            if (!map.containsKey(s)) {
                map[s] = 1
            } else {
                map[s] = map[s]!! + 1
            }
        }
        // Putting "words2" array in another map
        for (s in words2) {
            if (!map1.containsKey(s)) {
                map1[s] = 1
            } else {
                map1[s] = map1[s]!! + 1
            }
        }
        // traversing through the "words1" array
        for (s in words1) {
            // Checking if the key is present and is matching in both maps
            // and if the key has appeared just one time in "map1" map
            if (map[s] == map1[s] && map1[s] == 1) {
                count++
            }
        }
        return count
    }
}
