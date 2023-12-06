package g2801_2900.s2810_faulty_keyboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Easy #String #Simulation
internal class SolutionTest {
    @Test
    fun finalString() {
        assertThat(Solution().finalString("string"), equalTo("rtsng"))
    }

    @Test
    fun finalString2() {
        assertThat(Solution().finalString("poiinter"), equalTo("ponter"))
    }
}
