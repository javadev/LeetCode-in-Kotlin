package g1601_1700.s1669_merge_in_between_linked_lists

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeInBetween() {
        val list1 = contructLinkedList(intArrayOf(0, 1, 2, 3, 4, 5))
        val list2 = contructLinkedList(intArrayOf(1000000, 1000001, 1000002))
        val expected = contructLinkedList(intArrayOf(0, 1, 2, 1000000, 1000001, 1000002, 5))
        val actual = Solution().mergeInBetween(list1, 3, 4, list2)
        assertThat(actual.toString(), equalTo(expected.toString()))
    }

    @Test
    fun mergeInBetween2() {
        val list1 = contructLinkedList(intArrayOf(0, 1, 2, 3, 4, 5, 6))
        val list2 = contructLinkedList(intArrayOf(1000000, 1000001, 1000002, 1000003, 1000004))
        val expected = contructLinkedList(intArrayOf(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6))
        val actual = Solution().mergeInBetween(list1, 2, 5, list2)
        assertThat(actual.toString(), equalTo(expected.toString()))
    }
}
