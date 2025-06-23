package g3501_3600.s3590_kth_smallest_path_xor_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallest() {
        assertThat<IntArray>(
            Solution()
                .kthSmallest(
                    intArrayOf(-1, 0, 0),
                    intArrayOf(1, 1, 1),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3)),
                ),
            equalTo<IntArray>(intArrayOf(0, 1, -1)),
        )
    }

    @Test
    fun kthSmallest2() {
        assertThat<IntArray>(
            Solution()
                .kthSmallest(
                    intArrayOf(-1, 0, 1),
                    intArrayOf(5, 2, 7),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 1)),
                ),
            equalTo<IntArray>(intArrayOf(0, 7, -1, 0)),
        )
    }
}
