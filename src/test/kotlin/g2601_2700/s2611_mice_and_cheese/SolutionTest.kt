package g2601_2700.s2611_mice_and_cheese

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun miceAndCheese() {
        assertThat(
            Solution().miceAndCheese(intArrayOf(1, 1, 3, 4), intArrayOf(4, 4, 1, 1), 2),
            equalTo(
                15,
            ),
        )
    }

    @Test
    fun miceAndCheese2() {
        assertThat(
            Solution().miceAndCheese(intArrayOf(1, 1), intArrayOf(1, 1), 2),
            equalTo(
                2,
            ),
        )
    }
}
