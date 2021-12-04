package com.github.briancsparks.star8.services

import com.intellij.openapi.project.Project
import com.github.briancsparks.star8.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
