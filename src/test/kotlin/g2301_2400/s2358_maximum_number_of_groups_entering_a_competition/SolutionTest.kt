package g2301_2400.s2358_maximum_number_of_groups_entering_a_competition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGroups() {
        assertThat(Solution().maximumGroups(intArrayOf(10, 6, 12, 7, 3, 5)), equalTo(3))
    }

    @Test
    fun maximumGroups2() {
        assertThat(Solution().maximumGroups(intArrayOf(8, 8)), equalTo(1))
    }
}
