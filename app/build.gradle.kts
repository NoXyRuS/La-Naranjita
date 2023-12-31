plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.lanaranjita"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.lanaranjita"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //-----------------Dependencias----------------------------------//

    // Lifecycle components
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    annotationProcessor ("androidx.lifecycle:lifecycle-compiler:2.3.1")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")

    // Dagger
    implementation ("com.google.dagger:dagger-android:2.35.1")
    annotationProcessor ("com.google.dagger:dagger-android-processor:2.33")

    // Picasso
    implementation ("com.squareup.picasso:picasso:2.71828")

    // Stetho
    implementation ("com.facebook.stetho:stetho:1.5.1")
    implementation ("com.facebook.stetho:stetho-okhttp3:1.5.1")

    //Libreia Spinner
    implementation ("com.github.ganfra:material-spinner:2.0.0")

    //Java Mail
    implementation ("com.sun.mail:android-mail:1.6.6")
    implementation ("com.sun.mail:android-activation:1.6.6")

    //Google Maps
    implementation ("com.google.android.gms:play-services-maps:17.0.1")
    implementation ("com.google.android.gms:play-services-places:17.0.0")

    //Sweet Alert
    implementation ("com.github.f0ris.sweetalert:library:1.6.2")

    //ImagenView Circle
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Carrusel
    implementation ("com.github.smarteist:autoimageslider:1.4.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.11.0")

    //PDF VIEWER
    implementation ("com.github.barteksc:android-pdf-viewer:2.8.2")
}