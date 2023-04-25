package g0401_0500.s0468_validate_ip_address

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validIPAddress() {
        assertThat(Solution().validIPAddress("172.16.254.1"), equalTo("IPv4"))
    }

    @Test
    fun validIPAddress2() {
        assertThat(
            Solution().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"),
            equalTo("IPv6")
        )
    }

    @Test
    fun validIPAddress3() {
        assertThat(Solution().validIPAddress("256.256.256.256"), equalTo("Neither"))
    }
}
