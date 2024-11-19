package g3201_3300.s3217_delete_nodes_from_linked_list_present_in_array

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun modifiedList() {
        assertThat(
            Solution()
                .modifiedList(
                    intArrayOf(1, 2, 3),
                    contructLinkedList(intArrayOf(1, 2, 3, 4, 5)),
                )
                .toString(),
            equalTo("4, 5"),
        )
    }

    @Test
    fun modifiedList2() {
        assertThat(
            Solution()
                .modifiedList(
                    intArrayOf(1),
                    contructLinkedList(intArrayOf(1, 2, 1, 2, 1, 2)),
                )
                .toString(),
            equalTo("2, 2, 2"),
        )
    }

    @Test
    fun modifiedList3() {
        assertThat(
            Solution()
                .modifiedList(
                    intArrayOf(5),
                    contructLinkedList(intArrayOf(1, 2, 3, 4)),
                )
                .toString(),
            equalTo("1, 2, 3, 4"),
        )
    }
}
