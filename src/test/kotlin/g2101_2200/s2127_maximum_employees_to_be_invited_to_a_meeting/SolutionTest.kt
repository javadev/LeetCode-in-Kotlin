package g2101_2200.s2127_maximum_employees_to_be_invited_to_a_meeting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumInvitations() {
        assertThat(Solution().maximumInvitations(intArrayOf(2, 2, 1, 2)), equalTo(3))
    }

    @Test
    fun maximumInvitations2() {
        assertThat(Solution().maximumInvitations(intArrayOf(1, 2, 0)), equalTo(3))
    }

    @Test
    fun maximumInvitations3() {
        assertThat(Solution().maximumInvitations(intArrayOf(3, 0, 1, 4, 1)), equalTo(4))
    }
}
