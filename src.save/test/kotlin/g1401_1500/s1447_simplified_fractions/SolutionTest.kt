package g1401_1500.s1447_simplified_fractions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun simplifiedFractions() {
        assertThat(
            Solution().simplifiedFractions(2), equalTo(listOf("1/2"))
        )
    }

    @Test
    fun simplifiedFractions2() {
        assertThat(
            Solution().simplifiedFractions(4),
            equalTo(mutableListOf("1/2", "1/3", "2/3", "1/4", "3/4"))
        )
    }
}
