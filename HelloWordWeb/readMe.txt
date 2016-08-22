#All commands you have to run from dirrectory HelloWordWeb.

#Maven:
#Command for build and run tests:
mvn clean install
#Command for build without run tests:
mvn clean -Dmaven.test.skip=true install
#Find ~/HelloWordWeb/target/HelloWordWeb-1.0.war

#Gradle
#Command for build and run tests:
gradle clean build
#Command for build without run tests:
gradle clean build -x test
#Find ~/HelloWordWeb/buid/libs/HelloWordWeb-1.0.war
#Find ~HelloWordWeb/first-child/build/libs/first-child.jar

#Ant
#Command for build:
ant war
#Find ~/HelloWordWeb/buid/HelloWordWeb.war
#Command for run tests:
ant junit

extra mile: for ant-building realised automatic downloading from central maven repository
            for gradle-building realised multi-module project