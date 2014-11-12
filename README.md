#yeoman-gradle-plugin

Used to integrate a yeoman build into your gradle build - inspired by [yeoman-maven-plugin].

##Usage
 To apply the plugin to your gradle build:
 ```groovy
  buildscript {
      repositories {
          maven {
              url 'http://dl.bintray.com/esistegalaber/maven/'
          }
      }
      dependencies {
          classpath 'org.absolutegalaber:yeoman-gradle-plugin:0.0.1'
      }
  }

  apply plugin: 'org.absolutegalaber.yeoman'
 ```

##Tasks
Checkout 'gradle tasks' to see the teh added tasks. the names of the tasks should actually pretty much explain what is going on...
 * gradle npm - 'npm install'
 * gradle bower - 'bower install'
 * gradle bowerList - 'bower list'
 * gradle gruntTest - 'grunt test'
 * gradle gruntServe - 'grunt server'
 * gradle grunt - 'grunt build'

##Config
Currently there are only 2 Configuration options for the plugin:
 * yeomanDir - The root dir of the yeoman project - defaults to 'yo'
 * useColors - Weather grunt and bower should be called with colored output (defaults to false).
```groovy
yeoman {
    yeomanDir = 'myApp'
    useColors = true
}
```

##What remains to be done
Toa setup a project simply
 * apply the plugin to your war gradle project and then
 * mkdir yo
 * cd yo
 * yo angular

The plugin does not hook any tasks into your gradle build. To do so I suggest something like this:
```groovy
build.dependsOn 'grunt'
```
To include the Angular app within you war:

```groovy
war {
    from 'yo/dist' // adds a file-set to the root of the archive
}
```


##Feedback
 * Open [Issues]
 * Email me: josip.mihelko (at) gmail.com
 * Have mercy with me, this is my first gradle plugin.

[yeoman-maven-plugin]:https://github.com/trecloux/yeoman-maven-plugin
[Issues]:https://github.com/absolutegalaber/yeoman-gradle-plugin/issues
[Email me]:mailto:josip.mihelko@gmail.com