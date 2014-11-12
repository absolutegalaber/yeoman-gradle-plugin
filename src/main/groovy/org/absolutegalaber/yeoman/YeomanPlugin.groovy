package org.absolutegalaber.yeoman

import org.absolutegalaber.yeoman.task.*
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Josip.Mihelko @ Gmail
 */
class YeomanPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.extensions.create('yeoman', YeomanPluginExtension)

        project.task('npm', type: NpmInstallTask)
        project.task('bower', type: BowerInstallTask)
        project.task('bowerList', type: BowerListTask)
        project.task('grunt', type: GruntBuildTask)
        project.task('gruntTest', type: GruntTestTask)
        project.task('gruntServe', type: GruntServeTask)
    }
}
