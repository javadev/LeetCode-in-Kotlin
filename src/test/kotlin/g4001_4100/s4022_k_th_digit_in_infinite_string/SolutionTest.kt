package g4001_4100.s4022_k_th_digit_in_infinite_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthDigit() {
        assertThat<Int>(Solution().kthDigit(1), equalTo<Int>(1))
    }

    @Test
    fun kthDigit2() {
        assertThat<Int>(Solution().kthDigit(9), equalTo<Int>(9))
    }

    @Test
    fun kthDigit3() {
        assertThat<Int>(Solution().kthDigit(10), equalTo<Int>(1))
    }

    @Test
    fun kthDigit4() {
        assertThat<Int>(Solution().kthDigit(11), equalTo<Int>(9))
    }

    @Test
    fun kthDigit5() {
        assertThat<Int>(Solution().kthDigit(15), equalTo<Int>(7))
    }

    @Test
    fun kthDigit6() {
        assertThat<Int>(Solution().kthDigit(19), equalTo<Int>(5))
    }

    @Test
    fun kthDigit7() {
        assertThat<Int>(Solution().kthDigit(20), equalTo<Int>(1))
    }
}
