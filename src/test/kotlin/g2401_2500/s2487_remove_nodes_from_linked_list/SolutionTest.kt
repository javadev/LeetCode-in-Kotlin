package g2401_2500.s2487_remove_nodes_from_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeNodes() {
        assertThat(
            Solution()
                .removeNodes(contructLinkedList(intArrayOf(5, 2, 13, 3, 8)))
                .toString(),
            equalTo(contructLinkedList(intArrayOf(13, 8)).toString()),
        )
    }

    @Test
    fun removeNodes2() {
        assertThat(
            Solution()
                .removeNodes(contructLinkedList(intArrayOf(1, 1, 1, 1)))
                .toString(),
            equalTo(contructLinkedList(intArrayOf(1, 1, 1, 1)).toString()),
        )
    }
}
