package g2201_2300.s2245_maximum_trailing_zeros_in_a_cornered_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTrailingZeros() {
        assertThat(
            Solution()
                .maxTrailingZeros(
                    arrayOf(
                        intArrayOf(23, 17, 15, 3, 20),
                        intArrayOf(8, 1, 20, 27, 11),
                        intArrayOf(9, 4, 6, 2, 21),
                        intArrayOf(40, 9, 1, 10, 6),
                        intArrayOf(22, 7, 4, 5, 3)
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun maxTrailingZeros2() {
        assertThat(
            Solution().maxTrailingZeros(arrayOf(intArrayOf(4, 3, 2), intArrayOf(7, 6, 1), intArrayOf(8, 8, 8))),
            equalTo(0)
        )
    }
}
