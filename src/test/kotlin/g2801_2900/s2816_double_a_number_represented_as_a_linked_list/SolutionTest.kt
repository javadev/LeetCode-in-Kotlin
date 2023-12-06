package g2801_2900.s2816_double_a_number_represented_as_a_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Medium #Math #Stack #Linked_List
internal class SolutionTest {
    @Test
    fun doubleIt() {
        assertThat(
            Solution()
                .doubleIt(contructLinkedList(intArrayOf(1, 8, 9)))
                .toString(),
            equalTo("3, 7, 8")
        )
    }

    @Test
    fun doubleIt2() {
        assertThat(
            Solution()
                .doubleIt(contructLinkedList(intArrayOf(9, 9, 9)))
                .toString(),
            equalTo("1, 9, 9, 8")
        )
    }
}
