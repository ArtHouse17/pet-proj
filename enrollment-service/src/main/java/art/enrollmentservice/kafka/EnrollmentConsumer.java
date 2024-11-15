package art.enrollmentservice.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentConsumer {

    @KafkaListener(topics = "art.backendservice", groupId = "courses")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
    }
}
