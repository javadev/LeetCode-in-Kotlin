package g2201_2300.s2271_maximum_white_tiles_covered_by_a_carpet

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumWhiteTiles() {
        assertThat(
            Solution()
                .maximumWhiteTiles(
                    arrayOf(
                        intArrayOf(1, 5),
                        intArrayOf(10, 11),
                        intArrayOf(12, 18),
                        intArrayOf(20, 25),
                        intArrayOf(30, 32),
                    ),
                    10,
                ),
            equalTo(9),
        )
    }

    @Test
    fun maximumWhiteTiles2() {
        assertThat(
            Solution().maximumWhiteTiles(arrayOf(intArrayOf(10, 11), intArrayOf(1, 1)), 2),
            equalTo(2),
        )
    }
}
