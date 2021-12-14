import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun readInput(name: String) = open(name).readLines()

fun readOne(name: String) = open(name).readText().trim()

fun readNums(name: String) = readInput(name).map { it.toInt() }

fun open(name: String) = File("src", "$name.txt")
