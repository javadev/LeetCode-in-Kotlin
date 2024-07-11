package g3201_3300.s3208_alternating_groups_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfAlternatingGroups() {
        assertThat(
            Solution().numberOfAlternatingGroups(intArrayOf(0, 1, 0, 1, 0), 3), equalTo(3)
        )
    }

    @Test
    fun numberOfAlternatingGroups2() {
        assertThat(
            Solution().numberOfAlternatingGroups(intArrayOf(0, 1, 0, 0, 1, 0, 1), 6),
            equalTo(2)
        )
    }

    @Test
    fun numberOfAlternatingGroups3() {
        assertThat(
            Solution().numberOfAlternatingGroups(intArrayOf(1, 1, 0, 1), 4),
            equalTo(0)
        )
    }
}
