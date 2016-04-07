package mongo.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import org.bson.Document;

/**
 * Created by cavitation on 2016/4/7.
 */
public class MongoDelete {

    public static void main(String[] args) {

        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("users");

//        collection.deleteOne();

        client.close();

    }

}
