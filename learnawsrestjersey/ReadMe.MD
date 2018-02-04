SSH Command:

Ec2 Instance Id with tomcat installed : i-01abfd12bd6213922


ssh -i FirstKeyPair.pem  ec2-user@ 18.218.210.117

sudo yum install tomcat8 tomcat8-webapps tomcat8-admin-webapps tomcat8-docs-webapp

sudo yum remove tomcat8 tomcat8-webapps tomcat8-admin-webapps tomcat8-docs-webapp

sudo fuser -v -n tcp 8080
netstat -na | grep 8080
yum update

yum install java-1.8.0

sudo service tomcat7 start

sudo yum install tomcat7

https://medium.com/@rijoalvi/setting-up-an-amazon-ec2-aws-server-with-tomcat7-running-on-ports-80-443-mysql-oracle-jdk-1-68bcc42bdb94


sudo 

30-Dec-2017 15:33:28.923 INFO [main] org.apache.catalina.core.StandardEngine.startInternal Starting Servlet Engine: Apache Tomcat/8.5.23
30-Dec-2017 15:33:28.931 INFO [localhost-startStop-1] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/var/lib/tomcat8/webapps/examples]
30-Dec-2017 15:33:28.975 WARNING [localhost-startStop-1] org.apache.catalina.startup.SetContextPropertiesRule.begin [SetContextPropertiesRule]{Context} Setting property 'allowLinking' to 'true' did not find a matching property.
30-Dec-2017 15:33:29.564 SEVERE [localhost-startStop-1] org.apache.catalina.core.ContainerBase.addChildInternal ContainerBase.addChild: start:
 org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/examples]]
        at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167)
        at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:752)
        at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:728)
        at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:734)
        at org.apache.catalina.startup.HostConfig.deployDirectory(HostConfig.java:1144)
        at org.apache.catalina.startup.HostConfig$DeployDirectory.run(HostConfig.java:1878)
        at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:473)
        at java.util.concurrent.FutureTask.run(FutureTask.java:262)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1152)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:622)
        at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.NullPointerException
        at org.apache.tomcat.util.scan.StandardJarScanner.process(StandardJarScanner.java:337)
        at org.apache.tomcat.util.scan.StandardJarScanner.scan(StandardJarScanner.java:193)



org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/examples]]