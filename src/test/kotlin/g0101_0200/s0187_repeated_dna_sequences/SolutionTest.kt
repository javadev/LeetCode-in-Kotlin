package g0101_0200.s0187_repeated_dna_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRepeatedDnaSequences() {
        assertThat(
            Solution().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"),
            equalTo(listOf("AAAAACCCCC", "CCCCCAAAAA"))
        )
    }

    @Test
    fun findRepeatedDnaSequences2() {
        assertThat(
            Solution().findRepeatedDnaSequences("AAAAAAAAAAAAA"),
            equalTo(listOf("AAAAAAAAAA"))
        )
    }
}
