package utils;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 * Classname ReadFromKafka
 * Description TODO
 * Date 2020/8/19 17:39
 * Created by LanKorment
 */
public class ReadFromKafka {

    public static void main(String[] args){
        //StringBuffer buff = kafka2stringbuff();
        //String[] strarr = data2str(buff);
        //parse(strarr);

        ReadFromKafka readFromKafka = new ReadFromKafka();
        readFromKafka.kafka2stringbuff();
    }

    public static void kafka2stringbuff(){
        String topicName = "test5";
        String groupId = "group1";
        //构造java.util.Properties对象
        Properties props = new Properties();
        // 必须指定属性。
        //props.put("bootstrap.servers", "172.18.101.14:9092,172.18.101.13:9092,172.18.101.22:9092");
        //props.put("zookeeper.connect", "172.18.101.21:2181,172.18.101.13:2181,172.18.101.22:2181");
        props.put("bootstrap.servers", "localhost:9092");
        props.put("zookeeper.connect", "localhost:2181");
        // 必须指定属性。
        props.put("group.id", groupId);
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        // 从最早的消息开始读取
        props.put("auto.offset.reset", "earliest");
        // 必须指定
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        // 必须指定
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        // 使用创建的Properties实例构造consumer实例
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        // 订阅topic。调用kafkaConsumer.subscribe方法订阅consumer group所需的topic列表
        consumer.subscribe(Arrays.asList(topicName));

        StringBuffer buff = new StringBuffer();
        String mess = "";

        try {
            String path = "D:\\WorkSpace\\data&note";
            File file = new File(path);
            //进程在此处会一直等待kafka生成新的消息，所以下面的任务不会执行
            while (true) {

                //循环调用kafkaConsumer.poll方法获取封装在ConsumerRecord的topic消息。
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
                //获取到封装在ConsumerRecords消息以后，处理获取到ConsumerRecord对象。
                FileWriter fw = new FileWriter(file + "/output", true);
                for (ConsumerRecord<String, String> record : records) {
                    //简单的打印输出,一行数据为一条消息
                    //mess = record.value();
                    //buff.append(mess + "\n");
                    System.out.println("offset = " + record.offset() + ",key = " + record.key() + ",value =" + record.value());
                    fw.write(record.value()+"\n");
                    fw.flush();
                }
                fw.close();
            }
        } catch (Exception e) {
            System.out.println("消息消费异常结束......");
            consumer.close();
        }
        System.out.println(mess);
        //consumer.close();
    }
}
