plugins {
    // Declare plugins for subprojects but don't apply them in the root project
    id("com.android.application") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("org.jetbrains.kotlin.plugin.compose") apply false
}

repositories {
    google()
    mavenCentral()
}
