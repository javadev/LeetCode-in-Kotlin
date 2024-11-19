package g0001_0100.s0093_restore_ip_addresses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun restoreIpAddresses() {
        assertThat(
            Solution().restoreIpAddresses("25525511135").toString(),
            equalTo("[255.255.11.135, 255.255.111.35]"),
        )
    }

    @Test
    fun restoreIpAddresses2() {
        assertThat(Solution().restoreIpAddresses("0000").toString(), equalTo("[0.0.0.0]"))
    }

    @Test
    fun restoreIpAddresses3() {
        assertThat(
            Solution().restoreIpAddresses("101023").toString(),
            equalTo("[1.0.10.23, 1.0.102.3, 10.1.0.23, 10.10.2.3, 101.0.2.3]"),
        )
    }
}
