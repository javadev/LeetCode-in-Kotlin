package g0401_0500.s0476_number_complement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findComplement() {
        assertThat(Solution().findComplement(5), equalTo(2))
    }

    @Test
    fun findComplement2() {
        assertThat(Solution().findComplement(1), equalTo(0))
    }
}
