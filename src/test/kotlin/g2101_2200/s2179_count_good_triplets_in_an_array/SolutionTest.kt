package g2101_2200.s2179_count_good_triplets_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodTriplets() {
        assertThat(
            Solution().goodTriplets(intArrayOf(2, 0, 1, 3), intArrayOf(0, 1, 2, 3)),
            equalTo(1L),
        )
    }

    @Test
    fun goodTriplets2() {
        assertThat(
            Solution().goodTriplets(intArrayOf(4, 0, 1, 3, 2), intArrayOf(4, 1, 0, 2, 3)),
            equalTo(4L),
        )
    }
}
