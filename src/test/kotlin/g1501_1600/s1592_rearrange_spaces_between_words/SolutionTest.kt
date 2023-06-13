package g1501_1600.s1592_rearrange_spaces_between_words

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorderSpaces() {
        MatcherAssert.assertThat(
            Solution().reorderSpaces("  this   is  a sentence "),
            CoreMatchers.equalTo("this   is   a   sentence")
        )
    }

    @Test
    fun reorderSpaces2() {
        MatcherAssert.assertThat(
            Solution().reorderSpaces(" practice   makes   perfect"),
            CoreMatchers.equalTo("practice   makes   perfect ")
        )
    }
}
