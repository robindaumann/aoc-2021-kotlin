fun main() {
    fun mutate(buckets: MutableList<Long>) {
        val amount = buckets.removeAt(0)
        buckets[6] += amount
        buckets.add(amount)
    }

    fun grow_fish(input: String, mutations: Int): Long {
        val fish = input.split(",").map(String::toInt)

        val buckets = MutableList(9) { 0L }
        for (f in fish) {
            buckets[f] = buckets[f] + 1
        }

        for (i in 1..mutations) {
            mutate(buckets)
        }

        return buckets.sum()
    }


    val input = readOne("Day06")
    println(grow_fish(input, 80))
    println(grow_fish(input, 256))
}
