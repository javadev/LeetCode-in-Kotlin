package g2001_2100.s2071_maximum_number_of_tasks_you_can_assign

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTaskAssign() {
        assertThat(
            Solution().maxTaskAssign(intArrayOf(3, 2, 1), intArrayOf(0, 3, 3), 1, 1),
            equalTo(3),
        )
    }

    @Test
    fun maxTaskAssign2() {
        assertThat(
            Solution().maxTaskAssign(intArrayOf(5, 4), intArrayOf(0, 0, 0), 1, 5),
            equalTo(1),
        )
    }

    @Test
    fun maxTaskAssign3() {
        assertThat(
            Solution()
                .maxTaskAssign(intArrayOf(10, 15, 30), intArrayOf(0, 10, 10, 10, 10), 3, 10),
            equalTo(2),
        )
    }
}
