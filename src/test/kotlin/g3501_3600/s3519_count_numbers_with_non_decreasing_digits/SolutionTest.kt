package g3501_3600.s3519_count_numbers_with_non_decreasing_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNumbers() {
        assertThat<Int>(Solution().countNumbers("23", "28", 8), equalTo<Int>(3))
    }

    @Test
    fun countNumbers2() {
        assertThat<Int>(Solution().countNumbers("2", "7", 2), equalTo<Int>(2))
    }
}
