package g1801_1900.s1854_maximum_population_year

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumPopulation() {
        assertThat(
            Solution().maximumPopulation(arrayOf(intArrayOf(1993, 1999), intArrayOf(2000, 2010))),
            equalTo(1993)
        )
    }

    @Test
    fun maximumPopulation2() {
        assertThat(
            Solution()
                .maximumPopulation(arrayOf(intArrayOf(1950, 1961), intArrayOf(1960, 1971), intArrayOf(1970, 1981))),
            equalTo(1960)
        )
    }
}
