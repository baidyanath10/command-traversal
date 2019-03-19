package commands

interface Command {
    //run command
    fun run(command: String): Any
}