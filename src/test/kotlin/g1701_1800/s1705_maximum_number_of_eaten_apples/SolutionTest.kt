package g1701_1800.s1705_maximum_number_of_eaten_apples

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun eatenApples() {
        assertThat(
            Solution().eatenApples(intArrayOf(1, 2, 3, 5, 2), intArrayOf(3, 2, 1, 4, 2)),
            equalTo(7)
        )
    }

    @Test
    fun eatenApples2() {
        assertThat(
            Solution()
                .eatenApples(intArrayOf(3, 0, 0, 0, 0, 2), intArrayOf(3, 0, 0, 0, 0, 2)),
            equalTo(5)
        )
    }
}
