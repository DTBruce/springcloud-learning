FROM java:8
VOLUME /tmp

COPY target/eureka-server-1.0.jar eureka-8001.jar

RUN bash -c "touch /eureka-8001.jar"

EXPOSE 8001

ENTRYPOINT ["java","-jar","/eureka-8001.jar"]