package g3901_4000.s3934_smallest_unique_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestUniqueSubarray() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(3, 3, 3)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun smallestUniqueSubarray2() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(2, 1, 2, 3, 3)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun smallestUniqueSubarray3() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(1, 1, 2, 2, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun smallestUniqueSubarray4() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(100000)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun smallestUniqueSubarray5() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(1, 2, 1, 2)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun smallestUniqueSubarray6() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(1, 2, 1, 2, 1, 2)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun smallestUniqueSubarray7() {
        assertThat<Int>(
            Solution().smallestUniqueSubarray(intArrayOf(100000, 1, 100000, 1)),
            equalTo<Int>(2),
        )
    }
}
