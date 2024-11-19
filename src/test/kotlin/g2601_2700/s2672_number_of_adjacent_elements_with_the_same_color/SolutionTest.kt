package g2601_2700.s2672_number_of_adjacent_elements_with_the_same_color

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun colorTheArray() {
        assertThat(
            Solution().colorTheArray(
                4,
                arrayOf(
                    intArrayOf(0, 2),
                    intArrayOf(1, 2),
                    intArrayOf(3, 1),
                    intArrayOf(1, 1),
                    intArrayOf(2, 1),
                ),
            ),
            equalTo(intArrayOf(0, 1, 1, 0, 2)),
        )
    }

    @Test
    fun colorTheArray2() {
        assertThat(
            Solution().colorTheArray(1, arrayOf(intArrayOf(0, 100000))),
            equalTo(intArrayOf(0)),
        )
    }
}
