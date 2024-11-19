package g2201_2300.s2215_find_the_difference_of_two_arrays

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDifference() {
        assertThat(
            Solution().findDifference(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6)),
            equalTo(getLists(arrayOf(intArrayOf(1, 3), intArrayOf(4, 6)))),
        )
    }

    @Test
    fun findDifference2() {
        assertThat(
            Solution().findDifference(intArrayOf(1, 2, 3, 3), intArrayOf(1, 1, 2, 2)),
            equalTo(getLists(arrayOf(intArrayOf(3), intArrayOf()))),
        )
    }
}
