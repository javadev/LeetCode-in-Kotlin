package g0901_1000.s0963_minimum_area_rectangle_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAreaFreeRect() {
        assertThat(
            Solution().minAreaFreeRect(arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(1, 0), intArrayOf(0, 1))),
            equalTo(2.0),
        )
    }

    @Test
    fun minAreaFreeRect2() {
        assertThat(
            Solution()
                .minAreaFreeRect(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(2, 1),
                        intArrayOf(1, 1),
                        intArrayOf(1, 0),
                        intArrayOf(2, 0),
                    ),
                ),
            equalTo(1.0),
        )
    }

    @Test
    fun minAreaFreeRect3() {
        assertThat(
            Solution()
                .minAreaFreeRect(
                    arrayOf(
                        intArrayOf(0, 3),
                        intArrayOf(1, 2),
                        intArrayOf(3, 1),
                        intArrayOf(1, 3),
                        intArrayOf(2, 1),
                    ),
                ),
            equalTo(0.0),
        )
    }
}
