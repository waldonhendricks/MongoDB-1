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


        Document doc = new Document("name","Jason")
                .append("no","r03525666")
                .append("gender","male");

        collection.insertOne(doc);


        List<Document> documents = new ArrayList<Document>();
        documents.add(new Document("name","Jessica")
                .append("age","21")
                .append("no","r03525777")
                .append("gender","female"));

        documents.add(new Document("name","Eric")
                .append("age","22")
                .append("no", "r03525888")
                .append("gender", "male"));

        documents.add(new Document("name","Jimmy")
                .append("age","26")
                .append("no", "r03525999")
                .append("gender", "male"));

        collection.insertMany(documents);

        client.close();


    }

}
