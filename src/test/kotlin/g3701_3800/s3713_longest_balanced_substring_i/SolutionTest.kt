package g3701_3800.s3713_longest_balanced_substring_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestBalanced() {
        assertThat<Int>(Solution().longestBalanced("abbac"), equalTo<Int>(4))
    }

    @Test
    fun longestBalanced2() {
        assertThat<Int>(Solution().longestBalanced("zzabccy"), equalTo<Int>(4))
    }

    @Test
    fun longestBalanced3() {
        assertThat<Int>(Solution().longestBalanced("aba"), equalTo<Int>(2))
    }
}
