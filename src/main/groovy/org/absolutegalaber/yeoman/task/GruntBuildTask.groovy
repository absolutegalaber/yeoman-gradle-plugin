package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class GruntBuildTask extends ColorAwareYeomanTask {
    GruntBuildTask() {
        description = "Calls 'grunt build'"
    }

    @TaskAction
    def gruntBuild() {
        logToolVersion('grunt')
        executeCommand(['grunt', 'build'])
    }
}
