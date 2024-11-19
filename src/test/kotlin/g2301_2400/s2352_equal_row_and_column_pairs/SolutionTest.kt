package g2301_2400.s2352_equal_row_and_column_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun equalPairs() {
        assertThat(
            Solution().equalPairs(arrayOf(intArrayOf(3, 2, 1), intArrayOf(1, 7, 6), intArrayOf(2, 7, 7))),
            equalTo(1),
        )
    }

    @Test
    fun equalPairs2() {
        assertThat(
            Solution()
                .equalPairs(
                    arrayOf(
                        intArrayOf(3, 1, 2, 2),
                        intArrayOf(1, 4, 4, 5),
                        intArrayOf(2, 4, 2, 2),
                        intArrayOf(2, 4, 2, 2),
                    ),
                ),
            equalTo(3),
        )
    }
}
