package g3601_3700.s3660_jump_game_ix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat<IntArray>(
            Solution().maxValue(intArrayOf(2, 1, 3)),
            equalTo<IntArray>(intArrayOf(2, 2, 3)),
        )
    }

    @Test
    fun maxValue2() {
        assertThat<IntArray>(
            Solution().maxValue(intArrayOf(2, 3, 1)),
            equalTo<IntArray>(intArrayOf(3, 3, 3)),
        )
    }
}
