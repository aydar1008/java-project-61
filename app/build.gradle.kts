plugins {
    application
    checkstyle
    id("com.github.ben-manes.versions") version "0.52.0"
    id("java")
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

// Конфигурация плагина org.sonarqube
sonar {
    properties {
        property("sonar.projectKey", "aydar1008_java-project-61")
        property("sonar.organization", "aydar1008")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.login", System.getenv("3cda805d91dc6465effaf07f2c4dcdc91264610c"))
    }
}
