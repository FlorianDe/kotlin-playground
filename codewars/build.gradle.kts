plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "codewars.Main"
}

dependencies {
    compile(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}