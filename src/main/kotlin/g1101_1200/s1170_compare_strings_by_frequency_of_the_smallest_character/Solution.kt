package g1101_1200.s1170_compare_strings_by_frequency_of_the_smallest_character

// #Medium #Array #String #Hash_Table #Sorting #Binary_Search

class Solution {
    fun numSmallerByFrequency(queries: Array<String>, words: Array<String>): IntArray {
        val queriesMinFrequecies = IntArray(queries.size)
        for (i in queries.indices) {
            queriesMinFrequecies[i] = computeLowestFrequency(queries[i])
        }
        val wordsMinFrequecies = IntArray(words.size)
        for (i in words.indices) {
            wordsMinFrequecies[i] = computeLowestFrequency(words[i])
        }
        wordsMinFrequecies.sort()
        val result = IntArray(queries.size)
        for (i in result.indices) {
            result[i] = search(wordsMinFrequecies, queriesMinFrequecies[i])
        }
        return result
    }

    private fun search(nums: IntArray, target: Int): Int {
        var count = 0
        for (i in nums.indices.reversed()) {
            if (nums[i] > target) {
                count++
            } else {
                break
            }
        }
        return count
    }

    private fun computeLowestFrequency(string: String): Int {
        val str = string.toCharArray()
        str.sort()
        val sortedString = String(str)
        var frequency = 1
        for (i in 1 until sortedString.length) {
            if (sortedString[i] == sortedString[0]) {
                frequency++
            } else {
                break
            }
        }
        return frequency
    }
}
