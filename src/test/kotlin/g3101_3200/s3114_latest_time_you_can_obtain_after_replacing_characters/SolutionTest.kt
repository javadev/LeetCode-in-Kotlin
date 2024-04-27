package g3101_3200.s3114_latest_time_you_can_obtain_after_replacing_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLatestTime() {
        assertThat(Solution().findLatestTime("1?:?4"), equalTo("11:54"))
    }

    @Test
    fun findLatestTime2() {
        assertThat(Solution().findLatestTime("0?:5?"), equalTo("09:59"))
    }

    @Test
    fun findLatestTime3() {
        assertThat(Solution().findLatestTime("?1:?6"), equalTo("11:56"))
    }

    @Test
    fun findLatestTime4() {
        assertThat(Solution().findLatestTime("08:33"), equalTo("08:33"))
    }

    @Test
    fun findLatestTime5() {
        assertThat(Solution().findLatestTime("??:1?"), equalTo("11:19"))
    }

    @Test
    fun findLatestTime6() {
        assertThat(Solution().findLatestTime("04:??"), equalTo("04:59"))
    }

    @Test
    fun findLatestTime7() {
        assertThat(Solution().findLatestTime("?3:12"), equalTo("03:12"))
    }
}
