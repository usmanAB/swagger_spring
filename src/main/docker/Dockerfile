FROM lwieske/java-8
VOLUME /tmp
EXPOSE 8080
ADD exercice3.jar app.war
#RUN sh -c "echo demo-string.war"
RUN sh -c "touch /app.war"
ENTRYPOINT ["sh", "-c","java -jar /app.war"]