package g0201_0300.s0234_palindrome_linked_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPalindrome: Unit
        get() {
            val headActual = ListNode(1)
            headActual.next = ListNode(2)
            headActual.next!!.next = ListNode(2)
            headActual.next!!.next!!.next = ListNode(1)
            assertThat(Solution().isPalindrome(headActual), equalTo(true))
        }

    @get:Test
    val isPalindrome2: Unit
        get() {
            val headActual = ListNode(1)
            headActual.next = ListNode(2)
            assertThat(Solution().isPalindrome(headActual), equalTo(false))
        }
}
