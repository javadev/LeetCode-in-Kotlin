package g3701_3800.s3714_longest_balanced_substring_ii

// #Medium #String #Hash_Table #Prefix_Sum #Weekly_Contest_471
// #2025_10_14_Time_194_ms_(100.00%)_Space_66.00_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun longestBalanced(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        val maxSameChar = findLongestSameCharSequence(s)
        val maxTwoChars = findLongestTwoCharBalanced(s)
        val maxThreeChars = findLongestThreeCharBalanced(s)
        return max(maxSameChar, max(maxTwoChars, maxThreeChars))
    }

    private fun findLongestSameCharSequence(s: String): Int {
        var maxLength = 1
        var currentLength = 1
        for (i in 1..<s.length) {
            if (s[i] == s[i - 1]) {
                currentLength++
            } else {
                maxLength = max(maxLength, currentLength)
                currentLength = 1
            }
        }
        return max(maxLength, currentLength)
    }

    private fun findLongestTwoCharBalanced(s: String): Int {
        var maxLength = 0
        for (p in CHARS.indices) {
            val firstChar: Char = CHARS[p]
            val secondChar: Char = CHARS[(p + 1) % CHARS.size]
            val excludedChar: Char = CHARS[(p + 2) % CHARS.size]
            maxLength = max(
                maxLength,
                findBalancedInSegments(s, firstChar, secondChar, excludedChar)
            )
        }
        return maxLength
    }

    private fun findBalancedInSegments(
        s: String, firstChar: Char, secondChar: Char, excludedChar: Char
    ): Int {
        var maxLength = 0
        var index = 0
        while (index < s.length) {
            if (s[index] == excludedChar) {
                index++
                continue
            }
            val segmentStart = index
            while (index < s.length && s[index] != excludedChar) {
                index++
            }
            val segmentEnd = index
            if (segmentEnd - segmentStart >= 2) {
                maxLength = max(
                    maxLength,
                    findBalancedInRange(
                        s, segmentStart, segmentEnd, firstChar, secondChar
                    )
                )
            }
        }
        return maxLength
    }

    private fun findBalancedInRange(s: String, start: Int, end: Int, firstChar: Char, secondChar: Char): Int {
        val differenceMap: MutableMap<Int, Int> = HashMap<Int, Int>()
        differenceMap[0] = 0

        var difference = 0
        var maxLength = 0

        for (i in start..<end) {
            val currentChar = s[i]

            if (currentChar == firstChar) {
                difference++
            } else if (currentChar == secondChar) {
                difference--
            }

            val position = i - start + 1

            if (differenceMap.containsKey(difference)) {
                maxLength = max(maxLength, position - differenceMap[difference]!!)
            } else {
                differenceMap[difference] = position
            }
        }
        return maxLength
    }

    private fun findLongestThreeCharBalanced(s: String): Int {
        val stateMap: MutableMap<Long, Int> = HashMap<Long, Int>()
        var diff1 = 0
        var diff2 = 0
        stateMap[encodeState(diff1, diff2)] = 0
        var maxLength = 0
        for (i in 0..<s.length) {
            val currentChar = s[i]

            when (currentChar) {
                'a' -> {
                    diff1++
                    diff2++
                }

                'b' -> diff1--
                'c' -> diff2--
                else -> {}
            }

            val stateKey = encodeState(diff1, diff2)

            if (stateMap.containsKey(stateKey)) {
                maxLength = max(maxLength, (i + 1) - stateMap[stateKey]!!)
            } else {
                stateMap[stateKey] = i + 1
            }
        }

        return maxLength
    }

    /** Encodes two differences into a single long key for HashMap.  */
    private fun encodeState(diff1: Int, diff2: Int): Long {
        return (diff1 + OFFSET) * MULTIPLIER + (diff2 + OFFSET)
    }

    companion object {
        private val CHARS = charArrayOf('a', 'b', 'c')
        private const val OFFSET = 100001L
        private const val MULTIPLIER = 200003L
    }
}
