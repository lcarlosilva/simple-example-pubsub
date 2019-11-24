package pubsub.subscriber;

import pubsub.service.PubSubService;

/**
 * SubscriberImpl class extends Subscriber and implements the abstract methods mentioned above.
 * @author luiz
 *
 */
public class SubscriberImpl extends Subscriber {

	//Add subscriber with PubSubService for a topic
	@Override
	public void addSubscriber(String topic, PubSubService pubSubService) {
		pubSubService.addSubscriber(topic, this);

	}

	//Unsubscribe subscriber with PubSubService for a topic
	@Override
	public void unSubscribe(String topic, PubSubService pubSubService) {
		pubSubService.removeSubscriber(topic, this);

	}

	//Request specifically for messages related to topic from PubSubService
	@Override
	public void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService) {
		pubSubService.getMessagesForSubscriberOfTopic(topic, this);

	}

}
