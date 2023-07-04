package g2401_2500.s2469_convert_the_temperature

// #Easy #Math
class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        val kelvin = celsius + 273.15
        val fahrenheit = celsius * 1.80 + 32.00
        val arr = DoubleArray(2)
        arr[0] = kelvin
        arr[1] = fahrenheit
        return arr
    }
}
