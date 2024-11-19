package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxHappyGroups() {
        assertThat(Solution().maxHappyGroups(3, intArrayOf(1, 2, 3, 4, 5, 6)), equalTo(4))
    }

    @Test
    fun maxHappyGroups2() {
        assertThat(
            Solution().maxHappyGroups(4, intArrayOf(1, 3, 2, 5, 2, 2, 1, 6)),
            equalTo(4),
        )
    }
}
