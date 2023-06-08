package g1201_1300.s1276_number_of_burgers_with_no_waste_of_ingredients

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfBurgers() {
        assertThat(Solution().numOfBurgers(16, 7), equalTo(mutableListOf(1, 6)))
    }

    @Test
    fun numOfBurgers2() {
        assertThat(Solution().numOfBurgers(17, 4), equalTo(emptyList<Any>()))
    }

    @Test
    fun numOfBurgers3() {
        assertThat(Solution().numOfBurgers(4, 17), equalTo(emptyList<Any>()))
    }
}
