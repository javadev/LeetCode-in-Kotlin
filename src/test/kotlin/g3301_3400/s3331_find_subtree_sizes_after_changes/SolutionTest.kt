package g3301_3400.s3331_find_subtree_sizes_after_changes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSubtreeSizes() {
        assertThat<IntArray>(
            Solution().findSubtreeSizes(intArrayOf(-1, 0, 0, 1, 1, 1), "abaabc"),
            equalTo<IntArray>(intArrayOf(6, 3, 1, 1, 1, 1)),
        )
    }

    @Test
    fun findSubtreeSizes2() {
        assertThat<IntArray>(
            Solution().findSubtreeSizes(intArrayOf(-1, 0, 4, 0, 1), "abbba"),
            equalTo<IntArray>(intArrayOf(5, 2, 1, 1, 1)),
        )
    }
}
