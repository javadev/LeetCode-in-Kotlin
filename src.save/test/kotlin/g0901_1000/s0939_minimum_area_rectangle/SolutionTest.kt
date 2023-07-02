package g0901_1000.s0939_minimum_area_rectangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAreaRect() {
        assertThat(
            Solution().minAreaRect(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 3),
                    intArrayOf(3, 1),
                    intArrayOf(3, 3),
                    intArrayOf(2, 2)
                )
            ),
            equalTo(4)
        )
    }

    @Test
    fun minAreaRect2() {
        assertThat(
            Solution()
                .minAreaRect(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(1, 3),
                        intArrayOf(3, 1),
                        intArrayOf(3, 3),
                        intArrayOf(4, 1),
                        intArrayOf(4, 3)
                    )
                ),
            equalTo(2)
        )
    }
}
