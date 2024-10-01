package Adapter;

public class Client2Adapter implements Adapter{
    private Client2 client;
    private Client2Adapter(){}  // To ensure Adapter is passed the client
    public Client2Adapter(Client2 client) {
        this.client = client;
    }
    @Override
    public void performOperation() {
        client.doOperation();
    }

    public Client2 getClient() {
        return client;
    }

    public void setClient(Client2 client) {
        this.client = client;
    }
}