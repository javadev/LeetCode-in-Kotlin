package g2601_2700.s2644_find_the_maximum_divisibility_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDivScore() {
        assertThat(
            Solution().maxDivScore(intArrayOf(4, 7, 9, 3, 9), intArrayOf(5, 2, 3)),
            equalTo(3),
        )
    }

    @Test
    fun maxDivScore2() {
        assertThat(
            Solution().maxDivScore(intArrayOf(20, 14, 21, 10), intArrayOf(5, 7, 5)),
            equalTo(5),
        )
    }

    @Test
    fun maxDivScore3() {
        assertThat(
            Solution().maxDivScore(intArrayOf(12), intArrayOf(10, 16)),
            equalTo(10),
        )
    }
}
