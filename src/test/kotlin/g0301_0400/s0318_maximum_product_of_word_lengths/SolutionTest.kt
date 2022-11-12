package g0301_0400.s0318_maximum_product_of_word_lengths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat(
            Solution()
                .maxProduct(arrayOf("abcw", "baz", "foo", "bar", "xtfn", "abcdef")),
            equalTo(16)
        )
    }

    @Test
    fun maxProduct2() {
        assertThat(
            Solution()
                .maxProduct(arrayOf("a", "ab", "abc", "d", "cd", "bcd", "abcd")),
            equalTo(4)
        )
    }
}
