package g3801_3900.s3824_minimum_k_to_reduce_array_within_limit

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumK() {
        assertThat<Int>(Solution().minimumK(intArrayOf(3, 7, 5)), equalTo<Int>(3))
    }

    @Test
    fun minimumK2() {
        assertThat<Int>(Solution().minimumK(intArrayOf(1)), equalTo<Int>(1))
    }

    @Test
    fun minimumK3() {
        // Single element of value 10: ceil(10/k) <= k => k >= 4 (since 10/4=3 ceil 3, +1 length=4
        // <= 16)
        // Actually: nonPositive = 1 + ceil((10-1)/k+? ); test with simple expected
        assertThat<Int>(Solution().minimumK(intArrayOf(10)), equalTo<Int>(3))
    }

    @Test
    fun minimumK4() {
        // Array of all ones: sum = n, each (1-1)/k = 0, so nonPositive = n. Need n <= k*k
        // n=4 -> k>=2
        assertThat<Int>(Solution().minimumK(intArrayOf(1, 1, 1, 1)), equalTo<Int>(2))
    }

    @Test
    fun minimumK5() {
        // n=9, need k*k >= 9, k>=3
        assertThat<Int>(
            Solution().minimumK(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minimumK6() {
        assertThat<Int>(Solution().minimumK(intArrayOf(1, 1)), equalTo<Int>(2))
    }

    @Test
    fun minimumK7() {
        // Two elements of 1000000
        // n=2, need: 2 + 2*ceil(999999/k) <= k*k
        // k=126: 2 + 2*ceil(999999/126)=2+2*7937=15876, k*k=15876 -> exactly equal
        assertThat<Int>(
            Solution().minimumK(intArrayOf(1000000, 1000000)),
            equalTo<Int>(126),
        )
    }

    @Test
    fun minimumK8() {
        assertThat<Int>(Solution().minimumK(intArrayOf(2, 3, 4, 5)), equalTo<Int>(3))
    }

    @Test
    fun minimumK9() {
        assertThat<Int>(Solution().minimumK(intArrayOf(5, 5, 5)), equalTo<Int>(3))
    }

    @Test
    fun minimumK10() {
        val nums = IntArray(100)
        for (i in 0..99) {
            nums[i] = 1
        }
        // n=100, need k*k >= 100, k>=10
        assertThat<Int>(Solution().minimumK(nums), equalTo<Int>(10))
    }

    @Test
    fun minimumK11() {
        val nums = IntArray(50)
        for (i in 0..49) {
            nums[i] = i + 1
        }
        assertThat<Int>(Solution().minimumK(nums), equalTo<Int>(12))
    }

    @Test
    fun minimumK12() {
        // n=1, val=2: nonPositive=1+ceil(1/k). Need <= k*k. k=2: 1+1=2 <=4 yes. k=1: 1+1=2 <=1? No
        assertThat<Int>(Solution().minimumK(intArrayOf(2)), equalTo<Int>(2))
    }

    @Test
    fun minimumK13() {
        assertThat<Int>(
            Solution().minimumK(intArrayOf(100, 200, 300, 400, 500)),
            equalTo<Int>(12),
        )
    }

    @Test
    fun minimumK14() {
        // single element with max int-like value
        val nums = intArrayOf(1000000)
        // need 1 + ceil(999999/k) <= k*k
        // k=100: 1 + 10000 = 10001, k*k=10000 -> no
        // k=101: 1 + ceil(999999/101)=1+9901=9902, k*k=10201 -> yes
        assertThat<Int>(Solution().minimumK(nums), equalTo<Int>(100))
    }

    @Test
    fun minimumK15() {
        // n=3, need k*k >= 3, k>=2
        assertThat<Int>(Solution().minimumK(intArrayOf(1, 1, 1)), equalTo<Int>(2))
    }

    @Test
    fun minimumK16() {
        assertThat<Int>(Solution().minimumK(intArrayOf(1, 2)), equalTo<Int>(2))
    }
}
