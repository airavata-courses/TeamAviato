echo 'starting installation process' >> /var/log/sga-teamaviato-StormClustering-install.log
#cd '/home/ec2-user/stormclustering'

rm -r /home/ec2-user/stormClustering
mv /home/ec2-user/StormClustering  /home/ec2-user/stormClustering
cd /home/ec2-user/stormClustering/
chmod 777 stormclustering
cd stormclustering

docker build -t scluster_img .
docker run -d --net mynet123 --ip 172.18.0.32 -p 31000:31000 --name api-sclustering scluster_img >> sga-teamaviato-StormClustering-docker-server.log 2>&1 &
