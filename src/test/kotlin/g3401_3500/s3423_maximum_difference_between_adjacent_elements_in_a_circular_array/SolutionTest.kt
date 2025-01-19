package g3401_3500.s3423_maximum_difference_between_adjacent_elements_in_a_circular_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAdjacentDistance() {
        assertThat<Int>(
            Solution().maxAdjacentDistance(intArrayOf(1, 2, 4)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxAdjacentDistance2() {
        assertThat<Int>(
            Solution().maxAdjacentDistance(intArrayOf(-5, -10, -5)),
            equalTo<Int>(5),
        )
    }
}
