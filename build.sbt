name := """uwanja"""
organization := "com.uwanja"

version := "1.0.0"

//lazy val root = (project in file(".")).enablePlugins(PlayJava)

lazy val root = (project in file(".")).enablePlugins(PlayJava, SbtWeb, PlayEbean)

scalaVersion := "2.12.4"

//libraryDependencies += guice

libraryDependencies ++= Seq(
  guice,
  evolutions, jdbc,

  "commons-io" % "commons-io" % "2.5" withSources(),
  "org.apache.commons" % "commons-text" % "1.3",
  "org.apache.poi" % "poi" % "3.14",
  "org.apache.poi" % "poi-ooxml" % "3.14",
  "mysql" % "mysql-connector-java" % "5.1.27",
  "org.apache.pdfbox" % "pdfbox" % "2.0.3",
  "com.maxmind.geoip2" % "geoip2" % "2.8.1",
  "javax.mail" % "mail" % "1.4.7",
  "org.scala-lang" % "scala-library" % "2.12.2",
  "be.objectify" %% "deadbolt-java" % "2.6.1",
  "org.dom4j" % "dom4j" % "2.1.0",
  //"org.webjars.npm" % "react-dropzone-component" % "1.0.4",
  // Testing libraries for dealing with CompletionStage...
  "org.assertj" % "assertj-core" % "3.6.2" % Test,
  "org.awaitility" % "awaitility" % "2.0.0" % Test,
  //for email and message templates
  "org.freemarker" % "freemarker" % "2.3.28",
  "org.webjars" %% "webjars-play" % "2.6.3",
  //for react
  // reactjs
  "org.webjars" % "react" % "15.3.1",
  "org.webjars.npm" % "react-dom" % "15.0.1",
)

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

fork in run := false

