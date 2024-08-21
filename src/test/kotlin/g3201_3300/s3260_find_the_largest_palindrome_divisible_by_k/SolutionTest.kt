package g3201_3300.s3260_find_the_largest_palindrome_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPalindrome() {
        assertThat(Solution().largestPalindrome(3, 5), equalTo("595"))
    }

    @Test
    fun largestPalindrome2() {
        assertThat(Solution().largestPalindrome(1, 4), equalTo("8"))
    }

    @Test
    fun largestPalindrome3() {
        assertThat(Solution().largestPalindrome(5, 6), equalTo("89898"))
    }

    @Test
    fun largestPalindrome4() {
        val solution = Solution()
        Assertions.assertEquals("9", solution.largestPalindrome(1, 1))
        Assertions.assertEquals("99", solution.largestPalindrome(2, 1))
        Assertions.assertEquals("999", solution.largestPalindrome(3, 1))
    }

    @Test
    fun largestPalindrome5() {
        val solution = Solution()
        Assertions.assertEquals("8", solution.largestPalindrome(1, 2))
        Assertions.assertEquals("88", solution.largestPalindrome(2, 2))
        Assertions.assertEquals("898", solution.largestPalindrome(3, 2))
        Assertions.assertEquals("8998", solution.largestPalindrome(4, 2))
    }

    @Test
    fun largestPalindrome6() {
        val solution = Solution()
        Assertions.assertEquals("9", solution.largestPalindrome(1, 3))
        Assertions.assertEquals("99", solution.largestPalindrome(2, 3))
        Assertions.assertEquals("999", solution.largestPalindrome(3, 3))
    }

    @Test
    fun largestPalindrome7() {
        val solution = Solution()
        Assertions.assertEquals("8", solution.largestPalindrome(1, 4))
        Assertions.assertEquals("88", solution.largestPalindrome(2, 4))
        Assertions.assertEquals("888", solution.largestPalindrome(3, 4))
        Assertions.assertEquals("8888", solution.largestPalindrome(4, 4))
        Assertions.assertEquals("88988", solution.largestPalindrome(5, 4))
    }

    @Test
    fun largestPalindrome8() {
        val solution = Solution()
        Assertions.assertEquals("5", solution.largestPalindrome(1, 5))
        Assertions.assertEquals("55", solution.largestPalindrome(2, 5))
        Assertions.assertEquals("595", solution.largestPalindrome(3, 5))
    }

    @Test
    fun largestPalindrome9() {
        val solution = Solution()
        Assertions.assertEquals("6", solution.largestPalindrome(1, 6))
        Assertions.assertEquals("66", solution.largestPalindrome(2, 6))
        Assertions.assertEquals("8778", solution.largestPalindrome(4, 6))
    }

    @Test
    fun largestPalindrome10() {
        val solution = Solution()
        Assertions.assertEquals("7", solution.largestPalindrome(1, 7))
        Assertions.assertEquals("77", solution.largestPalindrome(2, 7))
        Assertions.assertEquals("959", solution.largestPalindrome(3, 7))
        Assertions.assertEquals("99799", solution.largestPalindrome(5, 7))
        Assertions.assertEquals("999999", solution.largestPalindrome(6, 7))
        Assertions.assertEquals("9994999", solution.largestPalindrome(7, 7))
    }

    @Test
    fun largestPalindrome11() {
        val solution = Solution()
        Assertions.assertEquals("8", solution.largestPalindrome(1, 8))
        Assertions.assertEquals("88", solution.largestPalindrome(2, 8))
        Assertions.assertEquals("888", solution.largestPalindrome(3, 8))
        Assertions.assertEquals("8888", solution.largestPalindrome(4, 8))
        Assertions.assertEquals("88888", solution.largestPalindrome(5, 8))
    }

    @Test
    fun largestPalindrome12() {
        val solution = Solution()
        Assertions.assertEquals("9", solution.largestPalindrome(1, 9))
        Assertions.assertEquals("99", solution.largestPalindrome(2, 9))
        Assertions.assertEquals("999", solution.largestPalindrome(3, 9))
    }
}
