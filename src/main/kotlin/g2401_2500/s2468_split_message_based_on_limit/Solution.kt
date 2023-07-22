package g2401_2500.s2468_split_message_based_on_limit

// #Hard #String #Binary_Search #2023_07_05_Time_427_ms_(100.00%)_Space_49.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun splitMessage(message: String, limit: Int): Array<String?> {
        var total: Int
        var running = 0
        var count: Int
        var totalReq: Int
        var valUsed = -1
        var minLimitReq: Int
        for (i in 1..message.length) {
            count = getCount(i)
            running += count
            total = running + count * i + 3 * i
            totalReq = total + message.length
            minLimitReq = (totalReq + i - 1) / i
            if (minLimitReq <= limit) {
                valUsed = i
                break
            }
        }
        if (valUsed == -1) {
            return arrayOf()
        }
        val sb = StringBuilder()
        var idx = 0
        val sb2 = StringBuilder()
        var left: Int
        val result = arrayOfNulls<String>(valUsed)
        for (i in 1..valUsed) {
            sb2.setLength(0)
            sb.setLength(0)
            sb2.append('<')
            sb2.append(i)
            sb2.append('/')
            sb2.append(valUsed)
            sb2.append('>')
            left = limit - sb2.length
            while (idx < message.length && left-- > 0) {
                sb.append(message[idx++])
            }
            sb.append(sb2)
            result[i - 1] = sb.toString()
        }
        return result
    }

    private fun getCount(`val`: Int): Int {
        var `val` = `val`
        var result = 0
        while (`val` != 0) {
            `val` /= 10
            ++result
        }
        return result
    }
}
