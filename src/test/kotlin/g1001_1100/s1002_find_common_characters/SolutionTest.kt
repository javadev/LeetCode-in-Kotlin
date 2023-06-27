package g1001_1100.s1002_find_common_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun commonChars() {
        assertThat(
            Solution().commonChars(arrayOf("bella", "label", "roller")),
            equalTo(listOf("e", "l", "l"))
        )
    }

    @Test
    fun commonChars2() {
        assertThat(
            Solution().commonChars(arrayOf("cool", "lock", "cook")),
            equalTo(listOf("c", "o"))
        )
    }
}
