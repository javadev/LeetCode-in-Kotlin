package g2701_2800.s2790_maximum_number_of_groups_with_increasing_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxIncreasingGroups() {
        assertThat(Solution().maxIncreasingGroups(listOf(1, 2, 5)), equalTo(3))
    }

    @Test
    fun maxIncreasingGroups2() {
        assertThat(Solution().maxIncreasingGroups(listOf(2, 1, 2)), equalTo(2))
    }
}
