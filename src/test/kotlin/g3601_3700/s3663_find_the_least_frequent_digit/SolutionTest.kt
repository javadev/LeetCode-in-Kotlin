package g3601_3700.s3663_find_the_least_frequent_digit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getLeastFrequentDigit() {
        assertThat<Int>(Solution().getLeastFrequentDigit(1553322), equalTo<Int>(1))
    }

    @Test
    fun getLeastFrequentDigit2() {
        assertThat<Int>(Solution().getLeastFrequentDigit(723344511), equalTo<Int>(2))
    }
}
