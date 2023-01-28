package g0401_0500.s0460_lfu_cache

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class LFUCacheTest {
    @Test
    fun lfuCache() {
        val lfuCache = LFUCache(2)
        lfuCache.put(1, 1)
        lfuCache.put(2, 2)
        assertThat(lfuCache[1], equalTo(1))
        lfuCache.put(3, 3)
        assertThat(lfuCache[2], equalTo(-1))
        assertThat(lfuCache[3], equalTo(3))
        lfuCache.put(4, 4)
        assertThat(lfuCache[1], equalTo(-1))
        assertThat(lfuCache[3], equalTo(3))
        assertThat(lfuCache[4], equalTo(4))
    }
}
