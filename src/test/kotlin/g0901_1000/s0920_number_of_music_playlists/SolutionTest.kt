package g0901_1000.s0920_number_of_music_playlists

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMusicPlaylists() {
        assertThat(Solution().numMusicPlaylists(3, 3, 1), equalTo(6))
    }

    @Test
    fun numMusicPlaylists2() {
        assertThat(Solution().numMusicPlaylists(2, 3, 0), equalTo(6))
    }

    @Test
    fun numMusicPlaylists3() {
        assertThat(Solution().numMusicPlaylists(2, 3, 1), equalTo(2))
    }
}
