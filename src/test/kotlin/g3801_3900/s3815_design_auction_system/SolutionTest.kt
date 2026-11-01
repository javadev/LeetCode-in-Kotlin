package g3801_3900.s3815_design_auction_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun auctionSystem() {
        val auctionSystem = AuctionSystem()
        auctionSystem.addBid(1, 7, 5)
        auctionSystem.addBid(2, 7, 6)
        assertThat<Int>(auctionSystem.getHighestBidder(7), equalTo<Int>(2))
        auctionSystem.updateBid(1, 7, 8)
        assertThat<Int>(auctionSystem.getHighestBidder(7), equalTo<Int>(1))
        auctionSystem.removeBid(2, 7)
        assertThat<Int>(auctionSystem.getHighestBidder(7), equalTo<Int>(1))
        assertThat<Int>(auctionSystem.getHighestBidder(3), equalTo<Int>(-1))
    }
}
