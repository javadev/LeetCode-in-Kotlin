package g2101_2200.s2151_maximum_good_people_based_on_statements

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGood() {
        MatcherAssert.assertThat(
            Solution().maximumGood(arrayOf(intArrayOf(2, 1, 2), intArrayOf(1, 2, 2), intArrayOf(2, 0, 2))),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun maximumGood2() {
        MatcherAssert.assertThat(
            Solution().maximumGood(arrayOf(intArrayOf(2, 0), intArrayOf(0, 2))),
            CoreMatchers.equalTo(1)
        )
    }
}
