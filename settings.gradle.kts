plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("builder:api")
include("builder:processor")

include("mapper:api")
include("mapper:processor")

include("playground")
