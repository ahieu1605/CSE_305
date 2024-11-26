package Lab6;

public class lowPriorityConcreteCreator implements IrequestCreator {

    @Override
    public request createRequest() {
        IrequestProduct newRequest = new lowPriorityConcrete();
        return newRequest.processRequest();
    }

}
