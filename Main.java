class Main {
  public static void main(String[] args) {
    minStack s = new minStack();
    s.push(5);
    s.push(3); 
    System.out.print(s.toString()+ " Min is "+s.min()); 
    s.push(7);
    s.push(6);
    s.push(2);
    System.out.print("\n"+s.toString()+ " Min is "+s.min());
    s.push(1);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.print("\n"+s.toString()+ " Min is "+s.min());
  }
}