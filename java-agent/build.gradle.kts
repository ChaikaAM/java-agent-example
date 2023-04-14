tasks.withType<Jar> {
    manifest {
//        attributes["Agent-Class"] = "com.dzone.JavaAgent"
        attributes["Premain-Class"] = "com.dzone.JavaAgent"
    }
}

tasks.jar {
    archiveFileName.set("java-agent.jar")
}