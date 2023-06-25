package g2101_2200.s2165_smallest_value_of_the_rearranged_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestNumber() {
        MatcherAssert.assertThat(Solution().smallestNumber(310L), CoreMatchers.equalTo(103L))
    }

    @Test
    fun smallestNumber2() {
        MatcherAssert.assertThat(Solution().smallestNumber(-7605L), CoreMatchers.equalTo(-7650L))
    }
}
