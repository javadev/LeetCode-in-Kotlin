package g3501_3600.s3569_maximize_count_of_distinct_primes_after_split

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumCount() {
        assertThat<IntArray>(
            Solution()
                .maximumCount(intArrayOf(2, 1, 3, 1, 2), arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 3))),
            equalTo<IntArray>(intArrayOf(3, 4)),
        )
    }

    @Test
    fun maximumCount2() {
        assertThat<IntArray>(
            Solution().maximumCount(intArrayOf(2, 1, 4), arrayOf<IntArray>(intArrayOf(0, 1))),
            equalTo<IntArray>(intArrayOf(0)),
        )
    }

    @Test
    fun maximumCount3() {
        assertThat<IntArray>(
            Solution().maximumCount(intArrayOf(2, 34), arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(1, 3))),
            equalTo<IntArray>(intArrayOf(2, 2)),
        )
    }

    @Test
    fun maximumCount4() {
        assertThat<IntArray>(
            Solution().maximumCount(intArrayOf(4, 2), arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(0, 2))),
            equalTo<IntArray>(intArrayOf(2, 2)),
        )
    }
}
