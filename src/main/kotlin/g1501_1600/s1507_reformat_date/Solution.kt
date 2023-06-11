package g1501_1600.s1507_reformat_date

// #Easy #String
class Solution {
    fun reformatDate(date: String): String {
        val sb = StringBuilder()
        val map: MutableMap<String, String> = HashMap()
        map["Jan"] = "01"
        map["Feb"] = "02"
        map["Mar"] = "03"
        map["Apr"] = "04"
        map["May"] = "05"
        map["Jun"] = "06"
        map["Jul"] = "07"
        map["Aug"] = "08"
        map["Sep"] = "09"
        map["Oct"] = "10"
        map["Nov"] = "11"
        map["Dec"] = "12"
        sb.append(date.substring(date.length - 4))
        sb.append('-')
        sb.append(map[date.substring(date.length - 8, date.length - 5)])
        sb.append('-')
        if (Character.isDigit(date[1])) {
            sb.append(date, 0, 2)
        } else {
            sb.append('0')
            sb.append(date[0])
        }
        return sb.toString()
    }
}
