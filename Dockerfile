FROM openjdk:21
COPY ./target/Calci-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","Calci-1.0-SNAPSHOT.jar","org.example.Main"]