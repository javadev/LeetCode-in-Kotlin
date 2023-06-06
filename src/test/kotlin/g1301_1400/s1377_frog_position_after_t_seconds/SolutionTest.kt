package g1301_1400.s1377_frog_position_after_t_seconds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun frogPosition() {
        assertThat(
            Solution()
                .frogPosition(
                    7,
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(1, 3),
                        intArrayOf(1, 7), intArrayOf(2, 4), intArrayOf(2, 6), intArrayOf(3, 5)
                    ),
                    2,
                    4
                ),
            equalTo(0.16666666666666666)
        )
    }

    @Test
    fun frogPosition2() {
        assertThat(
            Solution()
                .frogPosition(
                    7,
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(1, 3),
                        intArrayOf(1, 7), intArrayOf(2, 4), intArrayOf(2, 6), intArrayOf(3, 5)
                    ),
                    1,
                    7
                ),
            equalTo(0.3333333333333333)
        )
    }
}
