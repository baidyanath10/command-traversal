package service

import java.util.*

class Output {
    fun display(process: Process) = Scanner(process.inputStream).use {
        while (it.hasNextLine()) println(it.nextLine())
    }
}