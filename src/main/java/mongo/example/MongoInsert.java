package mongo.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang Chi-Chang on 2016/4/6.
 */
public class MongoInsert {

    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("test");

        MongoCollection<Document> collection = db.getCollection("users");


        Document doc = new Document("Id",11)
                .append("name","Anderson")
                .append("phone","1-849-642-8797")
                .append("zip", 29131)
                .append("city","Glovertown")
                .append("date","2015/04/06");

        collection.insertOne(doc);


        List<Document> documents = new ArrayList<Document>();
        documents.add(new Document("Id",12)
                .append("name","Matthew")
                .append("phone","0972-939-397")
                .append("zip", 29131)
                .append("city","Glovertown")
                .append("date","2015/12/23"));

        documents.add(new Document("Id",13)
                .append("name","Kevin")
                .append("phone","1-852-782-8797")
                .append("zip", 5898)
                .append("city","Huntly")
                .append("date","2014/12/23"));

        documents.add(new Document("Id",14)
                .append("name","Nick")
                .append("phone","1-832-648-8567")
                .append("zip", 5898)
                .append("city","Huntly")
                .append("date","2016/01/23"));



        collection.insertMany(documents);

        client.close();


    }

}
