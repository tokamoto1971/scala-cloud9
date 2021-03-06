wget http://downloads.typesafe.com/scala/2.11.5/scala-2.11.5.tgz
tar xvf scala-2.11.5.tgz
mv scala-2.11.5 ../scala-2.11.5
wget https://services.gradle.org/distributions/gradle-2.14-all.zip
unzip gradle-2.14-all.zip
mv gradle-2.14 ../

export SCALA_HOME="$HOME/scala-2.11.5"
export GRADLE_HOME="$HOME/gradle-2.14"
export PATH="$PATH:$SCALA_HOME/bin:$GRADLE_HOME/bin"

gradle run