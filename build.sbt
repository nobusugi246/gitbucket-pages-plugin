organization  := "gitbucket"

name          := "pages-plugin"

version       := "0.1"

scalaVersion  := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

resolvers += Resolver.jcenterRepo

resolvers += "amateras-repo" at "http://amateras.sourceforge.jp/mvn/"

libraryDependencies ++= Seq(
  "gitbucket"          % "gitbucket-assembly" % "3.9.0" % "provided",
  "javax.servlet"      % "javax.servlet-api"  % "3.1.0" % "provided"
)
