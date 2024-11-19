package g1201_1300.s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSideLength() {
        assertThat(
            Solution()
                .maxSideLength(
                    arrayOf(
                        intArrayOf(1, 1, 3, 2, 4, 3, 2),
                        intArrayOf(1, 1, 3, 2, 4, 3, 2),
                        intArrayOf(1, 1, 3, 2, 4, 3, 2),
                    ),
                    4,
                ),
            equalTo(2),
        )
    }

    @Test
    fun maxSideLength2() {
        assertThat(
            Solution()
                .maxSideLength(
                    arrayOf(
                        intArrayOf(2, 2, 2, 2, 2),
                        intArrayOf(2, 2, 2, 2, 2),
                        intArrayOf(2, 2, 2, 2, 2),
                        intArrayOf(2, 2, 2, 2, 2),
                        intArrayOf(2, 2, 2, 2, 2),
                    ),
                    1,
                ),
            equalTo(0),
        )
    }
}
