package g3501_3600.s3563_lexicographically_smallest_string_after_adjacent_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexicographicallySmallestString() {
        assertThat<String>(
            Solution().lexicographicallySmallestString("abc"),
            equalTo<String>("a"),
        )
    }

    @Test
    fun lexicographicallySmallestString2() {
        assertThat<String>(
            Solution().lexicographicallySmallestString("bcda"),
            equalTo<String>(""),
        )
    }

    @Test
    fun lexicographicallySmallestString3() {
        assertThat<String>(
            Solution().lexicographicallySmallestString("zdce"),
            equalTo<String>("zdce"),
        )
    }
}
