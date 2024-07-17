plugins {
  alias(libs.plugins.kotlin.jvm)
}

dependencies {
  implementation(libs.kotlin.stdlib)

  implementation(libs.ksp.api)
  implementation(libs.kotlinpoet.ksp)
}
