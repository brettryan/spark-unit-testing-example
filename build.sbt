import sbt.ExclusionRule

name := "spark-unit-testing"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.5"

// Dependencies
libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-hive_2.10" % "1.6.2" % Provided,
)

// Test dependencies
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % Test,
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.apache.hadoop" % "hadoop-minicluster" % "2.5.0" % Test
)

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"

javaOptions ++= Seq("-Xms512M", "-Xmx2048M")

