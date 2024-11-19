package g1201_1300.s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat(
            Solution().minFlips(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 1),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun minFlips2() {
        assertThat(
            Solution().minFlips(arrayOf(intArrayOf(0))),
            equalTo(0),
        )
    }

    @Test
    fun minFlips3() {
        assertThat(
            Solution().minFlips(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 0, 0),
                ),
            ),
            equalTo(-1),
        )
    }
}
