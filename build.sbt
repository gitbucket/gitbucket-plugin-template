name := "gitbucket-helloworld-plugin"

organization := "io.github.gitbucket"

version := "1.0.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "io.github.gitbucket" %% "gitbucket"         % "4.18.0" % "provided",
  "javax.servlet"        % "javax.servlet-api" % "3.1.0"  % "provided"
)

resolvers += Resolver.bintrayRepo("bkromhout", "maven") 

