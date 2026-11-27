package g4001_4100.s4026_maximum_gap_between_stations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGap() {
        assertThat<Int>(Solution().maximumGap("abc", "abc"), equalTo<Int>(1))
    }

    @Test
    fun maximumGap2() {
        assertThat<Int>(Solution().maximumGap("abc", "axbyc"), equalTo<Int>(2))
    }

    @Test
    fun maximumGap3() {
        assertThat<Int>(Solution().maximumGap("a", "anything"), equalTo<Int>(0))
    }
}
