package com.noip.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Anton on 13.08.2018.
 */
@RestController
@EnableAutoConfiguration
public class TopicController {
    @Autowired
    private TopicService topicService;
@RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics(){
        return topicService.getMyTopics();
    }
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @RequestMapping (value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.add(topic);
    }
    @RequestMapping (value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }
    @RequestMapping (value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
