FROM jboss/wildfly

ADD ./target/api.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080