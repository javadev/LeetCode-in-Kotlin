package g0901_1000.s0986_interval_list_intersections

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intervalIntersection() {
        assertThat(
            Solution()
                .intervalIntersection(
                    arrayOf(
                        intArrayOf(0, 2),
                        intArrayOf(5, 10),
                        intArrayOf(13, 23),
                        intArrayOf(24, 25)
                    ),
                    arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))
                ),
            equalTo(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(5, 5),
                    intArrayOf(8, 10),
                    intArrayOf(15, 23),
                    intArrayOf(24, 24),
                    intArrayOf(25, 25)
                )
            )
        )
    }

    @Test
    fun intervalIntersection2() {
        assertThat(
            Solution().intervalIntersection(arrayOf(intArrayOf(1, 3), intArrayOf(5, 9)), arrayOf()),
            equalTo(arrayOf())
        )
    }
}
