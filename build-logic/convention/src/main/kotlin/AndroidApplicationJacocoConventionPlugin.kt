import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationJacocoConventionPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    with(target) { with(pluginManager) { apply("com.android.application") } }
  }
}
