package g1001_1100.s1004_max_consecutive_ones_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestOnes() {
        assertThat(
            Solution().longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2),
            equalTo(6)
        )
    }

    @Test
    fun longestOnes2() {
        assertThat(
            Solution()
                .longestOnes(
                    intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1),
                    3
                ),
            equalTo(10)
        )
    }
}
