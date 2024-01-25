FROM openjdk:17

COPY YoungMoscowServer.jar /app.jar

COPY data/ /data/

COPY public/ /public/

COPY events/ /events/

ENV SERVER_PORT=12345

ENTRYPOINT ["java","-jar","/app.jar"]
