package g1401_1500.s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun happyString() {
        assertThat(Solution().getHappyString(1, 3), equalTo("c"))
    }

    @Test
    fun happyString2() {
        assertThat(Solution().getHappyString(1, 4), equalTo(""))
    }

    @Test
    fun happyString3() {
        assertThat(Solution().getHappyString(3, 9), equalTo("cab"))
    }
}
