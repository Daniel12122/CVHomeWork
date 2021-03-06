package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Candidate;
import entity.Location;
import entity.User;
import entity.Vacancy;

import java.io.IOException;

public class JsonConvert {
    public ObjectMapper objectMapper = new ObjectMapper();

    public String objectToJson(Object obj)  {
        String jsonObject = null;
        try {
            jsonObject = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


    public Candidate getCandidateFrom(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Candidate.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Vacancy getVacancyFrom(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Vacancy.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getUserFrom(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Location getLocationFrom(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Location.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
