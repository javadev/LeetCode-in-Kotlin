package g2201_2300.s2248_intersection_of_multiple_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intersection() {
        assertThat(
            Solution()
                .intersection(arrayOf(intArrayOf(3, 1, 2, 4, 5), intArrayOf(1, 2, 3, 4), intArrayOf(3, 4, 5, 6))),
            equalTo(mutableListOf(3, 4)),
        )
    }

    @Test
    fun intersection2() {
        assertThat(
            Solution().intersection(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))),
            equalTo(mutableListOf<Any>()),
        )
    }
}
