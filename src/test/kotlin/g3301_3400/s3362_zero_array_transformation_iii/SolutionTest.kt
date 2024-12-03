package g3301_3400.s3362_zero_array_transformation_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRemoval() {
        assertThat<Int>(
            Solution()
                .maxRemoval(
                    intArrayOf(2, 0, 2),
                    arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(0, 2), intArrayOf(1, 1)),
                ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun maxRemoval2() {
        assertThat<Int>(
            Solution()
                .maxRemoval(
                    intArrayOf(1, 1, 1, 1),
                    arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2)),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxRemoval3() {
        assertThat<Int>(
            Solution().maxRemoval(intArrayOf(1, 2, 3, 4), arrayOf<IntArray>(intArrayOf(0, 3))),
            equalTo<Int>(-1),
        )
    }
}
