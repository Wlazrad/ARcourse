package GeneratorXML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Document;


public class XMLDateGenerator {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        for (int x = 1; x<61;x++){
            User u = new User();

            u.setEmail("testuser"+x+"@formxml"+x+".pl");
            u.setPassword("#TestPass"+x);
            u.setName("UserXML"+x);
            u.setLastName("UserXML"+x);
            u.setActive(1);
            u.setNrRoli(2);

            userList.add(u);

        }

        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);
            for (int i = 0; i< userList.size(); i++){
                Element user = doc.createElement("user");
                rootElement.appendChild(user);

                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(userList.get(i).getEmail()));
                user.appendChild(email);

                Element password = doc.createElement("password");
                password.appendChild(doc.createTextNode(userList.get(i).getPassword()));
                user.appendChild(password);

                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(userList.get(i).getName()));
                user.appendChild(name);

                Element lastName = doc.createElement("lastname");
                lastName.appendChild(doc.createTextNode(userList.get(i).getLastName()));
                user.appendChild(lastName);

                Element active = doc.createElement("active");
                active.appendChild(doc.createTextNode(String.valueOf(userList.get(i).getActive())));
                user.appendChild(active);

                Element nrRoli = doc.createElement("nrroli");
                nrRoli.appendChild(doc.createTextNode(String.valueOf(userList.get(i).getNrRoli())));
                user.appendChild(nrRoli);

            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult restult = new StreamResult(new File("C:\\test\\userdata.xml"));
            transformer.transform(source,restult);

            System.out.println("File saved");

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
