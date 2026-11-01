package g3901_4000.s3932_count_k_th_roots_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKthRoots() {
        assertThat<Int>(Solution().countKthRoots(1, 9, 3), equalTo<Int>(2))
    }

    @Test
    fun countKthRoots2() {
        assertThat<Int>(Solution().countKthRoots(8, 30, 2), equalTo<Int>(3))
    }

    @Test
    fun countKthRoots3() {
        assertThat<Int>(Solution().countKthRoots(0, 0, 30), equalTo<Int>(1))
    }

    @Test
    fun countKthRoots4() {
        assertThat<Int>(
            Solution().countKthRoots(0, 1000000000, 1),
            equalTo<Int>(1000000001),
        )
    }

    @Test
    fun countKthRoots5() {
        assertThat<Int>(Solution().countKthRoots(16, 16, 2), equalTo<Int>(1))
    }

    @Test
    fun countKthRoots6() {
        assertThat<Int>(Solution().countKthRoots(17, 24, 2), equalTo<Int>(0))
    }

    @Test
    fun countKthRoots7() {
        assertThat<Int>(Solution().countKthRoots(0, 1000000000, 30), equalTo<Int>(2))
    }

    @Test
    fun countKthRoots8() {
        assertThat<Int>(
            Solution().countKthRoots(999950884, 1000000000, 2),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countKthRoots9() {
        assertThat<Int>(Solution().countKthRoots(8, 27, 3), equalTo<Int>(2))
    }
}
