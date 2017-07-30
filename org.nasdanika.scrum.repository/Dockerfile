FROM centos

RUN yum update -y \
	&& yum install -y \
		java-1.8.0-openjdk-devel \
		graphviz \
	&& yum clean all 
		

COPY x86_64 /opt/nasdanika-scrum

RUN chmod a+x /opt/nasdanika-scrum/eclipse	

ENTRYPOINT ["/opt/nasdanika-scrum/eclipse"]

EXPOSE 8080