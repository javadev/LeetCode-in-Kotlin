package g2101_2200.s2130_maximum_twin_sum_of_a_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pairSum() {
        assertThat(
            Solution().pairSum(contructLinkedList(intArrayOf(5, 4, 2, 1))),
            equalTo(6),
        )
    }

    @Test
    fun pairSum2() {
        assertThat(
            Solution().pairSum(contructLinkedList(intArrayOf(4, 2, 2, 3))),
            equalTo(7),
        )
    }

    @Test
    fun pairSum3() {
        assertThat(
            Solution().pairSum(contructLinkedList(intArrayOf(1, 100000))),
            equalTo(100001),
        )
    }
}
