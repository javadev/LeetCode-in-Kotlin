package s0007.reverse.integer

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun convert() {
        assertThat(Solution().reverse(123), equalTo(321))
    }
}
