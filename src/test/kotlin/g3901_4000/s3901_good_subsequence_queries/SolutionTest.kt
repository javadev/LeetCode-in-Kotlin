package g3901_4000.s3901_good_subsequence_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodSubseq() {
        val nums = IntArray(21)
        nums.fill(2)
        assertThat<Int>(
            Solution().countGoodSubseq(nums, 2, arrayOf<IntArray>(intArrayOf(0, 4), intArrayOf(20, 3))),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countGoodSubseq2() {
        assertThat<Int>(
            Solution()
                .countGoodSubseq(intArrayOf(4, 8, 12, 16), 2, arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(2, 6))),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countGoodSubseq3() {
        assertThat<Int>(
            Solution()
                .countGoodSubseq(
                    intArrayOf(4, 5, 7, 8),
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 6), intArrayOf(1, 9), intArrayOf(2, 3)),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countGoodSubseq4() {
        assertThat<Int>(
            Solution()
                .countGoodSubseq(intArrayOf(5, 7, 9), 2, arrayOf<IntArray>(intArrayOf(1, 4), intArrayOf(2, 8))),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countGoodSubseq5() {
        assertThat<Int>(
            Solution().countGoodSubseq(intArrayOf(6, 10, 15), 1, arrayOf<IntArray>(intArrayOf(0, 6))),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countGoodSubseq6() {
        assertThat<Int>(
            Solution()
                .countGoodSubseq(
                    intArrayOf(2, 4),
                    2,
                    arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 5), intArrayOf(0, 2)),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countGoodSubseq7() {
        assertThat<Int>(
            Solution().countGoodSubseq(intArrayOf(6, 10, 14), 2, arrayOf<IntArray>(intArrayOf(0, 6))),
            equalTo<Int>(1),
        )
    }
}
