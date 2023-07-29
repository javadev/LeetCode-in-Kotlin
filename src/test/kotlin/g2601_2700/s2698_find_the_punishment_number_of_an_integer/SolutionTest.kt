package g2601_2700.s2698_find_the_punishment_number_of_an_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun punishmentNumber() {
        assertThat(
            Solution().punishmentNumber(10),
            equalTo(182)
        )
    }

    @Test
    fun punishmentNumber2() {
        assertThat(
            Solution().punishmentNumber(37),
            equalTo(1478)
        )
    }
}
