package s0007_reverse_integer

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun reverse() {
        assertThat(Solution().reverse(123), equalTo(321))
    }
}
