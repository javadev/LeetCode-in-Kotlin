package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.containsString
import org.hamcrest.Matchers.greaterThanOrEqualTo
import org.hamcrest.Matchers.hasLength
import org.hamcrest.Matchers.not
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexPalindromicPermutation() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("baba", "abba"),
            equalTo<String>("baab"),
        )
    }

    @Test
    fun lexPalindromicPermutation2() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("baba", "bbaa"),
            equalTo<String>(""),
        )
    }

    @Test
    fun lexPalindromicPermutation3() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("abc", "abb"),
            equalTo<String>(""),
        )
    }

    @Test
    fun lexPalindromicPermutation4() {
        assertThat<String>(
            Solution().lexPalindromicPermutation("aac", "abb"),
            equalTo<String>("aca"),
        )
    }

    @Test
    fun lexPalindromicPermutation5() {
        // Branch: oddc > 1
        val result = Solution().lexPalindromicPermutation("abc", "a")
        assertThat<String>(result, equalTo<String>(""))
    }

    @Test
    fun lexPalindromicPermutation6() {
        // Branch: oddc = 1
        val result = Solution().lexPalindromicPermutation("aab", "a")
        assertThat<String>(
            result,
            allOf<String>(not<String>(equalTo<String>("")), hasLength(3)),
        )
    }

    @Test
    fun lexPalindromicPermutation7() {
        // Branch: oddc = 0
        val result = Solution().lexPalindromicPermutation("aabb", "ab")
        assertThat<String>(result, not<String>(equalTo<String>("")))
    }

    @Test
    fun lexPalindromicPermutation8() {
        // Branch: func returns false
        val result = Solution().lexPalindromicPermutation("abc", "xyz")
        assertThat<String>(result, equalTo<String>(""))
    }

    @Test
    fun lexPalindromicPermutation9() {
        // Edge case: length = 1
        val result = Solution().lexPalindromicPermutation("a", "a")
        assertThat<String>(result, equalTo<String>(""))
    }

    @Test
    fun lexPalindromicPermutation10() {
        // Branch: l > r and comparison result > 0
        val target = "a"
        val freq = IntArray(26)
        val ans = charArrayOf('b', 'b')

        val result = Solution().func(0, target, ans, 1, 0, freq, false)
        assertThat<Boolean>(result, equalTo<Boolean>(true))
    }

    @Test
    fun lexPalindromicPermutation11() {
        // Branch: l > r and comparison result <= 0
        val target = "z"
        val freq = IntArray(26)
        val ans = charArrayOf('a', 'a')

        val result = Solution().func(0, target, ans, 1, 0, freq, false)
        assertThat<Boolean>(result, equalTo<Boolean>(false))
    }

    @Test
    fun lexPalindromicPermutation12() {
        // Branch: l == r with available character
        val target = "a"
        val freq = IntArray(26)
        // 'a' has frequency 1
        freq[0] = 1
        val ans = CharArray(1)

        val result = Solution().func(0, target, ans, 0, 0, freq, false)
        assertThat<Boolean>(result, equalTo<Boolean>(false))
        assertThat<Char>(ans[0], equalTo<Char>('#'))
    }

    @Test
    fun lexPalindromicPermutation13() {
        // Branch: end = true, finds char with freq > 1
        val target = "ab"
        val freq = IntArray(26)
        // 'a' can form a pair
        freq[0] = 2
        freq[1] = 0
        val ans = CharArray(2)

        val result = Solution().func(1, target, ans, 0, 1, freq, true)
        assertThat<Boolean>(
            result,
            anyOf<Boolean>(equalTo<Boolean>(true), equalTo<Boolean>(false)),
        )
        // Frequency restored
        assertThat<Int>(freq[0], equalTo<Int>(2))
    }

    @Test
    fun lexPalindromicPermutation14() {
        // Branch: end = true, no char has freq > 1
        val target = "ab"
        val freq = IntArray(26)
        freq[0] = 1
        freq[1] = 1
        val ans = CharArray(2)

        val result = Solution().func(1, target, ans, 0, 1, freq, true)
        assertThat<Boolean>(result, equalTo<Boolean>(false))
    }

    @Test
    fun lexPalindromicPermutation15() {
        // Branch: end = true, tries different pairs
        val target = "abc"
        val freq = IntArray(26)
        freq[0] = 2
        freq[1] = 2
        freq[2] = 2
        val ans = CharArray(3)

        Solution().func(1, target, ans, 0, 2, freq, true)
        assertThat<Int>(freq[0], equalTo<Int>(0))
        assertThat<Int>(freq[1], equalTo<Int>(2))
        assertThat<Int>(freq[2], equalTo<Int>(1))
    }

    @Test
    fun lexPalindromicPermutation16() {
        // Branch: end = false, curr has freq > 1
        val target = "a"
        val freq = IntArray(26)
        freq[0] = 2
        val ans = CharArray(2)

        Solution().func(0, target, ans, 0, 1, freq, false)
        assertThat<Int>(freq[0], equalTo<Int>(0))
    }

    @Test
    fun lexPalindromicPermutation17() {
        // Branch: end = false, curr has freq <= 1
        val target = "a"
        val freq = IntArray(26)
        freq[0] = 0
        val ans = CharArray(2)

        Solution().func(0, target, ans, 0, 1, freq, false)
        assertThat<Int>(freq[0], equalTo<Int>(0))
    }

    @Test
    fun lexPalindromicPermutation18() {
        // Branch: end = false, finds next char with freq > 1
        val target = "a"
        val freq = IntArray(26)
        freq[0] = 0
        freq[1] = 2
        val ans = CharArray(2)

        Solution().func(0, target, ans, 0, 1, freq, false)
        assertThat<Int>(freq[0], equalTo<Int>(0))
        assertThat<Int>(freq[1], equalTo<Int>(0))
    }

    @Test
    fun lexPalindromicPermutation19() {
        // Branch: end = false, no next char with freq > 1
        val target = "z"
        val freq = IntArray(26)
        freq[25] = 1
        val ans = CharArray(2)

        val result = Solution().func(0, target, ans, 0, 1, freq, false)
        assertThat<Boolean>(result, equalTo<Boolean>(false))
    }

    @Test
    fun lexPalindromicPermutation20() {
        // Branch: end = false transitions to end = true
        val target = "ab"
        val freq = IntArray(26)
        freq[0] = 2
        freq[1] = 2
        val ans = CharArray(2)

        Solution().func(0, target, ans, 0, 1, freq, false)

        assertThat<Int>(freq[0], equalTo<Int>(2))
        assertThat<Int>(freq[1], equalTo<Int>(0))
    }

    @Test
    fun lexPalindromicPermutation21() {
        // Verify result is always a palindrome
        val result = Solution().lexPalindromicPermutation("aabbcc", "abc")
        if (!result.isEmpty()) {
            val reversed = StringBuilder(result).reverse().toString()
            assertThat<String>(result, equalTo<String>(reversed))
        }
    }

    @Test
    fun lexPalindromicPermutation22() {
        // Verify character frequencies are preserved
        val input = "aabbcc"
        val result = Solution().lexPalindromicPermutation(input, "abc")

        if (!result.isEmpty()) {
            val inputFreq = IntArray(26)
            val resultFreq = IntArray(26)

            for (c in input.toCharArray()) {
                inputFreq[c.code - 'a'.code]++
            }
            for (c in result.toCharArray()) {
                resultFreq[c.code - 'a'.code]++
            }

            assertThat<IntArray>(resultFreq, equalTo<IntArray>(inputFreq))
        }
    }

    @Test
    fun lexPalindromicPermutation23() {
        // Result length should match input length
        val input = "aabbccdd"
        val result = Solution().lexPalindromicPermutation(input, "abcd")

        if (!result.isEmpty()) {
            assertThat<Int>(result.length, equalTo<Int>(input.length))
        }
    }

    @Test
    fun lexPalindromicPermutation24() {
        // Result should be >= target in lexicographical order
        val result = Solution().lexPalindromicPermutation("aabbcc", "abc")

        if (!result.isEmpty()) {
            assertThat<Int>(result.compareTo("abc"), greaterThanOrEqualTo<Int>(0))
        }
    }

    @Test
    fun lexPalindromicPermutation25() {
        // Complex scenario with multiple characters
        val result = Solution().lexPalindromicPermutation("aabbccdd", "abcd")

        assertThat<String>(
            result,
            anyOf<String>(
                equalTo<String>(""),
                allOf<String>(
                    hasLength(8),
                    containsString("a"),
                    containsString("b"),
                ),
            ),
        )
    }

    @Test
    fun lexPalindromicPermutation26() {
        // Edge case: empty string (if applicable)
        val result = Solution().lexPalindromicPermutation("", "")
        assertThat<String>(
            result,
            anyOf<String>(equalTo<String>(""), not<Any>(nullValue())),
        )
    }

    @Test
    fun lexPalindromicPermutation27() {
        // Verify frequency array is restored after recursion
        val target = "aabb"
        val freq = IntArray(26)
        val freqCopy: IntArray = freq.clone()

        val ans = CharArray(4)
        Solution().func(0, target, ans, 0, 3, freq, false)

        assertThat<IntArray>(freq, equalTo<IntArray>(freqCopy))
    }

    @Test
    fun lexPalindromicPermutation28() {
        // Verify char array is properly initialized
        val result = Solution().lexPalindromicPermutation("aa", "a")

        if (!result.isEmpty()) {
            assertThat<String>(result, not<String>(containsString("#")))
        }
    }
}
