package pubsub;

/**
 * 
 * Message class is a simple POJO class to represent the messages. It has topic
 * attribute (for this subscriber is interested) and an attribute for message
 * payload.
 * 
 * @author luiz
 *
 */
public class Message {

	private String topic;
	private String payload;
	
	public Message() {}

	public Message(String topic, String payload) {
		super();
		this.topic = topic;
		this.payload = payload;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
