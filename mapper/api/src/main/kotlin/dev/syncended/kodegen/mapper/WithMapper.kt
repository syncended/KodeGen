package dev.syncended.kodegen.mapper

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class WithMapper(
  val target: KClass<*>,
  val qualifier: String = ""
)