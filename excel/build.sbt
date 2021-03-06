lazy val commonSettings = Seq(
  organization := "com.pharbers.aqll",
  version := "1.0",
  scalaVersion := "2.10.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
	name := "pharber-excel",
	fork in run := true,
	javaOptions += "-Xmx4G"
  )
