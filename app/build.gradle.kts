plugins {
    id("com.android.application") version "8.1.0"
    id("org.jetbrains.kotlin.android") version "1.8.22"
}

android {
    namespace = "com.sharafat.website"
       compileSdk = 34  // Для Kotlin DSL
       // ИЛИ
       compileSdkVersion(34)  // Альтернативный вариант
   }

    defaultConfig {
        applicationId = "com.vortixo.helldiverscompanion"
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
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.core:core-ktx:1.12.0")
    
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}