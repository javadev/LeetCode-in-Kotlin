package g3101_3200.s3137_minimum_number_of_operations_to_make_word_k_periodic

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperationsToMakeKPeriodic() {
        assertThat(
            Solution().minimumOperationsToMakeKPeriodic("leetcodeleet", 4),
            equalTo(1)
        )
    }

    @Test
    fun minimumOperationsToMakeKPeriodic2() {
        assertThat(Solution().minimumOperationsToMakeKPeriodic("leetcoleet", 2), equalTo(3))
    }
}
