package g2901_3000.s3000_maximum_area_of_longest_diagonal_rectangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areaOfMaxDiagonal() {
        assertThat(
            Solution().areaOfMaxDiagonal(arrayOf(intArrayOf(9, 3), intArrayOf(8, 6))),
            equalTo(48)
        )
    }

    @Test
    fun areaOfMaxDiagonal2() {
        assertThat(
            Solution().areaOfMaxDiagonal(arrayOf(intArrayOf(3, 4), intArrayOf(4, 3))),
            equalTo(12)
        )
    }
}
