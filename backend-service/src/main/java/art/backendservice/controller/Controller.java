package art.backendservice.controller;

import art.backendservice.kafka.KafkaProducer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaProducer kafkaProducer;


    public Controller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("kafka/send")
    public String send(@RequestParam int id) {
        kafkaProducer.sendMessage(id);
        return "Success";
    }
}
