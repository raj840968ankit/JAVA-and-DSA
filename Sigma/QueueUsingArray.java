import java.util.*;
class queue{
    int n=3,front,rear;
    int queue[]=new int[n];
    Scanner sc=new Scanner(System.in);
    queue(){
        front=rear=-1;
    }
    void enqueue()
    {
        int x;
        if((rear+1)%n==front)
        {
            System.out.println("Queue is full");
            return;
        }
        else if(front==-1&&rear==-1)
        {
           System.out.print("Enter element to queue: ");
           x=sc.nextInt();
           front=rear=0;
           queue[rear]=x;
           return;
        }
        else{
            System.out.print("Enter element to Queue: ");
            x=sc.nextInt();
            rear=(rear+1)%n;
            queue[rear]=x;
        }
    }
    void dequeue(){
        if(front==-1&&rear==-1)
        {
            System.out.println("Queue is empty\n");
            return;
        }
        else if(front==rear)
        {
            System.out.println("Dequeued element is "+queue[front]);
            front=rear=-1;
            return;
        }
        else{
            System.out.println("Dequeued element is "+queue[front]);
            front=(front+1)%n;
        }
    }
    void peek(){
        if(rear==-1&&front==-1)
        {
            System.out.println("Queue is empty\n");
            return;
        }
        else{
            System.out.println("peek element is "+queue[front]);
        }
    }
    void display()
    {
        if(rear==-1&&front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        else{
            System.out.print("front <-  ");
            int i=front;
            while(i!=rear)
            {
                System.out.print(queue[i]+",1 ");
                i=(i+1)%n;
            }
            System.out.print(queue[i]);
            System.out.println(" <- rear");
        }
    }
    
}
public class QueueUsingArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        queue q=new queue();
        System.out.println("Queue size =3");
        char ch1;
        do{
            System.out.println("Option:-\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Display");
            System.out.println("Enter your choice: ");
            int ch2=sc.nextInt();
            switch(ch2)
            {
                case 1: q.enqueue();
                        break;
                case 2: q.dequeue();
                        break;     
                case 3: q.peek();
                        break; 
                case 4: q.display();
                        break;
                default:
                        System.out.println("Invalid option"); 

            }
            System.out.println("Do you want to continue: (y/n)");
            ch1=sc.next().charAt(0);
        }while(ch1=='y');
        sc.close();
    }
}