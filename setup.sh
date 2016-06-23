wget http://downloads.typesafe.com/scala/2.11.5/scala-2.11.5.tgz
tar xvf scala-2.11.5.tgz
mv scala-2.11.5 ../scala-2.11.5
wget https://services.gradle.org/distributions/gradle-2.14-all.zip
unzip gradle-2.14-all.zip
mv gradle-2.14 ../

SCALA_HOME="$HOME/scala-2.11.5"
GRADLE_HOME="$HOME/gradle-2.14"
PATH="$PATH:$SCALA_HOME/bin:$GRADLE_HOME/bin"

gradle init --type scala-library
mv hello-world.scala src/main/scala/
mv build.gradle.tmp build.gradle
