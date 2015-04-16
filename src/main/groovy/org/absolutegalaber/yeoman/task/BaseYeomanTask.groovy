package org.absolutegalaber.yeoman.task

import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.DefaultTask

/**
 * Created by Josip.Mihelko @ Gmail
 */
abstract class BaseYeomanTask extends DefaultTask {
    BaseYeomanTask() {
        group = 'yeoman'
    }

    public void logToolVersion(String tool) {
        logger.quiet("###### Version of ${tool}:")
        project.exec {
            workingDir = project.file(project.extensions.yeoman.yeomanDir)
            commandLine = [tool, '--version']
        }
    }

    public void executeCommand(List<String> command) {
        logger.info("Executing: ${command} in ${project.extensions.yeoman.yeomanDir}")
        List<String> theCommand = new ArrayList<>();
        if (isWindows()) {
            theCommand.add("cmd")
            theCommand.add("/c")
        }
        theCommand.addAll(command)
        project.exec {
            workingDir = project.file(project.extensions.yeoman.yeomanDir)
            commandLine = theCommand
        }
    }

    private boolean isWindows() {
        return Os.isFamily(Os.FAMILY_WINDOWS)
    }
}
