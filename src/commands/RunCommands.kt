package commands

interface RunCommands {
    //run command without path
    fun run(param: String): Process

    //run command with path
    fun run(param: String, path: String): Process
}