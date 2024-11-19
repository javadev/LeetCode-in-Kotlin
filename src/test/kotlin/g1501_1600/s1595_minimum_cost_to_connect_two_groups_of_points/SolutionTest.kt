package g1501_1600.s1595_minimum_cost_to_connect_two_groups_of_points

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun connectTwoGroups() {
        assertThat(
            Solution()
                .connectTwoGroups(getLists(arrayOf(intArrayOf(15, 96), intArrayOf(36, 2)))),
            equalTo(17),
        )
    }

    @Test
    fun connectTwoGroups2() {
        assertThat(
            Solution()
                .connectTwoGroups(
                    getLists(arrayOf(intArrayOf(1, 3, 5), intArrayOf(4, 1, 1), intArrayOf(1, 5, 3))),
                ),
            equalTo(4),
        )
    }

    @Test
    fun connectTwoGroups3() {
        assertThat(
            Solution()
                .connectTwoGroups(
                    getLists(
                        arrayOf(
                            intArrayOf(2, 5, 1),
                            intArrayOf(3, 4, 7),
                            intArrayOf(8, 1, 2),
                            intArrayOf(6, 2, 4),
                            intArrayOf(3, 8, 8),
                        ),
                    ),
                ),
            equalTo(10),
        )
    }
}
