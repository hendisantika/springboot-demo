# springboot-demo
Spring Boot 2 Demo Application

## Unauthorize Request

```
$ curl -XPOST -H 'Content-type: application/json' -d '{"firstname": "Uzumaki","lastname":"Naruto"}' http://localhost:8080/person/hello
```

## Authorize Request

```
curl -XPOST -H 'Content-type: application/json' -d '{"firstname": "Uzumaki","lastname":"Naruto"}' http://admin:passw0rd@localhost:8080/person/hello
```

## Configure the Droplet for SpringBoot Web App

**Install JRE in the Droplet**

Run the following commands (This needs to be run from the terminal we used to ssh into the Droplet)

```shell
sudo apt update
sudo apt install openjdk-8-jre-headless
java -version
```

## Copy Artifacts into the Droplet

We’ll copy the JAR into /artifact directory and copy the systemd service file to /etc/systemd/system directory

Create a directory named artifact in the root directory of the Droplet

`mkdir /artifact`

Now copy the JAR and the systemd service file into the Droplet. Open a new terminal window on your local system and run
the following command (Again replace the IP in bold with the public IP of your Droplet)

```shell
scp -i key/id_rsa target/spring-boot2-demo-0.0.1-SNAPSHOT.jar root@157.245.100.221:/artifact
scp -i key/id_rsa spring-boot.service root@157.245.100.221:/etc/systemd/system
```

## Run and Test the SpringBoot Web App

**Run the SpringBoot Web App**

Start the service (This needs to be run from the terminal we used to ssh into the Droplet)

```shell
systemctl start spring-boot.service
```

## Bonus (Optional Step):

You can make sure to bring the service up in case of a Droplet restart, by using the following command in the Droplet (
Run in the ssh session).

```shell
systemctl enable spring-boot.service
```

See [Spring Boot Rest Tutorial](https://octoperf.com/blog/2018/02/22/spring-boot-rest-tutorial/).