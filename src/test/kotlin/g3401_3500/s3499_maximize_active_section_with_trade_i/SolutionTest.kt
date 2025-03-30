package g3401_3500.s3499_maximize_active_section_with_trade_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxActiveSectionsAfterTrade() {
        assertThat<Int>(Solution().maxActiveSectionsAfterTrade("01"), equalTo<Int>(1))
    }

    @Test
    fun maxActiveSectionsAfterTrade2() {
        assertThat<Int>(Solution().maxActiveSectionsAfterTrade("0100"), equalTo<Int>(4))
    }

    @Test
    fun maxActiveSectionsAfterTrade3() {
        assertThat<Int>(Solution().maxActiveSectionsAfterTrade("1000100"), equalTo<Int>(7))
    }

    @Test
    fun maxActiveSectionsAfterTrade4() {
        assertThat<Int>(Solution().maxActiveSectionsAfterTrade("01010"), equalTo<Int>(4))
    }
}
