package g3001_3100.s3098_find_the_sum_of_subsequence_powers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfPowers() {
        assertThat(Solution().sumOfPowers(intArrayOf(1, 2, 3, 4), 3), equalTo(4))
    }

    @Test
    fun sumOfPowers2() {
        assertThat(Solution().sumOfPowers(intArrayOf(2, 2), 2), equalTo(0))
    }

    @Test
    fun sumOfPowers3() {
        assertThat(Solution().sumOfPowers(intArrayOf(4, 3, -1), 2), equalTo(10))
    }
}
