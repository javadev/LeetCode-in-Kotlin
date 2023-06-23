package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        MatcherAssert.assertThat(Solution().maxProduct("leetcodecom"), CoreMatchers.equalTo(9))
    }

    @Test
    fun maxProduct2() {
        MatcherAssert.assertThat(Solution().maxProduct("bb"), CoreMatchers.equalTo(1))
    }

    @Test
    fun maxProduct3() {
        MatcherAssert.assertThat(Solution().maxProduct("accbcaxxcxx"), CoreMatchers.equalTo(25))
    }
}
