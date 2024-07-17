package dev.syncended.kodegen.builder

import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class BuildableProcessorProvider : SymbolProcessorProvider {

  override fun create(environment: SymbolProcessorEnvironment) = BuildableProcessor(
    codeGenerator = environment.codeGenerator,
    logger = environment.logger
  )
}
