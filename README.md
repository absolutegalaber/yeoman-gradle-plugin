#yeoman-gradle-plugin

Used to integrate a yeoman build into your gradle build - inspired by [yeoman-maven-plugin].

##Usage
 To apply the plugin to your gradle build:
 '''groovy
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
 '''


[yeoman-maven-plugin]:https://github.com/trecloux/yeoman-maven-plugin