# SpringBootWithMongoDBInDocker

Deploying docker on ec2 instance(Amazon linux)
    
    -> sudo yum install docker -y
    
    -> sudo service docker start
    
    -> sudo usermod -aG docker ec2-user
    
you need to relogin to work with docker


Pull image from Docker Hub or use Kitematic to get the image


Command to pull mongo from docker hub

        -> docker pull mongo
            
Command to build the image using dockerfile
    
        -> docker image build -t aruntcs2005/springmongo .
        
login from your local docker to docker hub
        
        -> docker login
        
It will ask for username and password of the docker hub.
use the below command to push the repo
        
        -> docker push aruntcs2005/springmongo
 
login to ec2 instance, where docker is already installed.
we need to create a network for both the mongo db and app to get a bridge
        
        -> docker network ls
        
it will give you a list of default network
you need to create a network of your own, where you need to add both the 
app and mongo database.
        
        -> docker network create my-network.
        
commands to add mongo db to created network
        
        -> docker container run --network my-network --name mongodb -p 27017:27017 mongo
        
        the name of the mongo db acts as a dns name and can be used in the property t
        
        -> docker container run --network my-network --name springmongo -p 6015:6015 aruntcs2005/springmongo
        
the above command will pull the image from docker hub


The IP of the EC2 instance can be used to access the APP, once the security group inbound allows 
6015.    
    
Mongo specific libraries
    
    
    package com.arun.springbootmangodb.model;
    
    import com.fasterxml.jackson.annotation.JsonIgnore;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.Setter;
    import org.bson.types.ObjectId;
    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;
    
    @Getter
    @Setter
    @AllArgsConstructor
    @Document
    public class Author {
    
        @Id
        @JsonIgnore
        private ObjectId id;
        private String name;
        private String age;
        private String address;
    }

    
    
    
    
    

   