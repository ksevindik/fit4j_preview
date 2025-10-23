package com.fit4j.kafka

import com.fit4j.annotation.FIT
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.kafka.test.context.EmbeddedKafka
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.TestPropertySource

class KafkaTopicCleanerTestSuite {
    @Nested
    @FIT
    @TestPropertySource(properties = ["fit4j.kafka.topicCleaner.enabled=true"])
    @EmbeddedKafka
    @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
    inner class KafkaTopicCleanerEnabledFIT {
        @Autowired
        private lateinit var applicationContext: ApplicationContext

        @Test
        fun `kafka topic cleaner bean should exist`() {
            applicationContext.getBeansOfType(KafkaTopicCleaner::class.java).let { beansMap ->
                assert(beansMap.isNotEmpty()) { "KafkaTopicCleaner bean should exist" }
            }
        }
    }

    @Nested
    @FIT
    @TestPropertySource(properties = ["fit4j.kafka.topicCleaner.enabled=false"])
    @EmbeddedKafka
    @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
    inner class KafkaTopicCleanerDisabledFIT {
        @Autowired
        private lateinit var applicationContext: ApplicationContext

        @Test
        fun `kafka topic cleaner bean should not exist`() {
            applicationContext.getBeansOfType(KafkaTopicCleaner::class.java).let { beansMap ->
                assert(beansMap.isEmpty()) { "KafkaTopicCleaner bean should not exist" }
            }
        }
    }
}