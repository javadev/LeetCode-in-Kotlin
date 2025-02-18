package g3401_3500.s3458_select_k_disjoint_special_substrings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubstringLength() {
        MatcherAssert.assertThat<Boolean>(
            Solution().maxSubstringLength("abcdbaefab", 2),
            CoreMatchers.equalTo<Boolean>(true),
        )
    }

    @Test
    fun maxSubstringLength2() {
        MatcherAssert.assertThat<Boolean>(
            Solution().maxSubstringLength("cdefdc", 3),
            CoreMatchers.equalTo<Boolean>(false),
        )
    }

    @Test
    fun maxSubstringLength3() {
        MatcherAssert.assertThat<Boolean>(
            Solution().maxSubstringLength("abeabe", 0),
            CoreMatchers.equalTo<Boolean>(true),
        )
    }
}
