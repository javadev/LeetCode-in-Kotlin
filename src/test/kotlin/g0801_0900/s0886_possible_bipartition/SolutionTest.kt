package g0801_0900.s0886_possible_bipartition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun possibleBipartition() {
        assertThat(
            Solution().possibleBipartition(4, arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))),
            equalTo(true)
        )
    }

    @Test
    fun possibleBipartition2() {
        assertThat(
            Solution().possibleBipartition(3, arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))),
            equalTo(false)
        )
    }

    @Test
    fun possibleBipartition3() {
        assertThat(
            Solution()
                .possibleBipartition(
                    5, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(1, 5))
                ),
            equalTo(false)
        )
    }
}
