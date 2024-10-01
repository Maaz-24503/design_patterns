package Adapter;

public class Client1Adapter implements Adapter{
    private Client1 client;
    private Client1Adapter(){}  // To ensure Adapter is passed the client
    public Client1Adapter(Client1 client) {
        this.client = client;
    }
    @Override
    public void performOperation() {
        client.operation();
    }

    public Client1 getClient() {
        return client;
    }

    public void setClient(Client1 client) {
        this.client = client;
    }
}
