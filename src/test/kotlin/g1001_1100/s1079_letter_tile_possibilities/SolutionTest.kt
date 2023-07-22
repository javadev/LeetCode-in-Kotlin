package g1001_1100.s1079_letter_tile_possibilities

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTilePossibilities() {
        assertThat(Solution().numTilePossibilities("AAB"), equalTo(8))
    }

    @Test
    fun numTilePossibilities2() {
        assertThat(Solution().numTilePossibilities("AAABBC"), equalTo(188))
    }

    @Test
    fun numTilePossibilities3() {
        assertThat(Solution().numTilePossibilities("V"), equalTo(1))
    }
}
