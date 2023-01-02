#/bin/bash

function log()
{
    msg=$1
    echo $msg >> /bk/jenkins/1.log
}

log "`date` ------ deploy start"
pid=`ps -ef | grep java | grep api-server | awk '{print $2}'`
if [ ! $pid ]; then 
  log "api-server not exists"
else
  log "pid=$pid"
fi
kill -9 $pid
sleep 5

APP_HOME=/work/projects/lab-41-demo01/build
cd $APP_HOME
JAR_NAME=`ls *.jar`
nohup java -jar $JAR_NAME &
log "`date` ------ deploy end"
