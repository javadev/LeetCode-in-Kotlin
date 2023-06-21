package g1901_2000.s1960_maximum_product_of_the_length_of_two_palindromic_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat(Solution().maxProduct("ababbb"), equalTo(9L))
    }

    @Test
    fun maxProduct2() {
        assertThat(Solution().maxProduct("zaaaxbbby"), equalTo(9L))
    }
}
