package g1501_1600.s1592_rearrange_spaces_between_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorderSpaces() {
        assertThat(
            Solution().reorderSpaces("  this   is  a sentence "),
            equalTo("this   is   a   sentence")
        )
    }

    @Test
    fun reorderSpaces2() {
        assertThat(
            Solution().reorderSpaces(" practice   makes   perfect"),
            equalTo("practice   makes   perfect ")
        )
    }
}
