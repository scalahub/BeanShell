libraryDependencies ++= Seq(
  "junit" %  "junit" % "4.12" % "test",
  "bsf" %  "bsf" % "2.4.0",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided",
  "org.scalatest" %% "scalatest"   % "3.1.0-SNAP9" % Test withSources(),
  "junit"             %  "junit"       % "4.12"        % Test,
  "org.hamcrest" % "hamcrest-all" % "1.3"
)

unmanagedSourceDirectories in Compile += baseDirectory.value / "target/generated-sources"

name := "BeanShell" 

organization := "scalahub" 

//scalaVersion := "2.12.8"   // comment this line to use Scala 2.13-RC1

scmInfo := Some(
  ScmInfo(  
    url(s"https://github.com/scalahub/$name"),
    s"git@github.com:scalahub/$name.git"
  )
)

version := "0.1.0"

