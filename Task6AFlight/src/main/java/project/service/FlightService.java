package project.service;

public interface FlightService {
    void getFlightId(long id);
    void getDestination(long id);
    void getModelAirplane(long id);
    void getAirplaneStatus(long id);
    void getAverageFlightTime(long id);
    void getCurbWeight(long id);
    void getFuelQuantity(long id);
    void getSedToDestination(long id, String destinationNew);
    void getRepair(long id);
    void getRefuel(long id, int count);
    void getLoad(long id, int count);
    void getUnload(long id, int count);
    void getValue(long id);
}
