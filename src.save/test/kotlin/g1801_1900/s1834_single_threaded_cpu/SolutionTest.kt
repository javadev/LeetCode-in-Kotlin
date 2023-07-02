package g1801_1900.s1834_single_threaded_cpu

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun order() {
        assertThat(
            Solution().getOrder(arrayOf(intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(3, 2), intArrayOf(4, 1))),
            equalTo(intArrayOf(0, 2, 3, 1))
        )
    }

    @Test
    fun order2() {
        assertThat(
            Solution().getOrder(
                arrayOf(
                    intArrayOf(7, 10),
                    intArrayOf(7, 12),
                    intArrayOf(7, 5),
                    intArrayOf(7, 4),
                    intArrayOf(7, 2)
                )
            ),
            equalTo(intArrayOf(4, 3, 2, 0, 1))
        )
    }
}
