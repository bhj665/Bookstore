#
# Mvn Build
#
FROM maven:3.8.6-eclipse-temurin-17-focal AS build 
COPY src /tree/main/src
COPY pom.xml /tree/main
RUN mvn -f /tree/main/pom.xml clean package

#
# Jar Package
#
FROM eclipse-temurin:17-jre-focal
# Bookstore-0.0.1-SNAPSHOT.jar  = <artifactId>-<version>.jar (pom.xml)
COPY --from=build /tree/main/target/Bookstore-0.0.1-SNAPSHOT.jar /usr/local/lib/bookstore.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/bookstore.jar"]