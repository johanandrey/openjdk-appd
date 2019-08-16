FROM adoptopenjdk:11.0.3_7-jre-openj9-0.14.3

RUN mkdir /bgh
WORKDIR /bgh
COPY timer.jar ./
COPY appd.tar.gz /bgh/
RUN tar xvf appd.tar.gz 
CMD [ \
"java",\
"-javaagent:/bgh/appd/javaagent.jar",\
"-jar",\
"timer.jar"\
 ]