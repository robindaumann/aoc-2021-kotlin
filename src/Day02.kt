fun main() {
    fun parse(command: String): Pair<String, Int> {
        val parts = command.split(' ')
        return Pair(parts[0], parts[1].toInt())
    }

    fun part1(commands: List<String>): Int {
        var posX = 0
        var posY = 0
        for (command in commands) {
            val (dir, amount) = parse(command)
            when (dir) {
                "forward" -> posX += amount
                "up" -> posY -= amount
                "down" -> posY += amount
            }
        }

        return posX * posY
    }

    fun part2(commands: List<String>): Int {
        var posX = 0
        var posY = 0
        var aim = 0
        for (command in commands) {
            val (dir, amount) = parse(command)
            when (dir) {
                "forward" -> {
                    posX += amount
                    posY += aim * amount
                }
                "up" -> aim -= amount
                "down" -> aim += amount
            }
        }

        return posX * posY
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
