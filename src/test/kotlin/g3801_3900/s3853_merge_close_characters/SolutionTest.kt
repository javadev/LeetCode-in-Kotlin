package g3801_3900.s3853_merge_close_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeCharacters() {
        assertThat<String>(Solution().mergeCharacters("abca", 3), equalTo<String>("abc"))
    }

    @Test
    fun mergeCharacters2() {
        assertThat<String>(Solution().mergeCharacters("aabca", 2), equalTo<String>("abca"))
    }

    @Test
    fun mergeCharacters3() {
        assertThat<String>(
            Solution().mergeCharacters("yybyzybz", 2),
            equalTo<String>("ybzybz"),
        )
    }
}
