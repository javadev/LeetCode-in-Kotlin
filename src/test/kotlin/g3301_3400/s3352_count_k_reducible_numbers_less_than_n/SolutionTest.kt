package g3301_3400.s3352_count_k_reducible_numbers_less_than_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKReducibleNumbers() {
        assertThat<Int>(Solution().countKReducibleNumbers("111", 1), equalTo<Int>(3))
    }

    @Test
    fun countKReducibleNumbers2() {
        assertThat<Int>(Solution().countKReducibleNumbers("1000", 2), equalTo<Int>(6))
    }

    @Test
    fun countKReducibleNumbers3() {
        assertThat<Int>(Solution().countKReducibleNumbers("1", 3), equalTo<Int>(0))
    }
}
