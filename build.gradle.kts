plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.exemple"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Fournit kotlin.test (assertions et annotations)
    testImplementation(kotlin("test"))
    // Fournit le moteur d'exécution JUnit 5
    implementation("org.junit.jupiter:junit-jupiter:5.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")

}

tasks.test {
    useJUnitPlatform() // Indique à Gradle d'utiliser la plateforme JUnit 5


}

kotlin {
    jvmToolchain(23)
}