package com.noip.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Anton on 13.08.2018.
 */
@Service
public class TopicService {
    private List<Topic> myTopics = new ArrayList<>(
            Arrays.asList(
                    new Topic("id1", "spring framework", "description1"),
                    new Topic("id2", "user1", "desc2"),
                    new Topic("id3", "next one", "descrip3"),
                    new Topic("id4", "sping", "description4"),
                    new Topic("id5", "spring user", "desc5"),
                    new Topic("id6", "spr text", "descript6"),
                    new Topic("id7", "spring hppt", "descr7"),
                    new Topic("id8", "framework", "descript8")
            ));

    public List<Topic> getMyTopics() {
        return myTopics;
    }

    public Topic getTopic(String id) {

        return myTopics.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void add(Topic topic){
       myTopics.add(topic);
    }
    public void updateTopic(String id, Topic topic){
        for (int i=0; i<myTopics.size();i++){
            Topic t = myTopics.get(i);
            if (t.getId().equals(id)){
                myTopics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        myTopics.removeIf(t -> t.getId().equals(id));
    }
}


