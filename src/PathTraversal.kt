import commands.*

val domain = setOf("cd", "mkdir", "rm", "pwd", "ls", "session")

fun main() {
    val cdCommand = CdCommand()
    val mkdirCommand = MkdirCommand()
    val rmCommand = RmCommand()
    val pwdCommand = PwdCommand()
    val lsCommand = LsCommand()
    val sessionCommand = SessionCommand()

    while (true) {
        val inputString = readLine()!!
        val inputArray = inputString.trim().split(" ")

        //exit if user press enter button
        if (inputString.isEmpty()) System.exit(1)

        if (inputArray[0] in domain) {
            //running the command
            val command = if (inputArray.size == 2) "${inputArray[0]} ${inputArray[1]}".trim()
            else inputArray[0].trim()

            when (inputArray[0]) {
                "cd" -> cdCommand.run(command)
                "mkdir" -> mkdirCommand.run(command)
                "rm" -> rmCommand.run(command)
                "pwd" -> pwdCommand.run(command)
                "ls" -> lsCommand.run(command)
                "session" -> sessionCommand.run(command)
            }
        } else {
            println("ERR: CANNOT RECOGNIZE INPUT.")
        }
    }
}