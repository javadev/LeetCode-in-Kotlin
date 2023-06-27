package g0801_0900.s0839_similar_string_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSimilarGroups() {
        assertThat(
            Solution().numSimilarGroups(arrayOf("tars", "rats", "arts", "star")),
            equalTo(2)
        )
    }

    @Test
    fun numSimilarGroups2() {
        assertThat(Solution().numSimilarGroups(arrayOf("omv", "ovm")), equalTo(1))
    }
}
