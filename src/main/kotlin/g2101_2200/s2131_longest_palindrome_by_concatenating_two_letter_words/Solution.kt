package g2101_2200.s2131_longest_palindrome_by_concatenating_two_letter_words

// #Medium #Array #String #Hash_Table #Greedy #Counting #Level_2_Day_5_Greedy
// #2023_06_25_Time_607_ms_(90.00%)_Space_55.2_MB_(100.00%)

class Solution {
    fun longestPalindrome(words: Array<String>): Int {
        val counter: MutableMap<String, Int> = HashMap()
        for (word in words) {
            counter[word] = counter.getOrDefault(word, 0) + 1
        }
        var pairPalindrome = 0
        var selfPalindrome = 0
        for ((key, count1) in counter) {
            if (isPalindrome(key)) {
                selfPalindrome += if (count1 % 2 == 1 && selfPalindrome % 2 == 0) {
                    count1
                } else {
                    count1 - count1 % 2
                }
            } else {
                val palindrome = palindrome(key)
                val count = counter[palindrome]
                if (count != null) {
                    pairPalindrome += Math.min(count, count1)
                }
            }
        }
        return 2 * (selfPalindrome + pairPalindrome)
    }

    private fun isPalindrome(word: String): Boolean {
        return word[1] == word[0]
    }

    private fun palindrome(word: String): String {
        return java.lang.String.valueOf(charArrayOf(word[1], word[0]))
    }
}
