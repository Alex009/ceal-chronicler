import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose") version "1.2.2"
    id("dev.icerock.mobile.multiplatform-resources")
}

android {
    namespace = "com.tri_tail.ceal_chronicler.android"
    compileSdk =  32
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
dependencies {
    var composeVersion = "1.3.2"
    implementation("androidx.compose.ui:ui-graphics:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")

    commonMainApi("dev.icerock.moko:resources:0.20.1")
    androidMainApi("dev.icerock.moko:resources-compose:0.20.1")
    jvmMainApi("dev.icerock.moko:resources-compose:0.20.1")
    commonTestImplementation("dev.icerock.moko:resources-test:0.20.1")
}

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared"))

                api(compose.foundation)
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.materialIconsExtended)
                api(compose.ui)
                api(compose.uiTooling)
            }
        }
        val commonTest by getting
        val androidMain by getting {
            api("dev.icerock.moko:resources-compose:0.20.1")
        }
        val desktopMain by getting

    }
}