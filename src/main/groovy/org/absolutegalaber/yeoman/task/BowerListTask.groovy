package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class BowerListTask extends ColorAwareYeomanTask {

    BowerListTask() {
        description = "Calls 'bower list'"
    }

    @TaskAction
    def bowerList() {
        logToolVersion('bower')
        executeCommand(['bower', 'list'])
    }
}
