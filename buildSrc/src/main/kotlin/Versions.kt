/*
 * Copyright © 2017-2019 WireGuard LLC.
 * Copyright © 2018-2019 Harsh Shandilya <msfjarvis@gmail.com>. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val annotation: String = "1.1.0"

    const val appcompat: String = "1.1.0"

    const val biometric: String = "1.0.0-beta02"

    const val constraintlayout: String = "2.0.0-beta2"

    const val core_ktx: String = "1.2.0-alpha04"

    const val androidx_databinding: String = "3.5.0"

    const val fragment_ktx: String = "1.2.0-alpha04"

    const val preference: String = "1.1.0"

    const val security_crypto: String = "1.0.0-alpha02"

    const val slice_builders_ktx: String = "1.0.0-alpha07"

    const val slice_builders: String = "1.1.0-alpha01"

    const val slice_core: String = "1.1.0-alpha01"

    const val work_runtime_ktx: String = "2.3.0-alpha01"

    const val recyclical: String = "1.1.0"

    const val aapt2: String = "3.5.0-5435860"

    const val com_android_tools_build_gradle: String = "3.5.0"

    const val lint_gradle: String = "26.5.0"

    const val r8: String = "1.5.68"

    const val material: String = "1.1.0-alpha10"

    const val com_gradle_build_scan_gradle_plugin: String = "2.4.2"

    const val threetenabp: String = "1.2.1"

    const val timber: String = "4.7.1"

    const val barcode_kaiteki: String = "1.1.1"

    const val leakcanary_android: String = "2.0-beta-3"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.5.0" // available: "0.6.1"

    const val android_retrofuture: String = "1.7.1"

    const val kotlin_annotation_processing_gradle: String = "1.3.50"

    const val kotlin_gradle_plugin: String = "1.3.50"

    const val kotlin_stdlib_jdk8: String = "1.3.41" // available: "1.3.50"

    const val org_koin: String = "2.0.1"

    /**
     *
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "5.6.2"

    const val gradleCurrentVersion: String = "5.6.2"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
