package g3501_3600.s3508_implement_router

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RouterTest {
    @Test
    fun router() {
        // Initialize Router with memoryLimit of 3.
        val router = Router(3)
        // Packet is added. Return True.
        assertThat<Boolean>(router.addPacket(1, 4, 90), equalTo<Boolean>(true))
        // Packet is added. Return True.
        assertThat<Boolean>(router.addPacket(2, 5, 90), equalTo<Boolean>(true))
        // This is a duplicate packet. Return False.
        assertThat<Boolean>(router.addPacket(1, 4, 90), equalTo<Boolean>(false))
        // Packet is added. Return True
        assertThat<Boolean>(router.addPacket(3, 5, 95), equalTo<Boolean>(true))
        // Packet is added, [1, 4, 90] is removed as number of packets exceeds memoryLimit. Return
        // True.
        assertThat<Boolean>(router.addPacket(4, 5, 105), equalTo<Boolean>(true))
        // Return [2, 5, 90] and remove it from router.
        assertThat<IntArray>(
            router.forwardPacket(),
            equalTo<IntArray>(intArrayOf(2, 5, 90)),
        )
        // Packet is added. Return True.
        assertThat<Boolean>(router.addPacket(5, 2, 110), equalTo<Boolean>(true))
        // The only packet with destination 5 and timestamp in the inclusive range
        assertThat<Int?>(router.getCount(5, 100, 110), equalTo<Int?>(1))
    }

    @Test
    fun router2() {
        // Initialize Router with memoryLimit of 2.
        val router = Router(2)
        // Packet is added. Return True.
        assertThat<Boolean>(router.addPacket(7, 4, 90), equalTo<Boolean>(true))
        // Return [7, 4, 90] and remove it from router.
        assertThat<IntArray>(
            router.forwardPacket(),
            equalTo<IntArray>(intArrayOf(7, 4, 90)),
        )
        // Return [] and remove it from router.
        assertThat<IntArray>(router.forwardPacket(), equalTo<IntArray>(intArrayOf()))
    }
}
