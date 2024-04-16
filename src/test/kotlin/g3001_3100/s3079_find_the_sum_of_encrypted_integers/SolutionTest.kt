package g3001_3100.s3079_find_the_sum_of_encrypted_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfEncryptedInt() {
        assertThat(Solution().sumOfEncryptedInt(intArrayOf(1, 2, 3)), equalTo(6))
    }

    @Test
    fun sumOfEncryptedInt2() {
        assertThat(Solution().sumOfEncryptedInt(intArrayOf(10, 21, 31)), equalTo(66))
    }
}
