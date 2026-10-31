package g3801_3900.s3900_longest_balanced_substring_after_one_swap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestBalanced() {
        assertThat<Int>(Solution().longestBalanced("100001"), equalTo<Int>(4))
    }

    @Test
    fun longestBalanced2() {
        assertThat<Int>(Solution().longestBalanced("111"), equalTo<Int>(0))
    }

    @Test
    fun longestBalanced3() {
        assertThat<Int>(Solution().longestBalanced("0000"), equalTo<Int>(0))
    }

    @Test
    fun longestBalanced4() {
        assertThat<Int>(Solution().longestBalanced("0"), equalTo<Int>(0))
    }

    @Test
    fun longestBalanced5() {
        assertThat<Int>(Solution().longestBalanced("1100"), equalTo<Int>(4))
    }

    @Test
    fun longestBalanced6() {
        assertThat<Int>(Solution().longestBalanced("0001000"), equalTo<Int>(2))
    }

    @Test
    fun longestBalanced7() {
        assertThat<Int>(Solution().longestBalanced("1100000011"), equalTo<Int>(6))
    }
}
