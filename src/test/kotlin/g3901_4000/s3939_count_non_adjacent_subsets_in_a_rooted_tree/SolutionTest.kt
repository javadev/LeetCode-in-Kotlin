package g3901_4000.s3939_count_non_adjacent_subsets_in_a_rooted_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.*

internal class SolutionTest {
    @Test
    fun countValidSubsets8() {
        val parent = IntArray(32)
        parent[0] = -1
        val nums = IntArray(32)
        Arrays.fill(nums, 1)
        // Any non-empty leaf subset or the root alone: 2^31 subsets modulo 1_000_000_007.
        assertThat<Int>(
            Solution().countValidSubsets(parent, nums, 1),
            equalTo<Int>(147483634),
        )
    }

    @Test
    fun countValidSubsets() {
        assertThat<Int>(
            Solution().countValidSubsets(intArrayOf(-1, 0, 1), intArrayOf(1, 2, 3), 3),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countValidSubsets2() {
        assertThat<Int>(
            Solution()
                .countValidSubsets(intArrayOf(-1, 0, 0, 0), intArrayOf(2, 1, 2, 1), 3),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countValidSubsets3() {
        assertThat<Int>(
            Solution().countValidSubsets(intArrayOf(-1), intArrayOf(6), 3),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countValidSubsets4() {
        assertThat<Int>(
            Solution().countValidSubsets(intArrayOf(-1), intArrayOf(5), 3),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countValidSubsets5() {
        assertThat<Int>(
            Solution().countValidSubsets(intArrayOf(-1, 0, 1), intArrayOf(1, 1, 1), 1),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countValidSubsets6() {
        assertThat<Int>(
            Solution()
                .countValidSubsets(intArrayOf(-1, 0, 0, 0), intArrayOf(1, 1, 1, 1), 1),
            equalTo<Int>(8),
        )
    }

    @Test
    fun countValidSubsets7() {
        assertThat<Int>(
            Solution().countValidSubsets(intArrayOf(-1, 0), intArrayOf(1, 2), 3),
            equalTo<Int>(0),
        )
    }
}
