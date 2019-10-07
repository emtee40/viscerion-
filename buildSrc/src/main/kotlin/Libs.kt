/*
 * Copyright © 2017-2019 WireGuard LLC.
 * Copyright © 2018-2019 Harsh Shandilya <msfjarvis@gmail.com>. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val annotation: String = "androidx.annotation:annotation:" + Versions.annotation

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

    const val biometric: String = "androidx.biometric:biometric:" + Versions.biometric

    /**
     * http://tools.android.com
     */
    const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
            Versions.constraintlayout

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

    const val databinding_adapters: String = "androidx.databinding:databinding-adapters:" +
            Versions.androidx_databinding

    /**
     * https://developer.android.com/studio
     */
    const val databinding_common: String = "androidx.databinding:databinding-common:" +
            Versions.androidx_databinding

    /**
     * https://developer.android.com/studio
     */
    const val databinding_compiler: String = "androidx.databinding:databinding-compiler:" +
            Versions.androidx_databinding

    const val databinding_runtime: String = "androidx.databinding:databinding-runtime:" +
            Versions.androidx_databinding

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val fragment_ktx: String = "androidx.fragment:fragment-ktx:" + Versions.fragment_ktx

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val preference: String = "androidx.preference:preference:" + Versions.preference

    const val security_crypto: String = "androidx.security:security-crypto:" +
            Versions.security_crypto

    const val slice_builders_ktx: String = "androidx.slice:slice-builders-ktx:" +
            Versions.slice_builders_ktx

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val slice_builders: String = "androidx.slice:slice-builders:" + Versions.slice_builders

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val slice_core: String = "androidx.slice:slice-core:" + Versions.slice_core

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val work_runtime_ktx: String = "androidx.work:work-runtime-ktx:" +
            Versions.work_runtime_ktx

    const val recyclical: String = "com.afollestad:recyclical:" + Versions.recyclical

    /**
     * https://developer.android.com/studio
     */
    const val aapt2: String = "com.android.tools.build:aapt2:" + Versions.aapt2

    const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
            Versions.com_android_tools_build_gradle

    /**
     * https://developer.android.com/studio
     */
    const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

    const val r8: String = "com.android.tools:r8:" + Versions.r8

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val material: String = "com.google.android.material:material:" + Versions.material

    const val com_gradle_build_scan_gradle_plugin: String =
            "com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:" +
            Versions.com_gradle_build_scan_gradle_plugin

    /**
     * https://github.com/JakeWharton/ThreeTenABP/
     */
    const val threetenabp: String = "com.jakewharton.threetenabp:threetenabp:" +
            Versions.threetenabp

    /**
     * https://github.com/JakeWharton/timber
     */
    const val timber: String = "com.jakewharton.timber:timber:" + Versions.timber

    /**
     * https://github.com/kroegerama/barcode-kaiteki
     */
    const val barcode_kaiteki: String = "com.kroegerama:barcode-kaiteki:" + Versions.barcode_kaiteki

    /**
     * http://github.com/square/leakcanary/
     */
    const val leakcanary_android: String = "com.squareup.leakcanary:leakcanary-android:" +
            Versions.leakcanary_android

    const val de_fayard_buildsrcversions_gradle_plugin: String =
            "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * http://github.com/retrostreams/android-retrofuture/
     */
    const val android_retrofuture: String = "net.sourceforge.streamsupport:android-retrofuture:" +
            Versions.android_retrofuture

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_annotation_processing_gradle: String =
            "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:" +
            Versions.kotlin_annotation_processing_gradle

    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
            Versions.kotlin_gradle_plugin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
            Versions.kotlin_stdlib_jdk8

    const val koin_android: String = "org.koin:koin-android:" + Versions.org_koin

    const val koin_core: String = "org.koin:koin-core:" + Versions.org_koin
}
