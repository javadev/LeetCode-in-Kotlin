package g0801_0900.s0835_image_overlap

// #Medium #Array #Matrix #2023_03_27_Time_163_ms_(100.00%)_Space_35.3_MB_(100.00%)

class Solution {
    fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
        val bits1 = bitwise(img1)
        val bits2 = bitwise(img2)
        val n = img1.size
        var res = 0
        for (hori in -1 * n + 1 until n) {
            for (veti in -1 * n + 1 until n) {
                var curOverLapping = 0
                if (veti < 0) {
                    for (i in -1 * veti until n) {
                        curOverLapping += if (hori < 0) {
                            Integer.bitCount(
                                bits1[i] shl -1 * hori and bits2[i - -1 * veti]
                            )
                        } else {
                            Integer.bitCount(bits1[i] shr hori and bits2[i - -1 * veti])
                        }
                    }
                } else {
                    for (i in 0 until n - veti) {
                        curOverLapping += if (hori < 0) {
                            Integer.bitCount(bits1[i] shl -1 * hori and bits2[veti + i])
                        } else {
                            Integer.bitCount(bits1[i] shr hori and bits2[veti + i])
                        }
                    }
                }
                res = Math.max(res, curOverLapping)
            }
        }
        return res
    }

    private fun bitwise(img: Array<IntArray>): IntArray {
        val bits = IntArray(img.size)
        for (i in img.indices) {
            var cur = 0
            for (j in img[0].indices) {
                cur = cur * 2 + img[i][j]
            }
            bits[i] = cur
        }
        return bits
    }
}
