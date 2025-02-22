plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.taskmanager" // Replace with your package name
    compileSdk = 34 // Or your preferred compile SDK version
    var targetSdk = 34 // Or your preferred target SDK version

    defaultConfig {
        applicationId = "com.example.taskmanager" // Replace with your package name
        minSdk = 24 // Or your preferred minimum SDK version
        var targetSdk = 34 // Or your preferred target SDK version
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4" // Or latest stable version
        // kotlinCompilerVersion = "1.8.10" // If needed
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0") // Or latest
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Or latest
    implementation("androidx.activity:activity-compose:1.8.2") // Or latest
    implementation(platform("androidx.compose:compose-bom:2023.03.00")) // Or latest
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-util")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3:1.1.2") // Or latest Material 3
    implementation("androidx.compose.material:material:1.5.4") // Or latest Material
    implementation("androidx.room:room-runtime:2.6.1") // Or latest
    kapt("androidx.room:room-compiler:2.6.1") // Or latest
    implementation("androidx.room:room-ktx:2.6.1") // Or latest (For Coroutines with Room)
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.20-1.0.11") // Replace with the latest version
    // ... other dependencies

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}