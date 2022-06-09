ThisBuild / organization := "io.github.scalahub"
ThisBuild / organizationName := "scalahub"
ThisBuild / organizationHomepage := Some(url("https://github.com/scalahub"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/scalahub/BeanShell"),
    "scm:git@github.scalahub/BeanShell.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "scalahub",
    name = "scalahub",
    email = "23208922+scalahub@users.noreply.github.com",
    url = url("https://github.com/scalahub")
  )
)

ThisBuild / description := "Clone of BeanShell for using in DQL"
ThisBuild / licenses := List(
  "The Unlicense" -> new URL("https://unlicense.org/")
)
ThisBuild / homepage := Some(url("https://github.com/scalahub/BeanShell"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true

ThisBuild / versionScheme := Some("early-semver")
