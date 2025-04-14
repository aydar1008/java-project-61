plugins {
    application
    checkstyle
    id("com.github.ben-manes.versions") version "0.52.0"
    // Плагин для публикации отчета о покрытии тестами на SonarQube
    id("org.sonarqube") version "6.0.1.5171"

}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}

// Конфигурация плагина org.sonarqube eb5625b826c4c03d62c08a49d469ff2096a72c8a
sonar {
    properties {
        property("sonar.token", System.getenv("SONAR_TOKEN"))
        property("sonar.projectKey", "aydar1008_java-project-61")
        property("sonar.organization", "aydar1008")
        property("sonar.java.binaries", "build/classes")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sourceEncoding", "UTF-8")
    }
}
