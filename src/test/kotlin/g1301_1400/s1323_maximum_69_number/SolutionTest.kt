package g1301_1400.s1323_maximum_69_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximum69Number() {
        assertThat(Solution().maximum69Number(9996), equalTo(9999))
    }

    @Test
    fun maximum69Number2() {
        assertThat(Solution().maximum69Number(9999), equalTo(9999))
    }
}
