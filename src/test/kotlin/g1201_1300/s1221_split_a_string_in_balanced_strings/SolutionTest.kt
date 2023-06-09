package g1201_1300.s1221_split_a_string_in_balanced_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun balancedStringSplit() {
        assertThat(Solution().balancedStringSplit("RLRRLLRLRL"), equalTo(4))
    }

    @Test
    fun balancedStringSplit2() {
        assertThat(Solution().balancedStringSplit("RLLLLRRRLR"), equalTo(3))
    }

    @Test
    fun balancedStringSplit3() {
        assertThat(Solution().balancedStringSplit("LLLLRRRR"), equalTo(1))
    }
}
