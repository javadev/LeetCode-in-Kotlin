package g3801_3900.s3870_count_commas_in_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCommas() {
        assertThat<Int>(Solution().countCommas(998), equalTo<Int>(0))
    }

    @Test
    fun countCommas2() {
        assertThat<Int>(Solution().countCommas(1002), equalTo<Int>(3))
    }

    @Test
    fun countCommas3() {
        assertThat<Int>(Solution().countCommas(100000), equalTo<Int>(99001))
    }
}
