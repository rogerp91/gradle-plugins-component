package com.github.rogerp91

import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.apply plugin: "kotlin-android"

        project.afterEvaluate {
            project.tasks.all { task ->
                task.outputs.doNotCacheIf("Kotlin and caching don't mix") { true }
            }
        }

        project.dependencies {
            implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.3.72'
        }
    }
}
