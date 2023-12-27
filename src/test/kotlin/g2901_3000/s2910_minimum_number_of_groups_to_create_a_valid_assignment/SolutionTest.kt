package g2901_3000.s2910_minimum_number_of_groups_to_create_a_valid_assignment

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minGroupsForValidAssignment() {
        assertThat(
            Solution().minGroupsForValidAssignment(intArrayOf(3, 2, 3, 2, 3)), equalTo(2)
        )
    }

    @Test
    fun minGroupsForValidAssignment2() {
        assertThat(
            Solution().minGroupsForValidAssignment(intArrayOf(10, 10, 10, 3, 1, 1)),
            equalTo(4)
        )
    }
}
