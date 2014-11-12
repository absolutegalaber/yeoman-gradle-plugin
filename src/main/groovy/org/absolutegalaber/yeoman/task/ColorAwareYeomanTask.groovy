package org.absolutegalaber.yeoman.task

/**
 * Created by Josip.Mihelko @ Gmail
 */
class ColorAwareYeomanTask extends BaseYeomanTask{

    @Override
    void executeCommand(List<String> command) {
        if(!project.extensions.yeoman.useColors){
            command.add('--no-color')
        }
        super.executeCommand(command)
    }
}
