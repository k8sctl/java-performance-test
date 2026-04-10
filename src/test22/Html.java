package test22;

public class Html {

    String body;

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= 2000 ; i++) {
            sb.append(body);
        }
        return sb.toString();
    }
}
