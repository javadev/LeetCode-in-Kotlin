package g2401_2500.s2467_most_profitable_path_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostProfitablePath() {
        assertThat(
            Solution()
                .mostProfitablePath(
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4)),
                    3, intArrayOf(-2, 4, 2, -4, 6)
                ),
            equalTo(2)
        )
    }

    @Test
    fun mostProfitablePath2() {
        assertThat(
            Solution().mostProfitablePath(arrayOf(intArrayOf(0, 1)), 1, intArrayOf(-7280, 2350)),
            equalTo(-7280)
        )
    }
}
