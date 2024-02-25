package g3001_3100.s3001_minimum_moves_to_capture_the_queen

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMovesToCaptureTheQueen() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3), equalTo(2))
    }

    @Test
    fun minMovesToCaptureTheQueen2() {
        assertThat(Solution().minMovesToCaptureTheQueen(5, 3, 3, 4, 5, 2), equalTo(1))
    }

    @Test
    fun minMovesToCaptureTheQueen3() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 3, 1, 5, 1), equalTo(2))
    }

    @Test
    fun minMovesToCaptureTheQueen4() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 1, 3, 1, 5), equalTo(2))
    }

    @Test
    fun minMovesToCaptureTheQueen5() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 3, 3, 5, 5), equalTo(1))
    }

    @Test
    fun minMovesToCaptureTheQueen6() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 3, 1, 5, 3), equalTo(1))
    }

    @Test
    fun minMovesToCaptureTheQueen7() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 1, 3, 3, 5), equalTo(1))
    }

    @Test
    fun minMovesToCaptureTheQueen8() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 3, 3, 5, 1), equalTo(1))
    }

    @Test
    fun minMovesToCaptureTheQueen9() {
        assertThat(Solution().minMovesToCaptureTheQueen(1, 1, 2, 3, 5, 5), equalTo(2))
    }
}
