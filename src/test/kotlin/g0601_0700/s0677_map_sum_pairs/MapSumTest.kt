package g0601_0700.s0677_map_sum_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MapSumTest {
    @Test
    fun mapSumTest() {
        val mapSum = MapSum()
        mapSum.insert("apple", 3)
        assertThat(mapSum.sum("ap"), equalTo(3))
        mapSum.insert("app", 2)
        assertThat(mapSum.sum("ap"), equalTo(5))
    }
}
