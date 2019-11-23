
mvn clean install -DskipTests -Pdist -Dgpg.skip
cd distribution/target
tar -xzf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
mv ../../zk apache-druid-0.17.0-incubating-SNAPSHOT/zk
rm apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz
tar czf apache-druid-0.17.0-incubating-SNAPSHOT-bin.tar.gz apache-druid-0.17.0-incubating-SNAPSHOT

