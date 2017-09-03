gitbucket-plugin-template
========
Template project for GitBucket plugin

Run `sbt package` and copy generated `/target/scala-2.12/gitbucket-helloworld-plugin_2.12-1.0.0.jar` to `~/.gitbucket/plugins/` (If the directory does not exist, create it by hand before copying the jar).

Then start GitBucket and access to http://localhost:8080/helloworld in your web browser, you will see `Hello World!` response.
