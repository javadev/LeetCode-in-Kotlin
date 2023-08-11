package g1001_1100.s1017_convert_to_base_2

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun baseNeg2() {
        assertThat(Solution().baseNeg2(2), equalTo("110"))
    }

    @Test
    fun baseNeg22() {
        assertThat(Solution().baseNeg2(3), equalTo("111"))
    }

    @Test
    fun baseNeg23() {
        assertThat(Solution().baseNeg2(4), equalTo("100"))
    }
}
