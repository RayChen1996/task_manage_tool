package com.soca.taskmanage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskManageApplication

fun main(args: Array<String>) {
	runApplication<TaskManageApplication>(*args)
}
