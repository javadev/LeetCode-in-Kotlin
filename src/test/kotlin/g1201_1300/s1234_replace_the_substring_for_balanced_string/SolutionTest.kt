package g1201_1300.s1234_replace_the_substring_for_balanced_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun balancedString() {
        assertThat(Solution().balancedString("QWER"), equalTo(0))
    }

    @Test
    fun balancedString2() {
        assertThat(Solution().balancedString("QQWE"), equalTo(1))
    }

    @Test
    fun balancedString3() {
        assertThat(Solution().balancedString("QQQW"), equalTo(2))
    }
}
