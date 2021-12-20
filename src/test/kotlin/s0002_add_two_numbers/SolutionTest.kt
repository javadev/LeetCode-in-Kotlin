package s0002_add_two_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun addTwoNumbers() {
        val listNode1 = ListNode(2)
        listNode1.next = ListNode(4)
        listNode1.next?.next = ListNode(3)
        val listNode2 = ListNode(5)
        listNode2.next = ListNode(6)
        listNode2.next?.next = ListNode(4)
        assertThat(Solution().addTwoNumbers(listNode1, listNode2).toString(), equalTo("7, 0, 8"))
    }
}
