package g0301_0400.s0382_linked_list_random_node

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun solutionTest() {
        val result: MutableList<Int> = ArrayList()
        val listNode3 = ListNode(3)
        val listNode2 = ListNode(2, listNode3)
        val listNode = ListNode(1, listNode2)
        val solution = Solution(listNode)
        result.add(solution.getRandom())
        result.add(solution.getRandom())
        result.add(solution.getRandom())
        result.add(solution.getRandom())
        result.add(solution.getRandom())
        var contain = true
        val expected: List<Int> = ArrayList(Arrays.asList(1, 2, 3))
        for (i in result) {
            if (!expected.contains(i)) {
                contain = false
                break
            }
        }
        assertThat(contain, equalTo(true))
    }
}
