package g0101_0200.s0138_copy_list_with_random_pointer

import com_github_leetcode.random.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun copyRandomList() {
        val node7 = Node(7)
        val node13 = Node(13)
        val node11 = Node(11)
        val node10 = Node(10)
        val node1 = Node(1)
        node7.next = node13
        node13.next = node11
        node11.next = node10
        node10.next = node1
        node1.next = null
        node7.random = null
        node13.random = node7
        node11.random = node1
        node10.random = node11
        node1.random = node7
        assertThat(
            Solution().copyRandomList(node7).toString(),
            equalTo("[[7,null],[13,0],[11,4],[10,2],[1,0]]"),
        )
    }

    @Test
    fun copyRandomList2() {
        val node1 = Node(1)
        val node2 = Node(2)
        node1.next = node2
        node1.random = node1
        node2.next = null
        node2.random = node2
        assertThat(
            Solution().copyRandomList(node1).toString(),
            equalTo("[[1,1],[2,1]]"),
        )
    }

    @Test
    fun copyRandomList3() {
        val node31 = Node(3)
        val node32 = Node(3)
        val node33 = Node(3)
        node31.next = node32
        node31.random = null
        node32.next = node33
        node32.random = node31
        node33.next = null
        node33.random = null
        assertThat(
            Solution().copyRandomList(node31).toString(),
            equalTo("[[3,null],[3,0],[3,null]]"),
        )
    }
}
