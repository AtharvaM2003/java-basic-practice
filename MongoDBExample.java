import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBExample {
    public static void main(String[] args) {
        // Set the MongoDB URI (connection string)
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");

        // Create a MongoDB client
        MongoClient mongoClient = new MongoClient(uri);

        // Access a specific database
        MongoDatabase database = mongoClient.getDatabase("simple");

        System.out.println("Connected to MongoDB!");

        // Close the client when you're done
        mongoClient.close();
    }
}
