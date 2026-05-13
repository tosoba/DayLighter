package com.trm.daylighter

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.api.dsl.ProductFlavor
import org.gradle.api.Project

@Suppress("EnumEntryName")
enum class FlavorDimension {
  contentType
}

// The content for the app can either come from local static data which is useful for demo
// purposes, or from a production backend server which supplies up-to-date, real content.
// These two product flavors reflect this behavior.
@Suppress("EnumEntryName")
enum class DayLighterFlavor(
  val dimension: FlavorDimension,
  val applicationIdSuffix: String? = null,
) {
  dev(FlavorDimension.contentType),
  prod(FlavorDimension.contentType, ".prod"),
}

fun Project.configureFlavors(
  commonExtension: CommonExtension,
  flavorConfigurationBlock: ProductFlavor.(flavor: DayLighterFlavor) -> Unit = {},
) {
  commonExtension.apply {
    flavorDimensions += FlavorDimension.contentType.name
    when (this) {
      is ApplicationExtension -> {
        productFlavors {
          DayLighterFlavor.entries.forEach {
            create(it.name) {
              dimension = it.dimension.name
              flavorConfigurationBlock(this, it)
              if (it.applicationIdSuffix != null) {
                this.applicationIdSuffix = it.applicationIdSuffix
              }
            }
          }
        }
      }
      is LibraryExtension -> {
        productFlavors {
          DayLighterFlavor.entries.forEach {
            create(it.name) {
              dimension = it.dimension.name
              flavorConfigurationBlock(this, it)
            }
          }
        }
      }
    }
  }
}
