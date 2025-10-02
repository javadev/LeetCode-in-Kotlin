plugins {
    kotlin("jvm") version "2.1.21"
    jacoco
    id("org.sonarqube") version "6.2.0.5505"
    id("com.diffplug.spotless") version "7.0.4"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.21")
    testImplementation("org.junit.jupiter:junit-jupiter:[5.13.3,)")
    testImplementation("org.hamcrest:hamcrest-core:[3.0,)")
    testImplementation("org.zapodot:embedded-db-junit-jupiter:[2.2.3,)")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:[1.13.3,)")
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = Runtime.getRuntime().availableProcessors()
}

group = "com.github.javadev"
version = "1.41-SNAPSHOT"
description = "leetcode-in-kotlin"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
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
