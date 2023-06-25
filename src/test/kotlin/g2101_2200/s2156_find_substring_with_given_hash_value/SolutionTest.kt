package g2101_2200.s2156_find_substring_with_given_hash_value

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subStrHash() {
        MatcherAssert.assertThat(Solution().subStrHash("leetcode", 7, 20, 2, 0), CoreMatchers.equalTo("ee"))
    }

    @Test
    fun subStrHash2() {
        MatcherAssert.assertThat(Solution().subStrHash("fbxzaad", 31, 100, 3, 32), CoreMatchers.equalTo("fbx"))
    }
}
