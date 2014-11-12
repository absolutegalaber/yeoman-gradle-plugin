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
yeomanDir - The root dir of the yeoman project - defaults to 'yo'
useColos - Wheather grunt and bower soulh be called with colored output (defaults to false).
```groovy
yeoman {
    yeomanDir = 'myApp'
    useColors = true
}
```


[yeoman-maven-plugin]:https://github.com/trecloux/yeoman-maven-plugin