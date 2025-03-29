plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid) // Добавляем плагин Kotlin
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
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