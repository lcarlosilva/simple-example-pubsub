package pubsub.publisher;

import pubsub.Message;
import pubsub.service.PubSubService;

/**
 * PublisherImpl class implements Publisher interface and implements publish
 * method, which sends the message to PubSubService.
 */
public class PublisherImpl implements Publisher {

	// Publishes new message to PubSubService
	@Override
	public void publish(Message message, PubSubService pubSubService) {
		pubSubService.addMessageToQueue(message);
	}

}
