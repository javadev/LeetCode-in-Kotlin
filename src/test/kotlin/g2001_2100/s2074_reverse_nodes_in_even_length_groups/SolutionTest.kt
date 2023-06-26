package g2001_2100.s2074_reverse_nodes_in_even_length_groups

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseEvenLengthGroups() {
        val head = contructLinkedList(intArrayOf(5, 2, 6, 3, 9, 1, 7, 3, 8, 4))
        assertThat(
            Solution().reverseEvenLengthGroups(head).toString(),
            equalTo("5, 6, 2, 3, 9, 1, 4, 8, 3, 7")
        )
    }

    @Test
    fun reverseEvenLengthGroups2() {
        val head = contructLinkedList(intArrayOf(1, 1, 0, 6))
        assertThat(
            Solution().reverseEvenLengthGroups(head).toString(),
            equalTo("1, 0, 1, 6")
        )
    }

    @Test
    fun reverseEvenLengthGroups3() {
        val head = contructLinkedList(intArrayOf(1, 1, 0, 6, 5))
        assertThat(
            Solution().reverseEvenLengthGroups(head).toString(), equalTo("1, 0, 1, 5, 6")
        )
    }
}
