package g4001_4100.s4006_count_valid_prefixes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidPrefixes() {
        assertThat<Int>(Solution().countValidPrefixes("00101"), equalTo<Int>(3))
    }

    @Test
    fun countValidPrefixes2() {
        assertThat<Int>(Solution().countValidPrefixes("101"), equalTo<Int>(3))
    }
}
