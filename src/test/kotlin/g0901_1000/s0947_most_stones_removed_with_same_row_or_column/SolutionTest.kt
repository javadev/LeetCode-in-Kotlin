package g0901_1000.s0947_most_stones_removed_with_same_row_or_column

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeStones() {
        assertThat(
            Solution()
                .removeStones(
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                        intArrayOf(1, 2),
                        intArrayOf(2, 1),
                        intArrayOf(2, 2),
                    ),
                ),
            equalTo(5),
        )
    }

    @Test
    fun removeStones2() {
        assertThat(
            Solution().removeStones(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 2),
                    intArrayOf(1, 1),
                    intArrayOf(2, 0),
                    intArrayOf(2, 2),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun removeStones3() {
        assertThat(Solution().removeStones(arrayOf(intArrayOf(0, 0))), equalTo(0))
    }
}
