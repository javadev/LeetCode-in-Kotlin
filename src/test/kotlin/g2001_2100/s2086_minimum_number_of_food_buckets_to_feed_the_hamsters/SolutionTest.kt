package g2001_2100.s2086_minimum_number_of_food_buckets_to_feed_the_hamsters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumBuckets() {
        assertThat(Solution().minimumBuckets("H..H"), equalTo(2))
    }

    @Test
    fun minimumBuckets2() {
        assertThat(Solution().minimumBuckets(".H.H."), equalTo(1))
    }

    @Test
    fun minimumBuckets3() {
        assertThat(Solution().minimumBuckets(".HHH."), equalTo(-1))
    }
}
