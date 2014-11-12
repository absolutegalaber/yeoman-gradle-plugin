package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class BowerInstallTask extends BaseYeomanTask {
    BowerInstallTask() {
        description = "Calls 'bower install"
    }

    @TaskAction
    def bowerInstall() {
        logToolVersion('bower')
        executeCommand(['bower', 'install'])
    }
}
