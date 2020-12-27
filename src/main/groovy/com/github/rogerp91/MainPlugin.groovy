package com.github.rogerp91

import org.gradle.api.Plugin
import org.gradle.api.Project

class MainPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.getTasks().create("helloWorld", HelloWorldTask.class)
    }
}
