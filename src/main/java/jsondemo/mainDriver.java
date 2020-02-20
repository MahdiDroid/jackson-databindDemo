package jsondemo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class mainDriver {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Student thestudent =
                    mapper.readValue(new File("data/sample-lite.json"),Student.class);
            System.out.println("fistName : " + thestudent.getFirstName() +
                                "\nlastName : " + thestudent.getLastName());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
