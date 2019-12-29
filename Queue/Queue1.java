package queue;

public class Queue1 {
	public static void main(String[] args)
	{
		Queue q1=new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);
		q1.enqueue(70);
		q1.enqueue(80);
		q1.enqueue(90);
		q1.enqueue(100);
		
		q1.display();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.enqueue(110);
		
		
		q1.display();
		q1.dequeue();
		q1.enqueue(1);
		q1.display();
		System.out.println(q1.front());
		System.out.println(q1.rear());
	}
}
