# sdet-essentials

Download and Install an IDE, for example I'm using IntelliJ Community Edition

## Install OpenJDK
```bash
curl https://download.java.net/java/GA/jdk19.0.2/fdb695a9d9064ad6b064dc6df578380c/7/GPL/openjdk-19.0.2_macos-aarch64_bin.tar.gz \
  -o /tmp/.
tar -xvf /tmp/openjdk-19.0.2.tar.gz
sudo mv /tmp/jdk-19.0.2.jdk /Library/Java/JavaVirtualMachines/
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-19.0.2.jdk/Contents/Home
echo 'PATH=$PATH:$JAVA_HOME' > ~/.zshrc  
java --version
```


## Install Maven

```
brew install maven
mvn --version
```

## Building the Project
```agsl
mvn clean install
```

## Executing End-to-End Tests
```bash
mvn test
```
