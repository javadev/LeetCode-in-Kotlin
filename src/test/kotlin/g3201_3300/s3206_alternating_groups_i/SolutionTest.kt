package g3201_3300.s3206_alternating_groups_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfAlternatingGroups() {
        assertThat(Solution().numberOfAlternatingGroups(intArrayOf(1, 1, 1)), equalTo(0))
    }

    @Test
    fun numberOfAlternatingGroups2() {
        assertThat(
            Solution().numberOfAlternatingGroups(intArrayOf(0, 1, 0, 0, 1)),
            equalTo(3),
        )
    }
}
