package com.github.mmokross.precommithookplugin.services

import com.intellij.openapi.project.Project
import com.github.mmokross.precommithookplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
