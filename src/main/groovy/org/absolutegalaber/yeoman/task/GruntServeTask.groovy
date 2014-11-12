package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class GruntServeTask extends ColorAwareYeomanTask {
    GruntServeTask() {
        description = "Calls 'grunt serve'"
    }

    @TaskAction
    def gruntServe() {
        logToolVersion('grunt')
        executeCommand(['grunt', 'serve'])
    }
}
