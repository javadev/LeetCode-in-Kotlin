package g2101_2200.s2156_find_substring_with_given_hash_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subStrHash() {
        assertThat(Solution().subStrHash("leetcode", 7, 20, 2, 0), equalTo("ee"))
    }

    @Test
    fun subStrHash2() {
        assertThat(Solution().subStrHash("fbxzaad", 31, 100, 3, 32), equalTo("fbx"))
    }
}
