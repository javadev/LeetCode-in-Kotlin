package s0006.zigzag.conversion

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun convert() {
        assertThat(Solution().convert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"))
    }
}
