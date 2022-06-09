libraryDependencies ++= Seq(
  "junit" %  "junit" % "4.12" % "test",
  "bsf" %  "bsf" % "2.4.0",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided",
  "org.scalatest" %% "scalatest"   % "3.1.0-SNAP9" % Test withSources(),
  "junit"             %  "junit"       % "4.12"        % Test,
  "org.hamcrest" % "hamcrest-all" % "1.3"
)

version := "1.0"

scalaVersion := "2.12.10"

description := "Modified version of Beanshell"

unmanagedSourceDirectories in Compile += baseDirectory.value / "generated-sources"

name := "BeanShell-mod"

organization := "io.github.scalahub"
