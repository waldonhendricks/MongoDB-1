package mongo.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

/**
 * Created by cavitation on 2016/4/7.
 */
public class MongoUpdate {

    public static void main(String[] args) {

        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("users");


        Document doc = new Document("$set", new Document("date", "2015/12/23"));

        UpdateResult result = collection.updateOne(eq("name", "Matthew"), doc);

        System.out.println(collection.find(eq("name", "Matthew")).first().toJson());

        client.close();


    }


}
