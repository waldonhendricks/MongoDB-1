# MongoDB

## Start Up
#### data path
- MongoDB's default data path is `\data\db`.
- Make directory befor startup or specify the path.
  ```
  md \data\db
  ```
  or
  ```
  <mongo path>\bin\mongod.exe --dbpath "D:\data\mongo\db"
  ```
- Or specify the dbpath in a configuration file.

#### start up
- run `mongod.exe`
- until `waiting for connections on port 27017`

#### import data
- import data from a json file

 ```
 mongoimport --db <XXX> --collection <XXX> --drop --file <XXX.json>
 ```

## Shell



## Java Driver
- connect to mongoDB client
- get database & get collection

 ```
 MongoClient client = new MongoClient("localhost",27017);

 MongoDatabase db = client.getDatabase("test");

 MongoCollection<Document> collection = db.getCollection("users");
 ```

- close client after processing

 ```
 client.close();
 ```

#### insert
- insert one document

 ```
 collection.insertOne(new Document("name","Jack")
                         .append("sayHello","Hello world!"));
 ```

- insert many document

 ```
 List<Document> documents = new ArrayList<Document>();

 documents.add(new Document("name","Jack1")
        .append("sayHello","Hello world!"));

 documents.add(new Document("name","Jack2")
        .append("sayHello","Hello world!"));

 collection.insertMany(documents);
 ```



