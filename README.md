# SpringBootWithMongoDBInDocker


Pull image from Docker Hub or use Kinematic to get the image

    docker pull mongo
    
    This command runs the mongodb on port 27017
    
    docker run -p 27017:27017 -d mongo
    
    
    Specify the port and url of the MongoDB in applicationproperties.
    
    
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

    