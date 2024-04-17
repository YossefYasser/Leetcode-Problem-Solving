class MyCircularQueue {
         int[] arr;
         int front =-1;
         int rear =-1;
         int k;
    public MyCircularQueue(int k) {
       int[] array= new int[k];
       arr=array;
       this.k=k;
       

    }
    
    public boolean enQueue(int value) {
      

        if(isFull())
            return false;
        else if(isEmpty())
            front=rear=0;
        else
        { 
           
            rear++;
           
        }
         arr[rear%k] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        else if ( rear== front)
           {
            front=rear=-1;
           }

        else 
         front++;
        
        


        return true;

    }
    
    public int Front() {
          if(!isEmpty())
            
           return arr[front%k];
           else return -1;
    }
    
    public int Rear() {
        if(!isEmpty())
           return arr[rear%k];
            else return -1;
    }
    
    public boolean isEmpty() {
           return (rear == -1 &&front == -1);
    }
    
    public boolean isFull() {
              
           return ((rear+1)%k == front);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */