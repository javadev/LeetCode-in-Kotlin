package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decimalValue() {
        val listNode = ListNode(1, ListNode(0, ListNode(1)))
        assertThat(Solution().getDecimalValue(listNode), equalTo(5))
    }

    @Test
    fun decimalValue2() {
        val listNode = ListNode(0)
        assertThat(Solution().getDecimalValue(listNode), equalTo(0))
    }
}
