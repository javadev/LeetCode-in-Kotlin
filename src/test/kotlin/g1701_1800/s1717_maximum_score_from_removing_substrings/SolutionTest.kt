package g1701_1800.s1717_maximum_score_from_removing_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGain() {
        assertThat(Solution().maximumGain("cdbcbbaaabab", 4, 5), equalTo(19))
    }

    @Test
    fun maximumGain2() {
        assertThat(Solution().maximumGain("aabbaaxybbaabb", 5, 4), equalTo(20))
    }
}
