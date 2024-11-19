package g1301_1400.s1313_decompress_run_length_encoded_list

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decompressRLElist() {
        assertThat(
            Solution().decompressRLElist(intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(2, 4, 4, 4)),
        )
    }

    @Test
    fun decompressRLElist2() {
        assertThat(
            Solution().decompressRLElist(intArrayOf(1, 1, 2, 3)),
            equalTo(intArrayOf(1, 3, 3)),
        )
    }
}
