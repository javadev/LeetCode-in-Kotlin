package g2101_2200.s2196_create_binary_tree_from_descriptions

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createBinaryTree() {
        MatcherAssert.assertThat(
            Solution()
                .createBinaryTree(
                    arrayOf(
                        intArrayOf(20, 15, 1),
                        intArrayOf(20, 17, 0),
                        intArrayOf(50, 20, 1),
                        intArrayOf(50, 80, 0),
                        intArrayOf(80, 19, 1)
                    )
                )
                .toString(),
            CoreMatchers.equalTo("50,20,15,17,80,19,null")
        )
    }

    @Test
    fun createBinaryTree2() {
        MatcherAssert.assertThat(
            Solution()
                .createBinaryTree(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 3, 0), intArrayOf(3, 4, 1)))
                .toString(),
            CoreMatchers.equalTo("1,2,null,3,4,null,null")
        )
    }
}
