plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

group = "yalija"
version = "0.1.0"

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "yalija.main.Lox"
        )
    }
}
