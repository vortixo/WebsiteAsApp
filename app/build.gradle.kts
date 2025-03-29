plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid) // Добавляем плагин Kotlin
    id("com.android.application") version "7.4.2" // Java 11 compatible version
    id("org.jetbrains.kotlin.android") version "1.8.22"
}

android {
    namespace = "com.sharafat.website"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.goapp.lumomedia"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "v0.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.core.ktx) // Kotlin extensions
    
    // Тестовые зависимости
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}