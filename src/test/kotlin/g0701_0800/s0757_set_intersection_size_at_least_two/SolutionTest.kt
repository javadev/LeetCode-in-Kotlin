package g0701_0800.s0757_set_intersection_size_at_least_two

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intersectionSizeTwo() {
        assertThat(
            Solution().intersectionSizeTwo(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                    intArrayOf(2, 5),
                    intArrayOf(3, 5),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun intersectionSizeTwo2() {
        assertThat(
            Solution().intersectionSizeTwo(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(2, 4),
                    intArrayOf(4, 5),
                ),
            ),
            equalTo(5),
        )
    }
}
