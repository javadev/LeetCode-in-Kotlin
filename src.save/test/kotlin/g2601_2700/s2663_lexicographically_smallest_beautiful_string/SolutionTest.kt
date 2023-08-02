package g2601_2700.s2663_lexicographically_smallest_beautiful_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestBeautifulString() {
        assertThat(
            Solution().smallestBeautifulString("abcz", 26),
            equalTo("abda")
        )
    }

    @Test
    fun smallestBeautifulString2() {
        assertThat(
            Solution().smallestBeautifulString("dc", 4),
            equalTo("")
        )
    }

    @Test
    fun smallestBeautifulString3() {
        assertThat(
            Solution().smallestBeautifulString("abcd", 4),
            equalTo("abda")
        )
    }

    @Test
    fun smallestBeautifulString4() {
        assertThat(
            Solution().smallestBeautifulString("abdc", 4),
            equalTo("acba")
        )
    }
}
