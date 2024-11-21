package g3301_3400.s3343_count_number_of_balanced_permutations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBalancedPermutations() {
        assertThat<Int>(Solution().countBalancedPermutations("123"), equalTo<Int>(2))
    }

    @Test
    fun countBalancedPermutations2() {
        assertThat<Int>(Solution().countBalancedPermutations("112"), equalTo<Int>(1))
    }

    @Test
    fun countBalancedPermutations3() {
        assertThat<Int>(Solution().countBalancedPermutations("12345"), equalTo<Int>(0))
    }
}
