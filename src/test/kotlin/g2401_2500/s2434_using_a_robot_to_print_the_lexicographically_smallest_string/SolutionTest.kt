package g2401_2500.s2434_using_a_robot_to_print_the_lexicographically_smallest_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun robotWithString() {
        assertThat(Solution().robotWithString("zza"), equalTo("azz"))
    }

    @Test
    fun robotWithString2() {
        assertThat(Solution().robotWithString("bac"), equalTo("abc"))
    }

    @Test
    fun robotWithString3() {
        assertThat(Solution().robotWithString("bdda"), equalTo("addb"))
    }
}
