package g1501_1600.s1519_number_of_nodes_in_the_sub_tree_with_the_same_label

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubTrees() {
        MatcherAssert.assertThat(
            Solution()
                .countSubTrees(
                    7,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(1, 4),
                        intArrayOf(1, 5),
                        intArrayOf(2, 3),
                        intArrayOf(2, 6)
                    ),
                    "abaedcd"
                ),
            CoreMatchers.equalTo(intArrayOf(2, 1, 1, 1, 1, 1, 1))
        )
    }

    @Test
    fun countSubTrees2() {
        MatcherAssert.assertThat(
            Solution().countSubTrees(4, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 3)), "bbbb"),
            CoreMatchers.equalTo(intArrayOf(4, 2, 1, 1))
        )
    }

    @Test
    fun countSubTrees3() {
        MatcherAssert.assertThat(
            Solution()
                .countSubTrees(
                    5,
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 4)),
                    "aabab"
                ),
            CoreMatchers.equalTo(intArrayOf(3, 2, 1, 1, 1))
        )
    }
}
