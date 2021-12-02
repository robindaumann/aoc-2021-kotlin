fun main() {
    fun part1(input: List<Int>): Int {
        var count = 0
        var last = Int.MAX_VALUE
        for (n in input) {
            if (n > last) {
                count++
            }
            last = n
        }
        return count
    }

    fun part2(input: List<Int>): Int {
        var count = 0
        var idx = 0
        while (idx < input.size - 3) {
            val sum1 = input.slice(idx..idx + 2).sum()
            val sum2 = input.slice(idx + 1..idx + 3).sum()
            if (sum2 > sum1) {
                count++
            }
            idx++
        }
        return count
    }

    val input = readNums("Day01")
    println(part1(input))
    println(part2(input))
}
