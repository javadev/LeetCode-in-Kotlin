package g0501_0600.s0587_erect_the_fence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun outerTrees() {
        assertThat(
            Solution()
                .outerTrees(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(2, 0),
                        intArrayOf(2, 4),
                        intArrayOf(3, 3),
                        intArrayOf(4, 2),
                    ),
                ),
            equalTo(arrayOf(intArrayOf(2, 0), intArrayOf(4, 2), intArrayOf(3, 3), intArrayOf(2, 4), intArrayOf(1, 1))),
        )
    }

    @Test
    fun outerTrees2() {
        assertThat(
            Solution().outerTrees(arrayOf(intArrayOf(1, 2), intArrayOf(2, 2), intArrayOf(4, 2))),
            equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(2, 2), intArrayOf(4, 2))),
        )
    }
}
