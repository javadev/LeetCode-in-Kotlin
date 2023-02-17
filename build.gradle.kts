plugins {
    kotlin("jvm") version "1.8.10"
    jacoco
    id("org.sonarqube")version "3.5.0.2730"
    id("com.diffplug.spotless") version "6.12.0"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:[5.9.2,)")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:[5.9.2,)")
    testImplementation("org.hamcrest:hamcrest-core:[2.2,)")
    testImplementation("org.zapodot:embedded-db-junit-jupiter:[2.1.1,)")
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = Runtime.getRuntime().availableProcessors()
}

group = "com.github.javadev"
version = "1.9-SNAPSHOT"
description = "leetcode-in-kotlin"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
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
        ktlint("0.43.0").userData(mapOf(
                "max_line_length" to "120"
                ))
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
