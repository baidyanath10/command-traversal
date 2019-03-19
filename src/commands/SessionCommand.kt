package commands

import service.Output
import service.Service

class SessionCommand : Command {
    private val service = Service()
    private val output = Output()

    override fun run(command: String) =
        try {
            val process = service.execute(command)
            output.display(process)

        } catch (e: Exception) {
            println("ERROR: ${e.message}")
        }
}