gitbucket-plugin-template
========
Template project for GitBucket plugin

Run `./sbt.sh package` (use `sbt.bat` instead on Windows) and copy generated `/target/scala-2.12/gitbucket-helloworld-plugin_2.12-1.0.0.jar` to `~/.gitbucket/plugins/` (If the directory does not exist, create its directory by hand).

Then start GitBucket and access to http://localhost:8080/helloworld by your web browser, you will see `Hello World!` response.
