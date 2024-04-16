package g3001_3100.s3075_maximize_happiness_of_selected_children

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumHappinessSum() {
        assertThat(Solution().maximumHappinessSum(intArrayOf(1, 2, 3), 2), equalTo(4L))
    }

    @Test
    fun maximumHappinessSum2() {
        assertThat(Solution().maximumHappinessSum(intArrayOf(1, 1, 1, 1), 2), equalTo(1L))
    }

    @Test
    fun maximumHappinessSum3() {
        assertThat(Solution().maximumHappinessSum(intArrayOf(2, 3, 4, 5), 1), equalTo(5L))
    }
}
