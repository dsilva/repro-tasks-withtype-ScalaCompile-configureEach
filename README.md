# repro-tasks-withtype-ScalaCompile-configureEach
repro gradle build failures with `tasks.withType(ScalaCompile::class.java).configureEach`


This doesn't happen every time, but if you keep repeating the following then eventually this happens:

```
$ ./gradlew clean :a:classes --no-build-cache
Parallel execution is an incubating feature.
> Task :d:compileScala FAILED

> Task :b:compileScala
Pruning sources from previous analysis, due to incompatible CompileSetup.

> Task :c:compileScala
Pruning sources from previous analysis, due to incompatible CompileSetup.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':d:compileScala'.
> java.util.ConcurrentModificationException (no error message)

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 5s
7 actionable tasks: 7 executed
```

