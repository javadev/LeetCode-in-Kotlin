package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat(Solution().maxProduct("leetcodecom"), equalTo(9))
    }

    @Test
    fun maxProduct2() {
        assertThat(Solution().maxProduct("bb"), equalTo(1))
    }

    @Test
    fun maxProduct3() {
        assertThat(Solution().maxProduct("accbcaxxcxx"), equalTo(25))
    }
}
