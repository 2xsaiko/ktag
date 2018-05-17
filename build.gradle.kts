import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "therealfarfetchd.ktag"
version = "1.0.1"

buildscript {
  var kotlin_version: String by extra
  kotlin_version = "1.2.+"

  repositories {
    mavenCentral()
  }

  dependencies {
    classpath(kotlin("gradle-plugin", kotlin_version))
  }
}

plugins { java }

apply {
  from("publish.gradle")
  plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
  mavenCentral()
}

dependencies {
  compile(kotlin("stdlib-jdk8", kotlin_version))
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
