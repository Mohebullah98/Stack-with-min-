import java.util.Stack;
class minStack extends Stack<Integer>{
  public Stack<Integer> s2;
  public minStack(){
    s2 = new Stack<Integer>();
  }
  public void push(int a){
    if(a<min()) s2.push(a);//2nd stack keeps track of min elements
    super.push(a);
  }
  public Integer pop(){
    if(super.peek()==min()){
      s2.pop();//only pop 2nd stack if pop=min element
    }
    return super.pop();
  }
  public int min(){
    if(s2.isEmpty()) return Integer.MAX_VALUE;//if stack is empty then should add element
    return s2.peek();
  }
}