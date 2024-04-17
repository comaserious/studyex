plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    //spring context dependancy
// https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation 'org.springframework:spring-context:6.0.11'
//lombok dependancy
    implementation 'org.projectlombok:lombok:1.18.24'
    annotationProcessor 'org.projectlombok:lombok:1.18.24'
// https://mvnrepository.com/artifact/jakarta.annotation/jakarta.annotation-api
    implementation 'jakarta.annotation:jakarta.annotation-api:1.3.5'
}

tasks.test {
    useJUnitPlatform()
}