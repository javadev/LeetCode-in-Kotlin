package g2701_2800.s2768_number_of_black_blocks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBlackBlocks() {
        assertThat(Solution().countBlackBlocks(3, 3, arrayOf(intArrayOf(0, 0))), equalTo(longArrayOf(3, 1, 0, 0, 0)))
    }

    @Test
    fun countBlackBlocks2() {
        assertThat(
            Solution().countBlackBlocks(
                3, 3,
                arrayOf(
                    intArrayOf(0, 0), intArrayOf(1, 1),
                    intArrayOf(0, 2)
                )
            ),
            equalTo(longArrayOf(0, 2, 2, 0, 0))
        )
    }
}
