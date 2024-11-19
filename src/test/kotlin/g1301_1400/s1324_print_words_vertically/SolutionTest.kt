package g1301_1400.s1324_print_words_vertically

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun printVertically() {
        assertThat(
            Solution().printVertically("HOW ARE YOU"),
            equalTo(mutableListOf("HAY", "ORO", "WEU")),
        )
    }

    @Test
    fun printVertically2() {
        assertThat(
            Solution().printVertically("TO BE OR NOT TO BE"),
            equalTo(mutableListOf("TBONTB", "OEROOE", "   T")),
        )
    }

    @Test
    fun printVertically3() {
        assertThat(
            Solution().printVertically("CONTEST IS COMING"),
            equalTo(mutableListOf("CIC", "OSO", "N M", "T I", "E N", "S G", "T")),
        )
    }
}
