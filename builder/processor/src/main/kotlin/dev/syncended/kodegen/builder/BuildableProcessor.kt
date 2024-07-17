package dev.syncended.kodegen.builder

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration

class BuildableProcessor(
  private val codeGenerator: CodeGenerator,
  private val logger: KSPLogger
) : SymbolProcessor {

  override fun process(resolver: Resolver): List<KSAnnotated> {
    val symbols = resolver.getSymbolsWithAnnotation(BUILDABLE)
      .filterIsInstance<KSClassDeclaration>()


    TODO("Not yet implemented")
  }

  private companion object {
    const val BUILDABLE = "dev.syncended.kodegen.builder.Buildable"
  }
}