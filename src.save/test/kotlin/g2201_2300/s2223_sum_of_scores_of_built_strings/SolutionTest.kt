package g2201_2300.s2223_sum_of_scores_of_built_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumScores() {
        assertThat(Solution().sumScores("babab"), equalTo(9L))
    }

    @Test
    fun sumScores2() {
        assertThat(Solution().sumScores("azbazbzaz"), equalTo(14L))
    }
}
