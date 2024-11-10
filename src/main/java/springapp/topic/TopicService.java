package springapp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics =Arrays.asList(
            new Topic("Spring","Spring Framework","Spring Description"),
            new Topic("Gin","Golang Framework","Gin Description"),
            new Topic("Node js","JS Framework","JS description")
            );
    public List<Topic> getTopics(){
        return topics;
    }
}
