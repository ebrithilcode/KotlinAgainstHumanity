import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
    application
}

group = "com.ebrithil.kah"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

application {
    mainClassName = ""
}



dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

project(":server") {
    apply(plugin="application")
    apply(plugin="kotlin")
}

project(":client") {
    apply(plugin="kotlin")
}

project(":launcher") {
    apply(plugin="kotlin")
}

project(":common") {
    apply(plugin="kotlin")
}