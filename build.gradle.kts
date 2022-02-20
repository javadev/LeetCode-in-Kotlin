plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.kotlinx.kover") version "0.5.0"
    id("org.sonarqube") version "3.3"
    id("com.diffplug.spotless") version "6.1.2"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:[5.8.2,)")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:[5.8.2,)")
    testImplementation("org.hamcrest:hamcrest-core:[2.2,)")
}

tasks.test {
    useJUnitPlatform()
}

group = "com.github.javadev"
version = "1.1-SNAPSHOT"
description = "leetcode-in-kotlin"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

spotless {
    kotlin {
        encoding("UTF-8")
        target("**/*.kt")
        ktlint("0.43.0")
        toggleOffOn()
        trimTrailingWhitespace()
        endWithNewline()
    }
}

tasks.koverXmlReport {
    isEnabled = true    
}

sonarqube {
    properties {
        property("sonar.coverage.jacoco.xmlReportPaths", "${project.buildDir}/reports/kover/project-xml")
    }
}
