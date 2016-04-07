package mongo.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

/**
 * Created by cavitation on 2016/4/7.
 */
public class MongoDelete {

    public static void main(String[] args) {

        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("users");

        DeleteResult result1 = collection.deleteOne(eq("Id", 14));

        System.out.println(result1.getDeletedCount());

        DeleteResult result2 = collection.deleteMany(gt("Id", 11));

        System.out.println(result2.getDeletedCount());

        client.close();

    }

}
