plugins {
	java
}

java.sourceCompatibility = JavaVersion.VERSION_17

allprojects {
	apply(plugin = "java")
	java.sourceCompatibility = JavaVersion.VERSION_17
	group = "com.dzone"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}

