package g1701_1800.s1744_can_you_eat_your_favorite_candy_on_your_favorite_day

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canEat() {
        assertThat(
            Solution()
                .canEat(
                    intArrayOf(7, 4, 5, 3, 8),
                    arrayOf(
                        intArrayOf(0, 2, 2),
                        intArrayOf(4, 2, 4),
                        intArrayOf(2, 13, 1000000000),
                    ),
                ),
            equalTo(booleanArrayOf(true, false, true)),
        )
    }

    @Test
    fun canEat2() {
        assertThat(
            Solution()
                .canEat(
                    intArrayOf(5, 2, 6, 4, 1),
                    arrayOf(
                        intArrayOf(3, 1, 2),
                        intArrayOf(4, 10, 3),
                        intArrayOf(3, 10, 100),
                        intArrayOf(4, 100, 30),
                        intArrayOf(1, 3, 1),
                    ),
                ),
            equalTo(booleanArrayOf(false, true, true, false, false)),
        )
    }
}
