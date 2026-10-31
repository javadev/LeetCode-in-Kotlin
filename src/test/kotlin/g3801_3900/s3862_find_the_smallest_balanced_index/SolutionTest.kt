package g3801_3900.s3862_find_the_smallest_balanced_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestBalancedIndex() {
        assertThat<Int>(
            Solution().smallestBalancedIndex(intArrayOf(2, 1, 2)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun smallestBalancedIndex2() {
        assertThat<Int>(
            Solution().smallestBalancedIndex(intArrayOf(2, 8, 2, 2, 5)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun smallestBalancedIndex3() {
        assertThat<Int>(Solution().smallestBalancedIndex(intArrayOf(1)), equalTo<Int>(-1))
    }
}
