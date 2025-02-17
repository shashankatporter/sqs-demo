plugins {
  id(Plugins.kotlinKapt)
}
dependencies {
  implementation(project(Modules.QUEUEBERT.domain))
  implementation(Libs.KotlinUtils.openTracing)
  implementation(Libs.KotlinUtils.exposed)


  implementation(Libs.Micrometer.core)
  implementation(Libs.Dagger.dagger)
  kapt(Libs.Dagger.compiler)
}
