buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
        classpath("app.cash.paparazzi:paparazzi-gradle-plugin:unused")
    }
}

subprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}
