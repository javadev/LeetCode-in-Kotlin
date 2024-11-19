package g2301_2400.s2326_spiral_matrix_iv

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun spiralMatrix() {
        val listNode = contructLinkedList(intArrayOf(3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0))
        assertThat(
            Solution().spiralMatrix(3, 5, listNode),
            equalTo(
                arrayOf(
                    intArrayOf(3, 0, 2, 6, 8),
                    intArrayOf(5, 0, -1, -1, 1),
                    intArrayOf(5, 2, 4, 9, 7),
                ),
            ),
        )
    }

    @Test
    fun spiralMatrix2() {
        val listNode = contructLinkedList(intArrayOf(0, 1, 2))
        assertThat(
            Solution().spiralMatrix(1, 4, listNode),
            equalTo(arrayOf(intArrayOf(0, 1, 2, -1))),
        )
    }
}
