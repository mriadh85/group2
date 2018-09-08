package ConnectToMongo;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ConnectToMongoDB {

    public static MongoDatabase mongoDatabase = null;

    public static MongoDatabase connectToMongoDB(){
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("Rifat");
        System.out.println("DataBase Connected");

        return  mongoDatabase;
    }

    public static String insertToMongoDB(User user){
        String profile = user.getStudentName();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("Table");
        Document document = new Document().append("studentName",user.getStudentName()).append("studentID",user.getStudentID()).append("studentDOB",user.getStudentDOB()
        );


        collection.insertOne(document);
        return profile + "has been registerd";

    }
    public static List<User> readFromMongoDB(){
        List<User> list = new ArrayList<User>();
        User user =  new User();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection("Table");
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for (Document doc:iterable ) {
            String id = "";
            int idInt = 0;
            String studentName = (String)doc.get("studentName");
            user.setStudentName(studentName);
            String studentID = (String)doc.get("studentID");
            user.setStudentID(studentID);
            String studentDOB = (String)doc.get("studentDOB");
            user.setStudentDOB(studentDOB);
            user = new User(studentName,studentID,studentDOB);
            list.add(user);
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        insertToMongoDB(new User("Rifat","200","10/05/2000"));
        List<User> user = readFromMongoDB();
        for (User person:user ) {
            System.out.println(person.getStudentName()+ " " + person.getStudentID()+ " "+ person.getStudentDOB());
            System.out.println("Congrats you passed the test");

        }

    }

}
