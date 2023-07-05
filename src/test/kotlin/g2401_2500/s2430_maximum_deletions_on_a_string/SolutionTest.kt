package g2401_2500.s2430_maximum_deletions_on_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteString() {
        assertThat(Solution().deleteString("abcabcdabc"), equalTo(2))
    }

    @Test
    fun deleteString2() {
        assertThat(Solution().deleteString("aaabaab"), equalTo(4))
    }

    @Test
    fun deleteString3() {
        assertThat(Solution().deleteString("aaaaa"), equalTo(5))
    }
}
