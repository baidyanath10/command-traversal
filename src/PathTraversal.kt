import commands.RunCommandsImpl
import java.util.*

val domain = setOf("cd", "mkdir", "rm", "pwd", "ls", "session")

fun main() {
    val command = RunCommandsImpl()

    while (true) {
        val inputString = readLine()!!
        val inputArray = inputString.trim().split(" ")

        //exit if user press enter button
        if (inputString.isEmpty()) System.exit(1)

        if (inputArray[0] in domain) {
            //running the command
            val process = if (inputArray.size == 2) command.run(
                param = inputArray[0],
                path = inputArray[1]
            ) else command.run(inputArray[0])

            //printing the output
            Scanner(process.inputStream).use {
                while (it.hasNextLine()) println(it.nextLine())
            }
        } else {
            println("ERR: CANNOT RECOGNIZE INPUT.")
        }
    }
}