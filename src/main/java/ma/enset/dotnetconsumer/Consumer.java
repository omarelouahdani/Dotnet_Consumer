package ma.enset.dotnetconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "clients",groupId = "sample_consumer")
    public void onMessage(ConsumerRecord message){
        System.out.println("Receiving message key=>"+message.key()+"" +
                " , Value=>"+message.value());
    }
}
