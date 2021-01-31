plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.10"
    id("org.jetbrains.kotlin.kapt") version "1.4.10"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.4.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("io.micronaut.application") version "1.3.2"
}

version = "0.1"
group = "br.com.cardoso"

val kotlinVersion=project.properties.get("kotlinVersion")
val micronautVersion=project.properties.get("micronautVersion")
repositories {
    mavenCentral()
    jcenter()
}

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("br.com.cardoso.*")
    }
}

dependencies {
    kapt(platform("io.micronaut:micronaut-bom:${micronautVersion}"))
    kapt("io.micronaut:micronaut-inject-java")
    kapt("io.micronaut:micronaut-validation")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("io.micronaut:micronaut-runtime")
    implementation("javax.annotation:javax.annotation-api")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-http-server-netty")
    runtimeOnly("ch.qos.logback:logback-classic")
    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
}


application {
    mainClass.set("br.com.cardoso.ApplicationKt")
}

java {
    sourceCompatibility = JavaVersion.toVersion("11")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
}

kapt {
    arguments {
        arg("micronaut.processing.incremental", true)
        arg("micronaut.processing.annotations", "br.com.cardoso.*")
        arg("micronaut.processing.group", "br.com.cardoso")
        arg("micronaut.processing.module", "rest-api")
    }
}