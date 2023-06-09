package g1001_1100.s1009_complement_of_base_10_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bitwiseComplement() {
        assertThat(Solution().bitwiseComplement(5), equalTo(2))
    }

    @Test
    fun bitwiseComplement2() {
        assertThat(Solution().bitwiseComplement(7), equalTo(0))
    }

    @Test
    fun bitwiseComplement3() {
        assertThat(Solution().bitwiseComplement(10), equalTo(5))
    }
}
