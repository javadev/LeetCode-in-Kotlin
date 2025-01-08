package g3401_3500.s3412_find_mirror_score_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calculateScore() {
        assertThat<Long>(Solution().calculateScore("aczzx"), equalTo<Long>(5L))
    }

    @Test
    fun calculateScore2() {
        assertThat<Long>(Solution().calculateScore("abcdef"), equalTo<Long>(0L))
    }
}
