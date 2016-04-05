import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by cavitation on 2016/4/5.
 */
public class MongoConnection {

    public static void main(String[] args) {

        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> coll = db.getCollection("users");


        Document user = coll.find().first();

        System.out.println(user.toJson());
        
        client.close();

    }


}
