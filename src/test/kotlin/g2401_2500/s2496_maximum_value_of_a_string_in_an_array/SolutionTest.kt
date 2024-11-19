package g2401_2500.s2496_maximum_value_of_a_string_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumValue() {
        assertThat(
            Solution().maximumValue(arrayOf("alic3", "bob", "3", "4", "00000")),
            equalTo(5),
        )
    }

    @Test
    fun maximumValue2() {
        assertThat(
            Solution().maximumValue(arrayOf("1", "01", "001", "0001")),
            equalTo(1),
        )
    }
}
