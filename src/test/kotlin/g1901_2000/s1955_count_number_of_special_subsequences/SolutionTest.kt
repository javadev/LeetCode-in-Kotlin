package g1901_2000.s1955_count_number_of_special_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSpecialSubsequences() {
        assertThat(Solution().countSpecialSubsequences(intArrayOf(0, 1, 2, 2)), equalTo(3))
    }

    @Test
    fun countSpecialSubsequences2() {
        assertThat(Solution().countSpecialSubsequences(intArrayOf(2, 2, 0, 0)), equalTo(0))
    }

    @Test
    fun countSpecialSubsequences3() {
        assertThat(
            Solution().countSpecialSubsequences(intArrayOf(0, 1, 2, 0, 1, 2)), equalTo(7)
        )
    }
}
