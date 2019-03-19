package service

class Service {

    //run the command
    fun execute(command: String) = Runtime.getRuntime().exec(command)!!
}