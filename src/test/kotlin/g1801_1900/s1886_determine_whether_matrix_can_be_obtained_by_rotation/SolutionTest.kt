package g1801_1900.s1886_determine_whether_matrix_can_be_obtained_by_rotation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRotation() {
        assertThat(
            Solution()
                .findRotation(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)), arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))),
            equalTo(true),
        )
    }

    @Test
    fun findRotation2() {
        assertThat(
            Solution()
                .findRotation(arrayOf(intArrayOf(0, 1), intArrayOf(1, 1)), arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))),
            equalTo(false),
        )
    }

    @Test
    fun findRotation3() {
        assertThat(
            Solution()
                .findRotation(
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)),
                    arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)),
                ),
            equalTo(true),
        )
    }
}
