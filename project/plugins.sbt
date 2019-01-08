//import sbt.addSbtPlugin
// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.16")

// Play enhancer - this automatically generates getters/setters for public fields
// and rewrites accessors of these fields to use the getters/setters. Remove this
// plugin if you prefer not to have this feature, or disable on a per project
// basis using disablePlugins(PlayEnhancer) in your build.sbt
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.2")

// Play Ebean support, to enable, uncomment this line, and enable in your build.sbt using
// enablePlugins(PlayEbean).
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.1.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.0")
//addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.6.8")
