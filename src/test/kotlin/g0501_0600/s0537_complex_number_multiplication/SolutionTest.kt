package g0501_0600.s0537_complex_number_multiplication

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun complexNumberMultiply() {
        assertThat(Solution().complexNumberMultiply("1+1i", "1+1i"), equalTo("0+2i"))
    }

    @Test
    fun complexNumberMultiply2() {
        assertThat(Solution().complexNumberMultiply("1+-1i", "1+-1i"), equalTo("0+-2i"))
    }
}
