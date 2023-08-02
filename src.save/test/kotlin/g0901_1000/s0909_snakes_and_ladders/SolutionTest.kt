package g0901_1000.s0909_snakes_and_ladders

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun snakesAndLadders() {
        assertThat(
            Solution()
                .snakesAndLadders(
                    arrayOf(
                        intArrayOf(-1, -1, -1, -1, -1, -1),
                        intArrayOf(-1, -1, -1, -1, -1, -1),
                        intArrayOf(-1, -1, -1, -1, -1, -1),
                        intArrayOf(-1, 35, -1, -1, 13, -1),
                        intArrayOf(-1, -1, -1, -1, -1, -1),
                        intArrayOf(-1, 15, -1, -1, -1, -1)
                    )
                ),
            equalTo(4)
        )
    }

    @Test
    fun snakesAndLadders2() {
        assertThat(Solution().snakesAndLadders(arrayOf(intArrayOf(-1, -1), intArrayOf(-1, 3))), equalTo(1))
    }
}
