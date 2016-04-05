package mongo.example;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.*;
import org.bson.Document;


/**
 * Created by cavitation on 2016/4/5.
 */
public class MongoQuery {

    public static void main(String[] args) {

        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> coll = db.getCollection("users");


        // query

        Document user = coll.find().first();

        System.out.println(user.toJson());

        System.out.println(coll.find(eq("Id",1)).first().toJson());

        for (Document d : coll.find( and(gt("Id",3) , lt("Id",6)) )) {
            System.out.println(d.toJson());
        }

        for (Document d : coll.find(gt("Id",7)).sort(ascending("zip"))) {
            System.out.println(d.toJson());
        }


        System.out.println(coll.count());


        client.close();

    }


}
