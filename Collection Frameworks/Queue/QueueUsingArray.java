//Circular Queue
//Main:  Rear = (Rear +1)%size
public class QueueUsingArray{

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        //enqueue
        public static void add(int data){
            if (isFull()){
                System.out.println("Queue is Full.");
                return;
            }

            //first element case
            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data; 
        }

        //dequeue
        public static int remove (){
            if (isEmpty()){
                System.out.println("Queue is already Empty");
                return -1;
            }
            
            int val = arr[front];
            //single Element conditon
            if (rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            
            return val;
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is already Empty");
                return -1;
            }
            
            int val = arr[front];
            
            return val;
        }
        
        
    }
    public static void main(String args []){    
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove(    ));
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}