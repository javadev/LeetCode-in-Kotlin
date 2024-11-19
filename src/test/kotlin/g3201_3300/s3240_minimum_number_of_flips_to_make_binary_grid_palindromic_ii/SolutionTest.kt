package g3201_3300.s3240_minimum_number_of_flips_to_make_binary_grid_palindromic_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat(
            Solution().minFlips(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))),
            equalTo(3),
        )
    }

    @Test
    fun minFlips2() {
        assertThat(
            Solution().minFlips(arrayOf(intArrayOf(0, 1), intArrayOf(0, 1), intArrayOf(0, 0))),
            equalTo(2),
        )
    }

    @Test
    fun minFlips3() {
        assertThat(Solution().minFlips(arrayOf(intArrayOf(1), intArrayOf(1))), equalTo(2))
    }
}
