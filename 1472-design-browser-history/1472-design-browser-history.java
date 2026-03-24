class BrowserHistory {
    class Node{
        String url;
        Node prev;
        Node nxt;
        Node(String url){
            this.url=url;
            prev=null;
            nxt=null;
        }
    }
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        curr.nxt=nn;
        nn.prev=curr;
        curr=nn;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps>0){
            curr=curr.prev;
            steps-=1;
        }
        return curr.url;
        
    }
    
    public String forward(int steps) {
        while(curr.nxt!=null && steps>0){
            curr=curr.nxt;
            steps-=1;
        }
        return curr.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */