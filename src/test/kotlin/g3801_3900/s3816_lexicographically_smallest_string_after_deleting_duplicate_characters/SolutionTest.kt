package g3801_3900.s3816_lexicographically_smallest_string_after_deleting_duplicate_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexSmallestAfterDeletion() {
        assertThat<String>(
            Solution().lexSmallestAfterDeletion("aaccb"),
            equalTo<String>("aacb"),
        )
    }

    @Test
    fun lexSmallestAfterDeletion2() {
        assertThat<String>(Solution().lexSmallestAfterDeletion("z"), equalTo<String>("z"))
    }
}
