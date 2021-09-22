package com.github.byzxy.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.byzxy.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
