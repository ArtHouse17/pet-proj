package art.backendservice.controller;

import art.backendservice.kafka.KafkaProducer;
import art.backendservice.repository.CoursesRepository;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaProducer kafkaProducer;

    private final CoursesRepository coursesRepository;
    public Controller(KafkaProducer kafkaProducer, CoursesRepository coursesRepository) {
        this.kafkaProducer = kafkaProducer;
        this.coursesRepository = coursesRepository;
    }

    @PostMapping("kafka/send")
    public String send(@RequestParam int id) {
        kafkaProducer.sendMessage(id);
        return "Success";
    }
}
