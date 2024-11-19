package g1101_1200.s1200_minimum_absolute_difference

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAbsDifference() {
        assertThat(
            Solution().minimumAbsDifference(intArrayOf(4, 2, 1, 3)),
            equalTo(getLists(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4)))),
        )
    }

    @Test
    fun minimumAbsDifference2() {
        assertThat(
            Solution().minimumAbsDifference(intArrayOf(1, 3, 6, 10, 15)),
            equalTo(getLists(arrayOf(intArrayOf(1, 3)))),
        )
    }

    @Test
    fun minimumAbsDifference3() {
        assertThat(
            Solution().minimumAbsDifference(intArrayOf(3, 8, -10, 23, 19, -4, -14, 27)),
            equalTo(getLists(arrayOf(intArrayOf(-14, -10), intArrayOf(19, 23), intArrayOf(23, 27)))),
        )
    }
}
