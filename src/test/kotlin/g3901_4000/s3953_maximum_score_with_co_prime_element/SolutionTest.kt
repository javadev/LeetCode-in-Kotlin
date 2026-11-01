package g3901_4000.s3953_maximum_score_with_co_prime_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Int>(Solution().maxScore(intArrayOf(3, 4, 6), 5), equalTo<Int>(4))
    }

    @Test
    fun maxScore2() {
        assertThat<Int>(Solution().maxScore(intArrayOf(1, 2, 3), 4), equalTo<Int>(3))
    }

    @Test
    fun maxScore3() {
        assertThat<Int>(Solution().maxScore(intArrayOf(2, 2), 1), equalTo<Int>(1))
    }

    @Test
    fun maxScore4() {
        assertThat<Int>(Solution().maxScore(intArrayOf(4, 6), 7), equalTo<Int>(6))
    }

    @Test
    fun maxScore5() {
        assertThat<Int>(Solution().maxScore(intArrayOf(10, 8), 5), equalTo<Int>(9))
    }
}
