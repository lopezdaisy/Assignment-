public class main{
public Static void mail (String []args){
Mmustlinkedin mmust=new Mmustlinked();
 mmust.addfirst(15);
 mmust.addlast(6);
 System.out.println(mmust.removeFirst());
 System.out.println(mmust.removeLast());
 System.out.println(mmust.size());
 System.out.println(mmust.isEmpty());

Stack stack=new Stack();
 stack.push(7);
 System.out.println(stack.pop());
 System.out.println(stack.peek());
 System.out.println(stack.size());
 System.out.println(stack.isEmpty());

Queue q= new Queue();
 q.enqueue(16);
System.out.println(q.dequeue());
System.out.println(q.peek());
System.out.println(q.size());
System.out.println(q.isEmpty());
}
}
