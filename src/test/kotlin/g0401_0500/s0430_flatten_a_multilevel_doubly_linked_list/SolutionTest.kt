package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list

import com_github_leetcode.prev_next.Node
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flatten() {
        val node1 = Node(1)
        val node2 = Node(2)
        node1.next = node2
        node2.prev = node1
        val node3 = Node(3)
        node2.next = node3
        node3.prev = node2
        val node4 = Node(4)
        node3.next = node4
        node4.prev = node3
        val node5 = Node(5)
        node4.next = node5
        node5.prev = node4
        val node6 = Node(6)
        node5.next = node6
        node6.prev = node5
        val node7 = Node(7)
        node3.child = node7
        val node8 = Node(8)
        node7.next = node8
        node8.prev = node7
        val node9 = Node(9)
        node8.next = node9
        node9.prev = node8
        val node10 = Node(10)
        node9.next = node10
        node10.prev = node9
        val node11 = Node(11)
        node8.child = node11
        val node12 = Node(12)
        node11.next = node12
        node12.prev = node11
        assertThat(
            Solution().flatten(node1).toString(),
            equalTo(
                "Node{val=1,next=Node{" +
                    "val=2,next=Node{val=3,next=Node{val=7,next=Node{val=8,next=Node{val=11,next=" +
                    "Node{val=12,next=Node{val=9,next=Node{val=10,next=Node{val=4,next=Node{val=5" +
                    ",next=Node{val=6,next=null}}}}}}}}}}}}"
            )
        )
    }
}
