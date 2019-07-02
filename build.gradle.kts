plugins {
    base
    kotlin("jvm") version "1.3.31" apply false
}

group = "de.florian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allprojects {
    group = "de.florian"
    version = "1.0"

    repositories {
        jcenter()
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}