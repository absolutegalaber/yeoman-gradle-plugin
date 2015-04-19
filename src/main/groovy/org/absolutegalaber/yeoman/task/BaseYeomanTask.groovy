package org.absolutegalaber.yeoman.task

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
        List<String> theCommand = commandToExecute([tool, '--version'])
        project.exec {
            workingDir = project.file(project.extensions.yeoman.yeomanDir)
            commandLine = theCommand
        }
    }

    public void executeCommand(List<String> command) {
        logger.info("Executing: ${command} in ${project.extensions.yeoman.yeomanDir}")
        List<String> theCommand = commandToExecute(command)
        logger.quiet("Command to be executed: {}", theCommand)
        project.exec {
            workingDir = project.file(project.extensions.yeoman.yeomanDir)
            commandLine = theCommand
        }
    }

    /**
     * Adds 'cmd /c' in fornt of a command line if being executed on windows.
     * @param command The original command line to be eecuted
     * @return A command line that is executable on windows.
     */
    private List<String> commandToExecute(List<String> command) {
        List<String> toReturn = new ArrayList<>()
        if (isWindows()) {
            logger.quiet("##### Running on Windows ==> using cmd /c {command}")
            toReturn.add('cmd')
            toReturn.add('/c')
        }
        toReturn.addAll(command)
        toReturn
    }

    private boolean isWindows() {
        return System.getProperty('os.name').toLowerCase().contains('windows')
    }
}
