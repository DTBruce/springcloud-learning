FROM java:8
VOLUME /tmp

ADD eureka-server-1.1.jar eureka-8001.jar

RUN bash -c "touch /eureka-8001.jar"

EXPOSE 8001

ENTRYPOINT ["java","-jar","/eureka-8001.jar"]

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone