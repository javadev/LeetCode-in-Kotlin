package g0701_0800.s0725_split_linked_list_in_parts

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitListToParts() {
        val listNode = contructLinkedList(intArrayOf(1, 2, 3))
        val expected = arrayOf(
            contructLinkedList(intArrayOf(1)),
            contructLinkedList(intArrayOf(2)),
            contructLinkedList(intArrayOf(3)),
            contructLinkedList(intArrayOf()),
            contructLinkedList(intArrayOf()),
        )
        assertThat(
            Solution().splitListToParts(listNode, 5).contentToString(),
            equalTo(expected.contentToString()),
        )
    }

    @Test
    fun splitListToParts2() {
        val listNode = contructLinkedList(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        val expected = arrayOf(
            contructLinkedList(intArrayOf(1, 2, 3, 4)),
            contructLinkedList(intArrayOf(5, 6, 7)),
            contructLinkedList(intArrayOf(8, 9, 10)),
        )
        assertThat(
            Solution().splitListToParts(listNode, 3).contentToString(),
            equalTo(expected.contentToString()),
        )
    }
}
