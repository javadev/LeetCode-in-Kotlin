package g1901_2000.s1977_number_of_ways_to_separate_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfCombinations() {
        assertThat(Solution().numberOfCombinations("327"), equalTo(2))
    }

    @Test
    fun numberOfCombinations2() {
        assertThat(Solution().numberOfCombinations("094"), equalTo(0))
    }

    @Test
    fun numberOfCombinations3() {
        assertThat(Solution().numberOfCombinations("0"), equalTo(0))
    }
}
