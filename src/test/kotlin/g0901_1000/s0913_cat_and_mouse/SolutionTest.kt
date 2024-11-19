package g0901_1000.s0913_cat_and_mouse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun catMouseGame() {
        assertThat(
            Solution()
                .catMouseGame(
                    arrayOf(
                        intArrayOf(2, 5),
                        intArrayOf(3),
                        intArrayOf(0, 4, 5),
                        intArrayOf(1, 4, 5),
                        intArrayOf(2, 3),
                        intArrayOf(0, 2, 3),
                    ),
                ),
            equalTo(0),
        )
    }

    @Test
    fun catMouseGame2() {
        assertThat(
            Solution().catMouseGame(arrayOf(intArrayOf(1, 3), intArrayOf(0), intArrayOf(3), intArrayOf(0, 2))),
            equalTo(1),
        )
    }
}
