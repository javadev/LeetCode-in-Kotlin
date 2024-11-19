package g0101_0200.s0147_insertion_sort_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun insertionSortList() {
        val listNode1 = ListNode(4)
        listNode1.next = ListNode(2)
        listNode1.next!!.next = ListNode(1)
        listNode1.next!!.next!!.next = ListNode(3)
        assertThat(Solution().insertionSortList(listNode1).toString(), equalTo("1, 2, 3, 4"))
    }

    @Test
    fun insertionSortList2() {
        val listNode1 = ListNode(-1)
        listNode1.next = ListNode(5)
        listNode1.next!!.next = ListNode(3)
        listNode1.next!!.next!!.next = ListNode(4)
        listNode1.next!!.next!!.next!!.next = ListNode(0)
        assertThat(
            Solution().insertionSortList(listNode1).toString(),
            equalTo("-1, 0, 3, 4, 5"),
        )
    }
}
