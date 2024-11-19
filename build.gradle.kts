plugins {
    kotlin("jvm") version "2.0.21"
    jacoco
    id("org.sonarqube") version "5.1.0.4882"
    id("com.diffplug.spotless") version "6.21.0"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.21")
    testImplementation("org.junit.jupiter:junit-jupiter:[5.11.0,)")
    testImplementation("org.hamcrest:hamcrest-core:[2.2,)")
    testImplementation("org.zapodot:embedded-db-junit-jupiter:[2.2.0,)")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:[1.11.0,)")
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = Runtime.getRuntime().availableProcessors()
}

group = "com.github.javadev"
version = "1.30-SNAPSHOT"
description = "leetcode-in-kotlin"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

spotless {
    kotlin {
        encoding("UTF-8")
        target("**/src/**/*.kt")
        ktlint("0.50.0").editorConfigOverride(
            mapOf(
                "max_line_length" to "120",
                "indent_size" to "4",
                "ktlint_standard_package-name" to "disabled",
                "ktlint_standard_comment-wrapping" to "disabled"
            )
        )
        toggleOffOn()
        trimTrailingWhitespace()
        endWithNewline()
    }
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        html.required.set(false)
    }
}
