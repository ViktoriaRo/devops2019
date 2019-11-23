By reading this readme you will be able to recreate the project and to run it.

### Prerequisites
- Unix system
- Installed Git 
- Google Account
- GitHub Account
- Vagrant
- VirtualBox

### Set up local environment

#### Clone the ropository
First of all you need to clone given repository.

``` 
git clone https://github.com/ViktoriaRo/devops2019.git
cd vagrant_envs
```

#### Install all dependences

#### Run the project
Up all vagrant files
Open github repo settings and add webhook URL of Jenkins with /github-webhook/ postfix. 
example: (https://selfish-gecko-92.localtunnel.me/github-webhook/)

#### Work on your code and commit changes
Go to opened Linux GUI open Eclipse make changes and commit them
### How does it work

#### Jenkins configuration
Jenkins configuration is the most challenging part. There is a configured image, however size of the box is more than 10 Gb, so can't store them here. Jenkins configuration have a lot of detailes. 
Install plugind for github, maven and java.
the pipeline is the following:
Source Code Management: https://github.com/GurovNik/incubator-druid.git
Build Triggers: GitHub hook trigger for GITScm polling
Build - execute shell - command: 
```
mvn clean install -Pdist -Dgpg.skip
cd distribution/target
tar -xzf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
mv ../../zk apache-druid-0.17.0-incubating-SNAPSHOT/zk
mv ../../UAT_jar apache-druid-0.17.0-incubating-SNAPSHOT/UAT_jar
rm apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
tar czf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz apache-druid-0.17.0-incubating-SNAPSHOT'
```
Post-build Actions:
You should setup two ssh servers before: test and local-vagrant
Sent build artifacts over shh:
Source files		distribution/target/apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
Remove prefix		distribution/target/
Remote directory		
Exec command:
For testing:
``` 
cd  ..
cd ..
cd /vagrant
tar -xzf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
cd apache-druid-0.17.0-incubating-SNAPSHOT
BUILD_ID=dontKillMe nohup ./bin/start-nano-quickstart &
java -jar UAT.jar
```
For deploy:
```
cd ..
cd ..
cd /vagrant
tar -xzf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
cd apache-druid-0.17.0-incubating-SNAPSHOT
BUILD_ID=dontKillMe nohup ./bin/start-nano-quickstart &```
```
#### User Acceptance Tests
This test is inside  UAT.jar folder. It runs simple data processing pipeline on wikipedia data.

#### Final notes
The best way to start the devops developing of the project is to start from already set uped jenkins image, which could be accessed on request. (some sharing through clouds)
