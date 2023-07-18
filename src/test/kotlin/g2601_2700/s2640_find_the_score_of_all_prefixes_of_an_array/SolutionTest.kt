package g2601_2700.s2640_find_the_score_of_all_prefixes_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPrefixScore() {
        assertThat(
            Solution().findPrefixScore(intArrayOf(2, 3, 7, 5, 10)),
            equalTo(
                longArrayOf(4, 10, 24, 36, 56)
            )
        )
    }

    @Test
    fun findPrefixScore2() {
        assertThat(
            Solution().findPrefixScore(intArrayOf(1, 1, 2, 4, 8, 16)),
            equalTo(
                longArrayOf(2, 4, 8, 16, 32, 64)
            )
        )
    }
}
