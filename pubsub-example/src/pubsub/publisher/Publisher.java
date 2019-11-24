package pubsub.publisher;

import pubsub.Message;
import pubsub.service.PubSubService;

/**
 * Publisher interface defines the abstract
 * @method publish() which sends message to PubSub Service.
 */
public interface Publisher {
	// Publishes new message to PubSubService
	void publish(Message message, PubSubService pubSubService);
}
