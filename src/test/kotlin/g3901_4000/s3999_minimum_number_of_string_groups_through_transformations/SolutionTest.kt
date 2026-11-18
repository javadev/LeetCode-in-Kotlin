package g3901_4000.s3999_minimum_number_of_string_groups_through_transformations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumGroups() {
        assertThat<Int>(
            Solution().minimumGroups(arrayOf<String>("ntgwz", "zwntg")),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minimumGroups2() {
        assertThat<Int>(
            Solution()
                .minimumGroups(arrayOf<String>("abc", "cab", "bac", "acb", "bca", "cba")),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minimumGroups3() {
        assertThat<Int>(
            Solution()
                .minimumGroups(
                    arrayOf<String>("leet", "abb", "bab", "deed", "edde", "code", "bba"),
                ),
            equalTo<Int>(5),
        )
    }
}
