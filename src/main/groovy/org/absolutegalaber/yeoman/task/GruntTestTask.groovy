package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class GruntTestTask extends BaseYeomanTask {
    GruntTestTask() {
        description = "Calls 'grunt test'"
    }

    @TaskAction
    def gruntTest() {
        logToolVersion('grunt')
        executeCommand(['grunt', 'test'])
    }
}
