package g3501_3600.s3545_minimum_deletions_for_at_most_k_distinct_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletion() {
        assertThat<Int>(Solution().minDeletion("abc", 2), equalTo<Int>(1))
    }

    @Test
    fun minDeletion2() {
        assertThat<Int>(Solution().minDeletion("aabb", 2), equalTo<Int>(0))
    }

    @Test
    fun minDeletion3() {
        assertThat<Int>(Solution().minDeletion("yyyzz", 1), equalTo<Int>(2))
    }
}
