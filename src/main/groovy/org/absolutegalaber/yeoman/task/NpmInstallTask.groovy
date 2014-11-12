package org.absolutegalaber.yeoman.task

import org.gradle.api.tasks.TaskAction

/**
 * Created by Josip.Mihelko @ Gmail
 */
class NpmInstallTask extends BaseYeomanTask {

    NpmInstallTask() {
        description = "Call npm install"
    }

    @TaskAction
    def npmInstall() {
        logToolVersion('npm')
        executeCommand(['npm', 'install'])
    }
}
