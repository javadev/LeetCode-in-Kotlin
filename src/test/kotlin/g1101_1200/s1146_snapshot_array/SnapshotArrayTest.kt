package g1101_1200.s1146_snapshot_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SnapshotArrayTest {
    @Test
    fun snapshotArrayTest() {
        val snapshotArr = SnapshotArray(3)
        snapshotArr[0] = 5
        MatcherAssert.assertThat(snapshotArr.snap(), CoreMatchers.equalTo(0))
        snapshotArr[0] = 6
        MatcherAssert.assertThat(snapshotArr[0, 0], CoreMatchers.equalTo(5))
    }
}
