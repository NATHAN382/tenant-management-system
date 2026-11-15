// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // KSP generates Room's database code while building
    id("com.google.devtools.ksp") version "2.3.4" apply false
    alias(libs.plugins.android.application) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}
