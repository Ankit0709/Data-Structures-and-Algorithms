package queue;

public class QueueLinkedListTesting
{
	public static void main(String[] args) {
		QueueLinkedList q1=new QueueLinkedList();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.display();
		q1.dequeue();
		
	}
	

}
