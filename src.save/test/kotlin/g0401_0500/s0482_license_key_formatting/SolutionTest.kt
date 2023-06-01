package g0401_0500.s0482_license_key_formatting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun licenseKeyFormatting() {
        assertThat(Solution().licenseKeyFormatting("5F3Z-2e-9-w", 4), equalTo("5F3Z-2E9W"))
    }

    @Test
    fun licenseKeyFormatting2() {
        assertThat(Solution().licenseKeyFormatting("2-5g-3-J", 2), equalTo("2-5G-3J"))
    }
}
