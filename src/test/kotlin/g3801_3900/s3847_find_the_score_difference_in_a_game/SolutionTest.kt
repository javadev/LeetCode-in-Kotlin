package g3801_3900.s3847_find_the_score_difference_in_a_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreDifference() {
        assertThat<Int>(Solution().scoreDifference(intArrayOf(1, 2, 3)), equalTo<Int>(0))
    }

    @Test
    fun scoreDifference2() {
        assertThat<Int>(
            Solution().scoreDifference(intArrayOf(2, 4, 2, 1, 2, 1)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun scoreDifference3() {
        assertThat<Int>(Solution().scoreDifference(intArrayOf(1)), equalTo<Int>(-1))
    }
}
