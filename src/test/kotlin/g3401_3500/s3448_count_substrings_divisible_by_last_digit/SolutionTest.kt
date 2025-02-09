package g3401_3500.s3448_count_substrings_divisible_by_last_digit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubstrings() {
        assertThat<Long>(Solution().countSubstrings("12936"), equalTo<Long>(11L))
    }

    @Test
    fun countSubstrings2() {
        assertThat<Long>(Solution().countSubstrings("5701283"), equalTo<Long>(18L))
    }

    @Test
    fun countSubstrings3() {
        assertThat<Long>(Solution().countSubstrings("1010101010"), equalTo<Long>(25L))
    }

    @Test
    fun countSubstrings4() {
        assertThat<Long>(Solution().countSubstrings("28"), equalTo<Long>(2L))
    }

    @Test
    fun countSubstrings5() {
        assertThat<Long>(Solution().countSubstrings("04"), equalTo<Long>(2L))
    }

    @Test
    fun testSingleDigitNumbers() {
        val solution = Solution()
        assertThat(solution.countSubstrings("1"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("2"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("3"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("4"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("5"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("6"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("7"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("8"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("9"), equalTo<Long>(1L))
    }

    @Test
    fun testDivisibilityBy4() {
        val solution = Solution()
        assertThat(solution.countSubstrings("44"), equalTo<Long>(3L))
        assertThat(solution.countSubstrings("48"), equalTo<Long>(3L))
        assertThat(solution.countSubstrings("24"), equalTo<Long>(3L))
    }

    @Test
    fun testDivisibilityBy8() {
        val solution = Solution()
        assertThat(solution.countSubstrings("888"), equalTo<Long>(6L))
        assertThat(solution.countSubstrings("808"), equalTo<Long>(4L))
        assertThat(solution.countSubstrings("8888"), equalTo<Long>(10L))
    }

    @Test
    fun testDivisibilityBy7() {
        val solution = Solution()
        assertThat(solution.countSubstrings("777"), equalTo<Long>(6L))
        assertThat(solution.countSubstrings("70"), equalTo<Long>(1L))
    }

    @Test
    fun testMixedCases() {
        val solution = Solution()
        assertThat(solution.countSubstrings("1234"), equalTo<Long>(6L))
        assertThat(solution.countSubstrings("456"), equalTo<Long>(5L))
        assertThat(solution.countSubstrings("987"), equalTo<Long>(4L))
    }

    @Test
    fun testEdgeCases() {
        val solution = Solution()
        assertThat(solution.countSubstrings("0"), equalTo<Long>(0L))
        assertThat(solution.countSubstrings("10"), equalTo<Long>(1L))
        assertThat(solution.countSubstrings("100"), equalTo<Long>(1L))
    }
}
