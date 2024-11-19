package g2101_2200.s2196_create_binary_tree_from_descriptions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createBinaryTree() {
        assertThat(
            Solution()
                .createBinaryTree(
                    arrayOf(
                        intArrayOf(20, 15, 1),
                        intArrayOf(20, 17, 0),
                        intArrayOf(50, 20, 1),
                        intArrayOf(50, 80, 0),
                        intArrayOf(80, 19, 1),
                    ),
                )
                .toString(),
            equalTo("50,20,15,17,80,19,null"),
        )
    }

    @Test
    fun createBinaryTree2() {
        assertThat(
            Solution()
                .createBinaryTree(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 3, 0), intArrayOf(3, 4, 1)))
                .toString(),
            equalTo("1,2,null,3,4,null,null"),
        )
    }
}
