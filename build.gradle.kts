import org.gradle.api.tasks.scala.ScalaCompile

allprojects {
  plugins.withType(ScalaPlugin::class.java) {

    dependencies {
      "compile"("org.scala-lang:scala-library:2.12.6")
    }
    tasks.withType(ScalaCompile::class.java).configureEach {
      scalaCompileOptions.additionalParameters = listOf("-explaintypes")
    }
  }
}

