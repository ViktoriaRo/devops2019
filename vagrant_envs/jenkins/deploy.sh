cd ..
cd ..
cd /vagrant
tar -xzf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
cd apache-druid-0.17.0-incubating-SNAPSHOT
BUILD_ID=dontKillMe nohup ./bin/start-nano-quickstart &