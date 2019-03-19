package commands

import service.Service


class RunCommandsImpl : RunCommands {

    private val service = Service()

    //implementation for running command without path
    override fun run(param: String) = service.execute(command = param)

    //implementation for running command with path
    override fun run(param: String, path: String) = service.execute(command = "$param $path")

}