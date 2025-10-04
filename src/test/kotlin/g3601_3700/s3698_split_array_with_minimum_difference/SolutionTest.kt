package g3601_3700.s3698_split_array_with_minimum_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitArray() {
        assertThat<Long>(Solution().splitArray(intArrayOf(1, 3, 2)), equalTo<Long>(2L))
    }

    @Test
    fun splitArray2() {
        assertThat<Long>(Solution().splitArray(intArrayOf(1, 2, 4, 3)), equalTo<Long>(4L))
    }

    @Test
    fun splitArray3() {
        assertThat<Long>(Solution().splitArray(intArrayOf(3, 1, 2)), equalTo<Long>(-1L))
    }

    @Test
    fun splitArray4() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(5L))
    }

    @Test
    fun splitArray5() {
        val nums = intArrayOf(10)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(10L))
    }

    @Test
    fun splitArray6() {
        val nums = intArrayOf(3, 7)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(4L))
    }

    @Test
    fun splitArray7() {
        val nums = intArrayOf(1, 2, 2, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(0L))
    }

    @Test
    fun splitArray8() {
        val nums = intArrayOf(1, 3, 2, 0)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(2L))
    }

    @Test
    fun splitArray9() {
        val nums = intArrayOf(1, 2, 1, 3)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(-1L))
    }

    @Test
    fun splitArray10() {
        val nums = intArrayOf(2, 4, 3, 1, 2)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(-1L))
    }

    @Test
    fun splitArray11() {
        val nums = intArrayOf(1, 2, 5, 4, 3)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(1L))
    }

    @Test
    fun splitArray12() {
        val nums = intArrayOf(5, 10, 2, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(8L))
    }

    @Test
    fun splitArray13() {
        val nums = intArrayOf(2, 3, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(2L))
    }

    @Test
    fun splitArray14() {
        val nums = intArrayOf(10, 20, 15, 5)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(10L))
    }

    @Test
    fun splitArray15() {
        val nums = intArrayOf(5, 4, 3, 2, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(5L))
    }

    @Test
    fun splitArray16() {
        val nums = intArrayOf(3, 3, 3, 2, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(-1L))
    }

    @Test
    fun splitArray17() {
        val nums = intArrayOf(1, 0)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(1L))
    }

    @Test
    fun splitArray18() {
        val nums = intArrayOf(2, 4, 4, 2)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(0L))
    }

    @Test
    fun splitArray19() {
        val nums = intArrayOf(1, 10, 9, 8, 7)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(13L))
    }

    @Test
    fun splitArray20() {
        val nums = intArrayOf(1, 3, 2, 4, 1)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(-1L))
    }

    @Test
    fun splitArray21() {
        val nums = intArrayOf(5, 5, 4, 3)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(7L))
    }

    @Test
    fun splitArray22() {
        val nums = intArrayOf(100, 200, 10, 5)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(115L))
    }

    @Test
    fun splitArray23() {
        val nums = intArrayOf(3, 5, 2)
        assertThat<Long>(Solution().splitArray(nums), equalTo<Long>(4L))
    }
}
