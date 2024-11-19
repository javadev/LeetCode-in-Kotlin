package g2701_2800.s2766_relocate_marbles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun relocateMarbles() {
        assertThat(
            Solution().relocateMarbles(
                intArrayOf(1, 6, 7, 8),
                intArrayOf(1, 7, 2),
                intArrayOf(2, 9, 5),
            ),
            equalTo(listOf(5, 6, 8, 9)),
        )
    }

    @Test
    fun relocateMarbles2() {
        assertThat(
            Solution().relocateMarbles(
                intArrayOf(1, 1, 3, 3),
                intArrayOf(1, 3),
                intArrayOf(2, 2),
            ),
            equalTo(listOf(2)),
        )
    }
}
