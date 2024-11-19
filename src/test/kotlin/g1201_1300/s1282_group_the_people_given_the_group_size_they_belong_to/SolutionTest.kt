package g1201_1300.s1282_group_the_people_given_the_group_size_they_belong_to

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun groupThePeople() {
        assertThat(
            Solution().groupThePeople(intArrayOf(3, 3, 3, 3, 3, 1, 3)),
            equalTo(getLists(arrayOf(intArrayOf(5), intArrayOf(0, 1, 2), intArrayOf(3, 4, 6)))),
        )
    }

    @Test
    fun groupThePeople2() {
        assertThat(
            Solution().groupThePeople(intArrayOf(2, 1, 3, 3, 3, 2)),
            equalTo(getLists(arrayOf(intArrayOf(1), intArrayOf(0, 5), intArrayOf(2, 3, 4)))),
        )
    }
}
