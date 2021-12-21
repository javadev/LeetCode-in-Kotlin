plugins {
    kotlin("jvm") version "1.6.10"
    jacoco
    id("org.sonarqube") version "3.3"
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0")
    testImplementation("junit:junit:[4.13.2,)")
    testImplementation("org.hamcrest:hamcrest-core:[2.2,)")
}

group = "com.github.javadev"
version = "1.0-SNAPSHOT"
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

tasks {
  jacocoTestReport {
    reports {
      xml.required.set(true)
      html.required.set(false)
    }
  }
}

sonarqube {
    properties {
        property("sonar.inclusions", "*.java,*.kt")
        property("sonar.java.binaries", "$projectDir/build/classes/kotlin")
    }
}
