package guru.learning.kafka.examples;

class AppConfigs {

    final static String applicationID = "CountingWindowApp";
    final static String bootstrapServers = "localhost:9092,localhost:9093,localhost:9095";
    final static String posTopicName = "simple-invoice";
    final static String stateStoreName = "tmp/state-store";
}
