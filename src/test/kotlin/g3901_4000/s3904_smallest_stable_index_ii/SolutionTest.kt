package g3901_4000.s3904_smallest_stable_index_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstStableIndex() {
        assertThat<Int>(
            Solution().firstStableIndex(intArrayOf(5, 0, 1, 4), 3),
            equalTo<Int>(3),
        )
    }

    @Test
    fun firstStableIndex2() {
        assertThat<Int>(
            Solution().firstStableIndex(intArrayOf(3, 2, 1), 1),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun firstStableIndex3() {
        assertThat<Int>(Solution().firstStableIndex(intArrayOf(0), 0), equalTo<Int>(0))
    }

    @Test
    fun firstStableIndex4() {
        assertThat<Int>(
            Solution().firstStableIndex(intArrayOf(1, 2, 3), 0),
            equalTo<Int>(0),
        )
    }

    @Test
    fun firstStableIndex5() {
        assertThat<Int>(
            Solution().firstStableIndex(intArrayOf(5, 0, 1, 4), 4),
            equalTo<Int>(2),
        )
    }

    @Test
    fun firstStableIndex6() {
        assertThat<Int>(
            Solution().firstStableIndex(intArrayOf(1000000000, 0), 1000000000),
            equalTo<Int>(0),
        )
    }
}
