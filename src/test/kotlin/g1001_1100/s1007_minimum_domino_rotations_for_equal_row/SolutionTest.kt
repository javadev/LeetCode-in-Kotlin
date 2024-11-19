package g1001_1100.s1007_minimum_domino_rotations_for_equal_row

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDominoRotations() {
        assertThat(
            Solution()
                .minDominoRotations(intArrayOf(2, 1, 2, 4, 2, 2), intArrayOf(5, 2, 6, 2, 3, 2)),
            equalTo(2),
        )
    }

    @Test
    fun minDominoRotations2() {
        assertThat(
            Solution()
                .minDominoRotations(intArrayOf(3, 5, 1, 2, 3), intArrayOf(3, 6, 3, 3, 4)),
            equalTo(-1),
        )
    }
}
