# HelloWorldSpringBootApp



mvn clean verify install -DskipTests

mvn dependency-check:aggregate

mvn org.cyclonedx:cyclonedx-maven-plugin:makeAggregateBom

mvn dependency:purge-local-repository -DreResolve=false


docker pull dependencytrack/bundled
docker volume create dependency-track
docker run -d -p 7070:8080 --name dependency-track -v dependency-track:/data dependencytrack/bundled